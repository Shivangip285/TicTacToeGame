package com.thoughtworks.ticTacToe.user;

import com.thoughtworks.ticTacToe.Enum.GameStatus;
import com.thoughtworks.ticTacToe.gameBoard.Cell;
import com.thoughtworks.ticTacToe.Enum.MoveStatus;
import com.thoughtworks.ticTacToe.Enum.MoveTypes;
import com.thoughtworks.ticTacToe.gameBoard.Board;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class PlayerX extends Player{
    private String name;

    private int moveTypeBalance=5;

    private Board board;

    public PlayerX(String name,  Board board) {
        this.name = name;
        this.board = board;
    }

    public MoveStatus playMoveForPlayer(Cell cell){
        MoveStatus moveStatus = board.updateGridCellWith_X_OR_O(cell, String.valueOf(MoveTypes.X));
        if(moveStatus.equals(MoveStatus.ValidMove)){
            moveTypeBalance-=1;
        }
        if(board.gridStatus().equals(GameStatus.WonGame)){
            System.out.println(name+" "+board.gridStatus().toString());
        }
        return moveStatus;
    }
}
