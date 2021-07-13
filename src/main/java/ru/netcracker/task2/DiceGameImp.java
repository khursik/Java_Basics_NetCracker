package ru.netcracker.task2;

import java.util.*;

public class DiceGameImp implements DiceGame {
    //мапа в которой ключи - игроки, а значения - это список со значениями костей, которые выпали у игрока.
    private final HashMap<Player, List<Integer>> allPlayersDices;
    //мапа в которой ключи - игроки, а значения - это количество их побед в раундах.
    private final HashMap<Player, Integer> playersPointsForAllRounds;

    public DiceGameImp() {
        this.allPlayersDices = new LinkedHashMap<>();
        this.playersPointsForAllRounds = new HashMap<>();
    }

    @Override
    public void playRound() {
        Random random = new Random();
        for (Player player : allPlayersDices.keySet()) {
            for (Integer dice : allPlayersDices.get(player)) {
                dice = random.nextInt(6) + 1;
            }
        }
        int winnerPoints = playersPointsForAllRounds.get(getWinnerOfRound());
        winnerPoints += 1; //т.к. победил в текущем раунде
    }

    @Override
    public String playGame() {
        while (!isTheEnd()) {
            playRound();
        }
        return getWinnerOfRound().toString();
    }

    @Override
    public Player getWinnerOfRound() {
        Player winner = null;
        int sum = 0;
        int maxSum = 0;
        for (Player player : allPlayersDices.keySet()) {
            for (int value : allPlayersDices.get(player)) {
                sum += value;
            }
            if (sum > maxSum) {
                maxSum = sum;
                winner = player;
            }
        }
        if (winner == null) {
            return new Player(1, "Me", "Me", "Me");
        }
        return winner;
    }

    @Override
    public boolean isTheEnd() {
        for (Integer value : playersPointsForAllRounds.values()) {
            if (value == 7) {
                return true;
            }
        }
        return false;
    }

}
