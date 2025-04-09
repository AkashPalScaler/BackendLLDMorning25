package org.example.TicTacToe.Strategies;

import org.example.TicTacToe.Models.Board;
import org.example.TicTacToe.Models.Cell;
import org.example.TicTacToe.Models.Move;

public interface BotPlayingStrategy {
    public Cell makeMove(Board board);
}
