package org.example.TicTacToe.Strategies;

import org.example.TicTacToe.Models.Board;
import org.example.TicTacToe.Models.Move;
import org.example.TicTacToe.Models.Player;
import org.example.TicTacToe.Models.Symbol;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class RowWinningStrategy implements WinningStrategy{
    Map<Integer, Map<Symbol, Integer>> count = new HashMap<>();
    @Override
    public boolean checkWinner(Board board, Move move) {
        //update value
//        if(!count.containsKey(move.getCell().getRow())){
//            count.put(move.getCell().getRow(), new HashMap<>());
//        }
        count.putIfAbsent(move.getCell().getRow(), new HashMap<>());
        Map<Symbol, Integer> rowCount = count.get(move.getCell().getRow());

        Symbol symbol = move.getPlayer().getSymbol();
        rowCount.putIfAbsent(symbol, 0);
        rowCount.put(symbol, rowCount.get(symbol) + 1);

        //Check the value
        if(rowCount.get(symbol) == board.getDimension()){
            return true;
        }
        return false;
    }
}
