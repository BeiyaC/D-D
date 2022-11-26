package fr.campus_numerique.module_java.d_d.player.stuff.item;

import fr.campus_numerique.module_java.d_d.board.Box;
import fr.campus_numerique.module_java.d_d.player.type.Hero;
import fr.campus_numerique.module_java.d_d.player.stuff.DefensiveStuff;

public class GreaterHealPotion extends DefensiveStuff implements Box {

    public GreaterHealPotion(int defense, String name) {
        super(defense, name);
    }

    /**
     * @param hero Player
     */
    @Override
    public void interact(Hero hero) {

        hero.setPv(hero.getPv() + this.defense);
        System.out.println("There is a " + this.name + " with " + this.defense + " of def points");

    }
}
