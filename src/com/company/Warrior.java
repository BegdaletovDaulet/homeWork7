package com.company;

public class Warrior extends Hero implements HavingSuperAbility{
    @Override
    public String applySuperAbility(String superAbilityType) {
        return super.applySuperAbility("Warrior применил суперспособность CRITICAL DAMAGE");
    }
}
