package com.company;

public final class Apprentice extends Sensei { //3_Уровень
    public Apprentice(int age, int skillLevel, CombatArts combatArt, String weapon) {
        super(age, skillLevel, combatArt, weapon);
    }

    @Override
    public String training(int timeToTeach, String opponent) {
        return ("I don't wanna train today");
    }

    @Override
    public void getInfo() {
        super.getInfo();
    }
}
