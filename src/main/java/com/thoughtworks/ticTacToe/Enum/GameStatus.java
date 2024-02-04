package com.thoughtworks.ticTacToe.Enum;

public enum GameStatus {
    WonGame("Won the Game"),
    GameOver("Game Over"),
    GameInProgress("Game in progress");

    private final String status;

    GameStatus(String status) {
        this.status = status;
    }
    @Override
    public String toString() { return status; }

}
