package com.thoughtworks.ticTacToe;

import com.thoughtworks.ticTacToe.Enum.MoveTypes;
import com.thoughtworks.ticTacToe.gameBoard.Board;
import com.thoughtworks.ticTacToe.gameBoard.Cell;
import com.thoughtworks.ticTacToe.user.Player;
import com.thoughtworks.ticTacToe.user.PlayerTypeAssigner;
import org.junit.jupiter.api.Test;

class GameMoveSequencerTest {

    @Test
    void playGame() {
        Board board =new Board();
        Player player1=new PlayerTypeAssigner("Gaurav", MoveTypes.X).gameRulesForPlayer(board);
        Player player2=new PlayerTypeAssigner("Sagar", MoveTypes.O).gameRulesForPlayer(board);
        GameMoveSequencer gameMoveSequencer =new GameMoveSequencer(player1,player2);
        gameMoveSequencer.playGame(Cell.builder().xCoordinate(2).yCoordinate(2).build());
        gameMoveSequencer.playGame(Cell.builder().xCoordinate(2).yCoordinate(1).build());
        gameMoveSequencer.playGame(Cell.builder().xCoordinate(2).yCoordinate(0).build());
        gameMoveSequencer.playGame(Cell.builder().xCoordinate(0).yCoordinate(0).build());
    }
}