package com.jawa.structural.chainofresponsibility.methodchain;

import org.junit.jupiter.api.Test;

public class CreatureModifierTest {
    @Test
    void test() {
        Creature goblin = new Creature("Goblin", 1, 1);
        CreatureModifier root = new CreatureModifier(goblin);

        root.add(new DoubleAttackModifier(goblin));

        root.add(new IncreaseDefenceModifier(goblin));
        root.handle();

    }
}
