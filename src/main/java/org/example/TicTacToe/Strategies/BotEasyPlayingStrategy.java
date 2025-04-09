package org.example.TicTacToe.Strategies;

import org.example.TicTacToe.Models.Board;
import org.example.TicTacToe.Models.Cell;
import org.example.TicTacToe.Models.CellState;
import org.example.TicTacToe.Models.Move;

import java.util.List;

public class BotEasyPlayingStrategy implements BotPlayingStrategy {
    @Override
    public Cell makeMove(Board board) {
        for(List<Cell> row: board.getGrid()){
            for(Cell cell: row)
            {
                if(cell.getCellState().equals(CellState.EMPTY)){
                    return new Cell(cell.getRow(), cell.getCol());
                }
            }
        }
        return null;
    }
}
