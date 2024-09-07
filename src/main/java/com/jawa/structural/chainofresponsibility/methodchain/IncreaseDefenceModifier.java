package com.jawa.structural.chainofresponsibility.methodchain;

public class IncreaseDefenceModifier extends CreatureModifier{
    public IncreaseDefenceModifier(Creature creature) {
        super(creature);
    }

    @Override
    public void handle() {
        creature.defense +=3;
        System.out.println("increasing the " + creature.name + "'s defence");
        super.handle();
    }
}
