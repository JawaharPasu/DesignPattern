package com.jawa.structural.proxy.property;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CreatureTest {
    @Test
    void test(){
        Creature creature = new Creature();
        assertEquals(10, creature.getAgility());
        creature.setAgility(12);
        assertEquals(12, creature.getAgility());
    }
}
