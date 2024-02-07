package com.thoughtworks.ticTacToe.gameEntity.gameBoard;

import com.thoughtworks.ticTacToe.Enum.GameStatus;
import com.thoughtworks.ticTacToe.Enum.MoveStatus;

import static com.thoughtworks.ticTacToe.Enum.GameStatus.GameInProgress;
import static com.thoughtworks.ticTacToe.Enum.GameStatus.WonGame;

public class Board {
    private final int gridDimension=3;
    public Cell[][] gridStructure=new Cell[gridDimension][gridDimension];

    public Board() {
        for (int i = 0; i < gridDimension; i++) {
            for (int j = 0; j < gridDimension; j++) {
                gridStructure[i][j]= Cell.builder().xCoordinate(i).yCoordinate(j).build();
            }
        }
        this.gridStructure = gridStructure;
    }

    public MoveStatus updateGridCellWith_X_OR_O(Cell cellCoordinate, String value){
        if(gridStructure[cellCoordinate.getXCoordinate()][cellCoordinate.getYCoordinate()].getValue().equals("_")) {
            gridStructure[cellCoordinate.getXCoordinate()][cellCoordinate.getYCoordinate()] = Cell.builder().value(value).build();
            return MoveStatus.ValidMove;
        }
        return MoveStatus.InvalidMove;
    }

    public GameStatus gridStatus(){
        int score=0;
        for(int i=0;i<gridDimension;i++){
            if(!gridStructure[i][0].getValue().equals("_") && gridStructure[i][0].equals(gridStructure[i][1]) && gridStructure[i][1].equals(gridStructure[i][2])){
                score=1;
            }
            if(!gridStructure[0][1].getValue().equals("_") && gridStructure[0][i].equals(gridStructure[1][i]) && gridStructure[1][i].equals(gridStructure[2][i])){
                score=1;
            }
        }
        showGridStatus();
        return score==1?WonGame:GameInProgress;
    }

    private void showGridStatus() {
        for (int i = 0; i < gridDimension; i++) {
            for (int j = 0; j < gridDimension; j++) {
                System.out.print(gridStructure[i][j].getValue());
            }
            System.out.print("\n");
        }
    }
}
