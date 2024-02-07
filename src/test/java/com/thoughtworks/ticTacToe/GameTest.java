package com.thoughtworks.ticTacToe;

import com.thoughtworks.ticTacToe.Enum.MoveTypes;
import com.thoughtworks.ticTacToe.gameEntity.Game;
import com.thoughtworks.ticTacToe.gameEntity.gameBoard.Board;
import com.thoughtworks.ticTacToe.gameEntity.gameBoard.Cell;
import com.thoughtworks.ticTacToe.gamePlayer.Player;
import org.junit.jupiter.api.Test;

class GameTest {
    @Test
    void shouldPlayGameWithEndStatusAsGameOver() {
        Board board =new Board();
        Player playerO=new Player("Gaurav", MoveTypes.O,board);
        Player playerX=new Player("Sagar", MoveTypes.X,board);
        Game game =new Game(playerO,playerX);
        game.playGame(Cell.builder().xCoordinate(2).yCoordinate(2).build());
        game.playGame(Cell.builder().xCoordinate(2).yCoordinate(1).build());
        game.playGame(Cell.builder().xCoordinate(2).yCoordinate(0).build());
        game.playGame(Cell.builder().xCoordinate(0).yCoordinate(0).build());
        game.playGame("exit");
    }
    @Test
    void shouldPlayGameWithEndStatusPlayerXBecomingWinner() {
        Board board =new Board();
        Player playerO=new Player("Gaurav", MoveTypes.X,board);
        Player playerX=new Player("Sagar", MoveTypes.O,board);
        Game game =new Game(playerO,playerX);
        game.playGame(Cell.builder().xCoordinate(2).yCoordinate(2).build());
        game.playGame(Cell.builder().xCoordinate(0).yCoordinate(0).build());
        game.playGame(Cell.builder().xCoordinate(2).yCoordinate(1).build());
        game.playGame(Cell.builder().xCoordinate(0).yCoordinate(1).build());
        game.playGame(Cell.builder().xCoordinate(2).yCoordinate(1).build());
        game.playGame(Cell.builder().xCoordinate(2).yCoordinate(0).build());
    }

    @Test
    void shouldPlayGameWithEndStatusPlayerOBecomingWinner() {
        Board board =new Board();
        Player playerO=new Player("Gaurav", MoveTypes.X,board);
        Player playerX=new Player("Sagar", MoveTypes.O,board);
        Game game =new Game(playerO,playerX);
        game.playGame(Cell.builder().xCoordinate(2).yCoordinate(2).build());
        game.playGame(Cell.builder().xCoordinate(2).yCoordinate(1).build());
        game.playGame(Cell.builder().xCoordinate(2).yCoordinate(0).build());
        game.playGame(Cell.builder().xCoordinate(0).yCoordinate(0).build());
        game.playGame(Cell.builder().xCoordinate(1).yCoordinate(1).build());
        game.playGame(Cell.builder().xCoordinate(0).yCoordinate(2).build());
        game.playGame(Cell.builder().xCoordinate(1).yCoordinate(2).build());
        game.playGame(Cell.builder().xCoordinate(0).yCoordinate(1).build());
    }
}