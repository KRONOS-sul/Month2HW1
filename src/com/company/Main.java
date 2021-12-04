package com.company;

public class Main {

    public static void main(String[] args) {
        Sensei older = new Sensei(59, 6, CombatArts.MELEE, "Fists of steel");
        older.getInfo();
        System.out.println(older.training(5, "Dok"));

        System.out.println("\n__________________________\n");

        Apprentice joomart = new Apprentice(13, 1, CombatArts.NOTHING, "Gun");
        joomart.getInfo();
        System.out.println(joomart.training(3, "sdsd"));

        System.out.println("\n__________________________\n");

        Apprentice sagynAly = new Apprentice(10,1,CombatArts.NOTHING,"Geekcoin");
        sagynAly.getInfo();
        System.out.println(sagynAly.training(21));
    }
}
