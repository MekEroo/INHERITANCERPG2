package com.example.inheritancerpg;

public class Knight extends Heavy{

    // Knight class: Heavy unit with increased durability. HP increases based on armor.
    // HP increases by 75% per point of armor.

    public Knight () {
        //default constructor
    }

    public Knight(String name, int totalHP, int armor, int minDMG, int maxDMG) {
        super.heavyName = name;
        super.armor = armor;
        totalHP += Math.round(armor * 0.75); // armor stat increases HP by 75%
        super.heavyTotalHP = totalHP;
        super.heavyMinDMG = minDMG;
        super.heavyMaxDMG = maxDMG;

    }
}
