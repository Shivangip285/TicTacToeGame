package com.thoughtworks.ticTacToe.user;

import com.thoughtworks.ticTacToe.gameBoard.Cell;
import com.thoughtworks.ticTacToe.Enum.MoveStatus;

public abstract class Player {
    public abstract MoveStatus playMoveForPlayer(Cell cell);
}
