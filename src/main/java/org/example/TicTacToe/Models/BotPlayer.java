package org.example.TicTacToe.Models;

import org.example.TicTacToe.Factory.BotPlayingStrategyFactory;
import org.example.TicTacToe.Strategies.BotPlayingStrategy;

public class BotPlayer extends Player{
    BotDifficultyLevel botDifficultyLevel;
    BotPlayingStrategy botPlayingStrategy;

    public BotPlayer(int playerId, String name, Symbol symbol, BotDifficultyLevel botDifficultyLevel) {
        super(playerId, name, symbol, PlayerType.BOT);
        botPlayingStrategy = BotPlayingStrategyFactory.getStrategy(botDifficultyLevel);
        this.botDifficultyLevel = botDifficultyLevel;
    }

    @Override
    public Move makeMove(Board board) {
        //make the move depending on difficulty level
        System.out.println("It's " + this.getName() + "'s turn. Calculating move ...");
        Cell cell = botPlayingStrategy.makeMove(board);
        if(cell != null){
            return new Move(cell, this);
        }
        return  null;
    }
}
