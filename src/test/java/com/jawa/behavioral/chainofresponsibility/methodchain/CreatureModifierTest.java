package com.jawa.behavioral.chainofresponsibility.methodchain;

import com.jawa.behavioral.chainofresponsibility.methodchain.Creature;
import com.jawa.behavioral.chainofresponsibility.methodchain.CreatureModifier;
import com.jawa.behavioral.chainofresponsibility.methodchain.DoubleAttackModifier;
import com.jawa.behavioral.chainofresponsibility.methodchain.IncreaseDefenceModifier;
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
