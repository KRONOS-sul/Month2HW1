package com.company;


public class Sensei extends GrandMaster { //2_Уровень
    public Sensei(int age, int skillLevel, CombatArts combatArt, String weapon) {
        super(age, skillLevel, combatArt, weapon);
    }

    public final String training (int timeToTeach ) {
      return "My apprentice, today we will train " + timeToTeach + " hours";
    }

    public String training (int timeToTeach, String opponent ){
        return ("Your opponent is: " + opponent );
    }

    public void getInfo(){
        System.out.println("Ages: " + getAge() + "\nYears spent: " + getSkillLevel()
                + "\nCombat art: " + getCombatArt() + "\nWeapon: " + getWeapon());
    }}
