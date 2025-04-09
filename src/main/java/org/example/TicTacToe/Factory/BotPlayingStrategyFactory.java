package org.example.TicTacToe.Factory;

import org.example.TicTacToe.Models.BotDifficultyLevel;
import org.example.TicTacToe.Strategies.BotEasyPlayingStrategy;
import org.example.TicTacToe.Strategies.BotPlayingStrategy;

public class BotPlayingStrategyFactory {
    public static BotPlayingStrategy getStrategy(BotDifficultyLevel difficultyLevel){
        return new BotEasyPlayingStrategy();
    }
}
