package org.example.TicTacToe.Models;

public class BotPlayer extends Player{
    BotDifficultyLevel botDifficultyLevel;

    public BotPlayer(int playerId, String name, Symbol symbol, BotDifficultyLevel botDifficultyLevel) {
        super(playerId, name, symbol, PlayerType.BOT);
        this.botDifficultyLevel = botDifficultyLevel;
    }

    @Override
    public void makeMove() {
        //make the move depending on difficulty level
    }
}
