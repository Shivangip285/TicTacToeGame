package com.thoughtworks.ticTacToe;

import com.thoughtworks.ticTacToe.Enum.MoveTypes;
import com.thoughtworks.ticTacToe.gameBoard.Board;
import com.thoughtworks.ticTacToe.gameBoard.Cell;
import com.thoughtworks.ticTacToe.user.Player;
import org.junit.jupiter.api.Test;

class GameMoveSequencerTest {

    @Test
    void shouldPlayGameWithEndStatusAsGameOver() {
        Board board =new Board();
        Player playerO=new Player("Gaurav", MoveTypes.O,board);
        Player playerX=new Player("Sagar", MoveTypes.X,board);
        GameMoveSequencer gameMoveSequencer =new GameMoveSequencer(playerO,playerX);
        gameMoveSequencer.playGame(Cell.builder().xCoordinate(2).yCoordinate(2).build());
        gameMoveSequencer.playGame(Cell.builder().xCoordinate(2).yCoordinate(1).build());
        gameMoveSequencer.playGame(Cell.builder().xCoordinate(2).yCoordinate(0).build());
        gameMoveSequencer.playGame(Cell.builder().xCoordinate(0).yCoordinate(0).build());
        gameMoveSequencer.playGame("exit");
    }
    @Test
    void shouldPlayGameWithEndStatusPlayerXBecomingWinner() {
        Board board =new Board();
        Player playerO=new Player("Gaurav", MoveTypes.X,board);
        Player playerX=new Player("Sagar", MoveTypes.O,board);
        GameMoveSequencer gameMoveSequencer =new GameMoveSequencer(playerO,playerX);
        gameMoveSequencer.playGame(Cell.builder().xCoordinate(2).yCoordinate(2).build());
        gameMoveSequencer.playGame(Cell.builder().xCoordinate(0).yCoordinate(0).build());
        gameMoveSequencer.playGame(Cell.builder().xCoordinate(2).yCoordinate(1).build());
        gameMoveSequencer.playGame(Cell.builder().xCoordinate(0).yCoordinate(1).build());
        gameMoveSequencer.playGame(Cell.builder().xCoordinate(2).yCoordinate(1).build());
        gameMoveSequencer.playGame(Cell.builder().xCoordinate(2).yCoordinate(0).build());
    }

    @Test
    void shouldPlayGameWithEndStatusPlayerOBecomingWinner() {
        Board board =new Board();
        Player playerO=new Player("Gaurav", MoveTypes.X,board);
        Player playerX=new Player("Sagar", MoveTypes.O,board);
        GameMoveSequencer gameMoveSequencer =new GameMoveSequencer(playerO,playerX);
        gameMoveSequencer.playGame(Cell.builder().xCoordinate(2).yCoordinate(2).build());
        gameMoveSequencer.playGame(Cell.builder().xCoordinate(2).yCoordinate(1).build());
        gameMoveSequencer.playGame(Cell.builder().xCoordinate(2).yCoordinate(0).build());
        gameMoveSequencer.playGame(Cell.builder().xCoordinate(0).yCoordinate(0).build());
        gameMoveSequencer.playGame(Cell.builder().xCoordinate(1).yCoordinate(1).build());
        gameMoveSequencer.playGame(Cell.builder().xCoordinate(0).yCoordinate(2).build());
        gameMoveSequencer.playGame(Cell.builder().xCoordinate(1).yCoordinate(2).build());
        gameMoveSequencer.playGame(Cell.builder().xCoordinate(0).yCoordinate(1).build());
    }
}