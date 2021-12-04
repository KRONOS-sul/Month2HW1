package com.company;

public class GrandMaster {  //1_Уровень
    private int age;
    private int skillLevel;
    private CombatArts combatArt;
    private String weapon;

    public int getAge() {
        return age;
    }

    public int getSkillLevel() {
        return skillLevel;
    }

    public CombatArts getCombatArt() {
        return combatArt;
    }

    public String getWeapon() {
        return weapon;
    }

    public GrandMaster(int age, int skillLevel, CombatArts combatArt, String weapon) {
        this.age = age;
        this.skillLevel = skillLevel;
        this.combatArt = combatArt;
        this.weapon = weapon;
    }

}
