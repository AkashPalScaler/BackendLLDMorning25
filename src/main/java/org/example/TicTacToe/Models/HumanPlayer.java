package org.example.TicTacToe.Models;

import java.util.Scanner;

public class HumanPlayer extends Player{
    Scanner sc = new Scanner(System.in);
    @Override
    public Move makeMove(Board board) {
        // Wait for input from user on terminal
        System.out.println("It's " + this.getName() + "'s turn, please enter the row:");
        int r = sc.nextInt();
        System.out.println("It's " + this.getName() + "'s turn, please enter the column:");
        int c = sc.nextInt();

        Cell cell = new Cell(r, c);
        return new Move(cell, this);
    }

    public HumanPlayer(int playerId, String name, Symbol symbol) {
        super(playerId, name, symbol, PlayerType.HUMAN);
    }

}
