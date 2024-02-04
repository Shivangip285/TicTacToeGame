package com.thoughtworks.ticTacToe.user;

import com.thoughtworks.ticTacToe.Enum.MoveTypes;
import com.thoughtworks.ticTacToe.gameBoard.Board;

public class PlayerTypeAssigner {
    private String name;
    private MoveTypes moveTypes;

    public PlayerTypeAssigner(String name, MoveTypes moveTypes) {
        this.name=name;
        this.moveTypes=moveTypes;
    }


    public Player gameRulesForPlayer(Board board){
        Player player;
        if(moveTypes.equals(MoveTypes.X)) {
            player = new PlayerX(name, board);
        }
         else{
           player=new PlayerO(name, board);
        }
         return player;
    }
}
