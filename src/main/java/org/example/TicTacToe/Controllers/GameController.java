package org.example.TicTacToe.Controllers;

import org.example.TicTacToe.Models.Game;
import org.example.TicTacToe.Models.GameState;
import org.example.TicTacToe.Models.Player;
import org.example.TicTacToe.Strategies.WinningStrategy;

import java.util.List;

public class GameController {
    public Game startGame(int dimension, List<Player> players, List<WinningStrategy> winningStrategies){
        return Game
                    .getBuilder()
                    .setDimension(dimension)
                    .setPlayers(players)
                    .setWinningStrategies(winningStrategies)
                    .build();
    }

    public GameState checkGameState(Game game){
        //check winner
        return  game.getGameState();
    }

    public void makeMove(Game game){
        game.makeMove();
    }

    public void undo(Game game){
        //game
    }


    public void display(Game game) {
        game.displayBoard();
    }
}
