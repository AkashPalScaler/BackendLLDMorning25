package org.example.TicTacToe.Strategies;

import org.example.TicTacToe.Models.Board;
import org.example.TicTacToe.Models.Move;
import org.example.TicTacToe.Models.Player;

public interface WinningStrategy {
    boolean checkWinner(Board board, Move move);
    void handleUndo(Move move);
}
