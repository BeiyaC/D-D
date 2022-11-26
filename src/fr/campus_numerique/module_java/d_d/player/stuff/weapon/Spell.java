package fr.campus_numerique.module_java.d_d.player.stuff.weapon;

import fr.campus_numerique.module_java.d_d.board.Box;
import fr.campus_numerique.module_java.d_d.player.type.Hero;
import fr.campus_numerique.module_java.d_d.player.stuff.OffensiveStuff;

public class Spell extends OffensiveStuff implements Box {

    public Spell(int attack, String type) {

        super(attack, type);
    }

    @Override
    public void interact(Hero hero) {

        hero.setStrength(hero.getStrength()+ this.attack);
        System.out.println("There is a new weapon with " + this.attack + " atk dmg");

    }
}
