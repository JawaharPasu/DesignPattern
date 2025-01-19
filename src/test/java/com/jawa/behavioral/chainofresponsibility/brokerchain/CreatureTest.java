package com.jawa.behavioral.chainofresponsibility.brokerchain;

import com.jawa.behavioral.chainofresponsibility.brokerchain.Creature;
import com.jawa.behavioral.chainofresponsibility.brokerchain.DoubleAttackModifier;
import com.jawa.behavioral.chainofresponsibility.brokerchain.Game;
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
