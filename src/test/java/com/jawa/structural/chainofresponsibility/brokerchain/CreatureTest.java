package com.jawa.structural.chainofresponsibility.brokerchain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CreatureTest {
    @Test
    void test(){
        Game game = new Game();
        Creature creature = new Creature(game, "Dragon", 2, 2);
        DoubleAttackModifier doubleAttackModifier = new DoubleAttackModifier(game, creature);
        assertEquals(4, creature.getAttack());

        System.out.println(creature.getClass());
    }
}
