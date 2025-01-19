package com.jawa.behavioral.templatemethod;

public abstract class Game {

    protected int currentPlayer;
    protected final int numberOfPlayers;

    protected Game(int numberOfPlayers) {
        this.numberOfPlayers = numberOfPlayers;
    }

    public void run() {
        start();
        while (!haveWinner()) {
            takeTurn();
        }
        System.out.println("Player " + getWinningPlayer() + " wins");
    }

    protected abstract int getWinningPlayer();
    protected abstract void takeTurn();
    protected abstract boolean haveWinner();
    protected abstract void start();
}
