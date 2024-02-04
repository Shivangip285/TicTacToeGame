package com.thoughtworks.ticTacToe;

import com.thoughtworks.ticTacToe.Enum.GameStatus;
import com.thoughtworks.ticTacToe.Enum.MoveStatus;
import com.thoughtworks.ticTacToe.gameBoard.Cell;
import com.thoughtworks.ticTacToe.user.Player;


public class GameMoveSequencer {
    private Player firstPlayer;
    private Player secondPlayer;

    private Player lastPlayer;

    public GameMoveSequencer(Player firstPlayer, Player secondPlayer) {
        this.firstPlayer = firstPlayer;
        this.secondPlayer = secondPlayer;
    }
    public void playGame(String exit){
        System.out.println(GameStatus.GameOver.toString());
    }
    public void playGame(Cell cell){
        Player player=lastPlayer;
        if(lastPlayer==null){
           player= firstPlayer;
        }
        MoveStatus moveStatus = player.playMoveForPlayer(cell);
        if(moveStatus.equals(MoveStatus.InvalidMove)){
            lastPlayer= getNextPlayer(player,moveStatus);
        }
    }
    public Player getNextPlayer(Player lastPlayer, MoveStatus moveStatus){
            if(moveStatus.equals(MoveStatus.InvalidMove)){
                return lastPlayer.equals(firstPlayer)?firstPlayer:secondPlayer;
            }
            return lastPlayer.equals(firstPlayer)?secondPlayer:firstPlayer;
    }
}
