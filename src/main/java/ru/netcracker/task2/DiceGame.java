package ru.netcracker.task2;

import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;

public interface DiceGame {
    //задаёт значения костей, которые выпали в одном раунде каждому игроку.
    void playRound();

    String playGame();

    Player getWinnerOfRound();

    boolean isTheEnd();
}
