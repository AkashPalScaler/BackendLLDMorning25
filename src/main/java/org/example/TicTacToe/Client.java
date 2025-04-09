package org.example.TicTacToe;

import org.example.TicTacToe.Controllers.GameController;
import org.example.TicTacToe.Models.*;
import org.example.TicTacToe.Strategies.ColumnWinningStrategy;
import org.example.TicTacToe.Strategies.RowWinningStrategy;
import org.example.TicTacToe.Strategies.WinningStrategy;

import java.util.ArrayList;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        // 1. Creating Models
        // 2. Creating the controllers

        // Create players and winningStrategies
        List<Player>  players = new ArrayList<>(); // player needs to be added

        //fetch the player objects from DB using Id
        Player a = new HumanPlayer(1, "Akash", new Symbol('X'));
        Player b = new BotPlayer(2, "Botty", new Symbol('O'), BotDifficultyLevel.EASY);

        //From API -> we get user IDs -> From user id we fetch the lpayer object
        players.add(a);
        players.add(b);

        //From API -> We get winningStrategies selected ["row", "column"]
        WinningStrategy rowWin = new RowWinningStrategy();
        WinningStrategy colWin = new ColumnWinningStrategy();

        List<WinningStrategy> winningStrategies = new ArrayList<>(); //strategies need to bne added

        winningStrategies.add(rowWin);
        winningStrategies.add(colWin);
        // 3. Start the game:The game is IN PROGRESS, trying to take
        //    input, keep displaying board
        GameController gameController = new GameController();

        //We are going to send the game id
        Game game = gameController.startGame(3, players, winningStrategies);
        Game game2 = gameController.startGame(4, players, winningStrategies);

        gameController.display(game);
        while(gameController.checkGameState(game) == GameState.IN_PROGRESS){
            gameController.makeMove(game);
            gameController.display(game);
        }

        if(gameController.checkGameState(game) == GameState.SUCCESS){
            System.out.println(game.getWinner().getName() + " is the Winner!");
        }else if(gameController.checkGameState(game) == GameState.DRAW){
            System.out.println("Game is draw!");
        }

        // 4. Make the move and check if undo is required

        // 5. Check for winner

        // 6. Stop the game, declare winner

        //HW : Make the move atleast for human player -> logic for taking input
        //HW: Finish the Validations
        //HW: Atleast write one winning strategy
    }
}
