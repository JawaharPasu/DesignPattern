package com.jawa.structural.chainofresponsibility.methodchain;

public class DoubleAttackModifier extends CreatureModifier{

    public DoubleAttackModifier(Creature creature) {
        super(creature);
    }


    /**
     * Here the super is responsible for calling the chain of handles() method
     */
    @Override
    public void handle() {
        creature.attack *= 2;
        System.out.println("Doubling the " + creature.name + "'s attack");
        super.handle();
    }
}
