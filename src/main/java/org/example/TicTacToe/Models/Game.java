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

    public boolean isValidMove(Move move){
        int r = move.getCell().getRow();
        int c = move.getCell().getCol();
        if( r < 0 || r >= board.getDimension() || c < 0 || c >= board.getDimension()){
            System.out.println("Invalid Move: Outside of the board");
            return false;
        }
        if(board.getGrid().get(r).get(c).getCellState().equals(CellState.FILLED)){
            System.out.println("Invalid Move: Cell is filled");
            return false;
        }

        return true;
    }

    public boolean checkWinner(Move move){
        for(WinningStrategy strategy: winningStrategies){
            if(strategy.checkWinner(board, move)){
                return true;
            }
        }
        return false;
    }

    public void makeMove(){
        //Check next player
        Player currentPlayer = players.get(nextPlayerIndex);

        Move move;
        //validate the move
        do{
            move = currentPlayer.makeMove(board);
        }while(!isValidMove(move));

        //Update the cell on the board
        Cell cellToUpdate = board.getGrid().get(move.getCell().getRow()).get(move.getCell().getCol());
        cellToUpdate.setCellState(CellState.FILLED);
        cellToUpdate.setSymbol(currentPlayer.getSymbol());

        //Add move to move history
        moves.add(move);

        //Check the winner or if draw
        if(checkWinner(move)){
            setGameState(GameState.SUCCESS);
            setWinner(currentPlayer);
        }else if(moves.size() == board.getDimension() * board.getDimension()){
            setGameState(GameState.DRAW);
        }
        //Increment the next player index
        nextPlayerIndex++; //0, 1, 2, 0, 1, 2
        nextPlayerIndex = nextPlayerIndex % players.size();
        // (a + b) % n // (a - b)% n -> (a - b + n)%n

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
