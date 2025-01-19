package com.jawa.behavioral.templatemethod;

public class Chess extends Game{

    private int maxTurns = 10;
    private int turn = 1;

    public Chess() {
        super(2);
    }

    @Override
    protected int getWinningPlayer() {
        return 0;
    }

    @Override
    protected void takeTurn() {
        System.out.println(" Turn " + (turn++) + "taken by the player " + currentPlayer);
    }

    @Override
    protected boolean haveWinner() {
        return turn==maxTurns;
    }

    @Override
    protected void start() {
        System.out.println("starting game of chess");
    }
}
