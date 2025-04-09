package org.example.TicTacToe.Strategies;

import org.example.TicTacToe.Models.Board;
import org.example.TicTacToe.Models.Move;
import org.example.TicTacToe.Models.Player;
import org.example.TicTacToe.Models.Symbol;

import java.util.HashMap;
import java.util.Map;

public class ColumnWinningStrategy implements WinningStrategy{
    Map<Integer, Map<Symbol, Integer>> count = new HashMap<>();
    @Override
    public boolean checkWinner(Board board, Move move) {
        //update value
//        if(!count.containsKey(move.getCell().getRow())){
//            count.put(move.getCell().getRow(), new HashMap<>());
//        }
        count.putIfAbsent(move.getCell().getCol(), new HashMap<>());
        Map<Symbol, Integer> colCount = count.get(move.getCell().getCol());

        Symbol symbol = move.getPlayer().getSymbol();
        colCount.putIfAbsent(symbol, 0);
        colCount.put(symbol, colCount.get(symbol) + 1);

        //Check the value
        if(colCount.get(symbol) == board.getDimension()){
            return true;
        }
        return false;
    }
}
