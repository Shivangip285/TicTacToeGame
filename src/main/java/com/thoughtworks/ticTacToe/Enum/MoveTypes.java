package com.thoughtworks.ticTacToe.Enum;


public enum MoveTypes {
    X(5),
    O(4);
    private int value;

    MoveTypes(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
    public void setValue(int value) {
        this.value = value;
    }
}
