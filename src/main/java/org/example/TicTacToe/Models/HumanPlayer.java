package org.example.TicTacToe.Models;

public class HumanPlayer extends Player{
    @Override
    public void makeMove() {
        // Wait for input from user on terminal
    }

    public HumanPlayer(int playerId, String name, Symbol symbol) {
        super(playerId, name, symbol, PlayerType.HUMAN);
    }

}
