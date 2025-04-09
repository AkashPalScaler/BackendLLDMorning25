package org.example.TicTacToe.Models;

public abstract class Player {
    private int playerId;
    private String name;
    private Symbol symbol;
    private PlayerType playerType;

    public abstract Move makeMove(Board board);

    public Player(int playerId, String name, Symbol symbol, PlayerType playerType) {
        this.playerId = playerId;
        this.name = name;
        this.symbol = symbol;
        this.playerType = playerType;
    }

    public int getPlayerId() {
        return playerId;
    }

    public void setPlayerId(int playerId) {
        this.playerId = playerId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Symbol getSymbol() {
        return symbol;
    }

    public void setSymbol(Symbol symbol) {
        this.symbol = symbol;
    }

    public PlayerType getPlayerType() {
        return playerType;
    }

    public void setPlayerType(PlayerType playerType) {
        this.playerType = playerType;
    }
}
