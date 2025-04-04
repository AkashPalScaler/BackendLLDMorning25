package org.example.TicTacToe.Models;

import org.example.TicTacToe.Strategies.WinningStrategy;
import org.example.TicTacToe.Validations.GameValidations.DimensionAndPlayerValidation;
import org.example.TicTacToe.Validations.GameValidations.UniqueSymbolValidation;

import java.util.ArrayList;
import java.util.List;

public class Game {
    private Board board;
    private List<Player> players;
    private GameState gameState;
    private List<WinningStrategy> winningStrategies;
    private int nextPlayerIndex;
    private Player winner;
    private List<Move> moves;


    private Game(Builder builder) {
        this.board = new Board(builder.dimension);
        this.players = builder.players;
        this.winningStrategies = builder.winningStrategies;
        this.gameState = GameState.IN_PROGRESS;
        this.winner = null;
        this.nextPlayerIndex = 0;
        this.moves = new ArrayList<>();
    }

    public Board getBoard() {
        return board;
    }

    public void setBoard(Board board) {
        this.board = board;
    }

    public List<Player> getPlayers() {
        return players;
    }

    public void setPlayers(List<Player> players) {
        this.players = players;
    }

    public GameState getGameState() {
        return gameState;
    }

    public void setGameState(GameState gameState) {
        this.gameState = gameState;
    }

    public List<WinningStrategy> getWinningStrategies() {
        return winningStrategies;
    }

    public void setWinningStrategies(List<WinningStrategy> winningStrategies) {
        this.winningStrategies = winningStrategies;
    }

    public int getNextPlayerIndex() {
        return nextPlayerIndex;
    }

    public void setNextPlayerIndex(int nextPlayerIndex) {
        this.nextPlayerIndex = nextPlayerIndex;
    }

    public Player getWinner() {
        return winner;
    }

    public void setWinner(Player winner) {
        this.winner = winner;
    }

    public List<Move> getMoves() {
        return moves;
    }

    public void setMoves(List<Move> moves) {
        this.moves = moves;
    }

    public static Builder getBuilder(){
        return new Builder();
    }

    public void displayBoard() {
        board.display();
    }

    //inner class
    public static class Builder{
        private int dimension; //used to create the board
        private List<Player> players;
        private List<WinningStrategy> winningStrategies;

        public Builder setDimension(int dimension) {
            this.dimension = dimension;
            return this;
        }

        public Builder setPlayers(List<Player> players) {
            this.players = players;
            return this;
        }

        public Builder setWinningStrategies(List<WinningStrategy> winningStrategies) {
            this.winningStrategies = winningStrategies;
            return this;
        }

        private void validate(){
            //Validations
            DimensionAndPlayerValidation.validate(this.dimension, this.players);
            UniqueSymbolValidation.validate();
            //only one bot allowed
        }

        public Game build(){
            this.validate();
            return new Game(this);
        }
    }
}
