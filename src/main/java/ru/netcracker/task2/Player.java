package ru.netcracker.task2;

public class Player {

    private final int playerId;
    private final String nickName;
    private final String firstName;
    private final String lastName;

    public Player(int playerId, String nickName, String firstName, String lastName) {
        this.playerId = playerId;
        this.nickName = nickName;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public int getPlayerId() {
        return playerId;
    }

    public String getNickName() {
        return nickName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    @Override
    public String toString() {
        return "Player{" +
                "playerId=" + playerId +
                ", nickName='" + nickName + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}
