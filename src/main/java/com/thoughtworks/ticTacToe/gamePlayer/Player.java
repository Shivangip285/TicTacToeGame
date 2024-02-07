package com.thoughtworks.ticTacToe.gamePlayer;

import com.thoughtworks.ticTacToe.Enum.GameStatus;
import com.thoughtworks.ticTacToe.Enum.MoveTypes;
import com.thoughtworks.ticTacToe.gameEntity.gameBoard.Board;
import com.thoughtworks.ticTacToe.gameEntity.gameBoard.Cell;
import com.thoughtworks.ticTacToe.Enum.MoveStatus;

public class Player {
    private String name;
    private MoveTypes moveType;

    private Board board;

    public Player(String name, MoveTypes moveType, Board board) {
        this.name = name;
        this.moveType = moveType;
        this.board = board;
    }

    public MoveStatus playMoveForPlayer(Cell cell){
        MoveStatus moveStatus = board.updateGridCellWith_X_OR_O(cell, String.valueOf(moveType));
        if(moveStatus.equals(MoveStatus.ValidMove)){
            moveType.setValue(moveType.getValue()-1);
        }
        if(board.gridStatus().equals(GameStatus.WonGame)){
            System.out.println(name+" "+board.gridStatus().toString());
        }
        return moveStatus;
    }

}
