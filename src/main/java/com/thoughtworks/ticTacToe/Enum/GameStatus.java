package com.thoughtworks.ticTacToe.Enum;

public enum GameStatus {
    WonGame("Won the Game"),
    GameOver("Game Over"),
    GameInProgress("Game in progress");

    private final String value;

    GameStatus(String sortType) {
        this.value = sortType;
    }
    @Override
    public String toString() { return value; }

}
