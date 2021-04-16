package com.example.inheritancerpg;

public class Undead extends Monster{

    //Undead: Enemy/Monster unit, weak to magic.
    // Takes 15% more damage from magic-based attacks.

    public Undead() {
        // default constructor
    }

    public Undead(String name, int totalHP, int minDMG, int maxDMG) {
        super.monsterName = name;
        super.monsterTotalHP = totalHP;
        super.monsterMinDMG = minDMG;
        super.monsterMaxDMG = maxDMG;
        super.magiBane = true;
    }
}
