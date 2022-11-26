package fr.campus_numerique.module_java.d_d.player.stuff.item;

import fr.campus_numerique.module_java.d_d.board.Box;
import fr.campus_numerique.module_java.d_d.player.type.Hero;
import fr.campus_numerique.module_java.d_d.player.stuff.OffensiveStuff;

public class Bolt extends OffensiveStuff implements Box {

    public Bolt(int attack, String name) {
        super(attack, name);
    }

    @Override
    public void interact(Hero hero) {

        hero.setStrength(hero.getStrength()+ this.attack);
        System.out.println("There is a new weapon with " + this.attack + " atk dmg");

    }
}
