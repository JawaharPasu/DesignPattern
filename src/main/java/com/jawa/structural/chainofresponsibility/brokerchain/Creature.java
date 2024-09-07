package com.jawa.structural.chainofresponsibility.brokerchain;

public class Creature {
    public Game game;
    public String name;
    public int baseAttack,baseDefense;

    public Creature(Game game, String name, int baseAttack, int baseDefense) {
        this.game = game;
        this.name = name;
        this.baseAttack = baseAttack;
        this.baseDefense = baseDefense;
    }

    int getAttack() {
        Query q = new Query(name, Query.Argument.ATTACK, baseAttack);
        game.queries.fire(q);
        return q.result;
    }

    int getDefense() {
        Query q = new Query(name, Query.Argument.DEFENCE, baseDefense);
        game.queries.fire(q);
        return q.result;
    }

    @Override
    public String toString() {
        return "Creature{" +
                "game=" + game +
                ", name='" + name + '\'' +
                ", attack=" + getAttack() +
                ", defense=" + getDefense() +
                '}';
    }
}
