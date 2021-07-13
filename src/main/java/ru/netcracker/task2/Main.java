package ru.netcracker.task2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        DiceGameImp diceGameImp = new DiceGameImp();
        Player player1 = new Player(1, "Me", "Me", "Me");
        Player player2 = new Player(2, "Killer", "Kirill", "Volkov");
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите количество игроков.");
        int playersCount = sc.nextInt();
        System.out.println("Введите количество игральных костей.");
        int dicesCount = sc.nextInt();
        //DiceGameImp diceGameImp = new DiceGameImp(playersCount, dicesCount);

    }
}
