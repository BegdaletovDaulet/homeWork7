package com.company;

public abstract class Hero implements HavingSuperAbility{
    int health;
    int damage;
    String superAbilityType;

    @Override
    public String applySuperAbility(String superAbilityType) {
        return superAbilityType;
    }
}
