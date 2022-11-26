package fr.campus_numerique.module_java.d_d.player.stuff.weapon;

import fr.campus_numerique.module_java.d_d.board.Box;
import fr.campus_numerique.module_java.d_d.player.type.Hero;
import fr.campus_numerique.module_java.d_d.player.stuff.DefensiveStuff;

public class Shield extends DefensiveStuff implements Box {

    public Shield(int defense, String type) {

        super(defense, type);
    }

    /**
     *
     */
    @Override
    public void interact(Hero hero) {

        hero.setPv(hero.getPv() + this.defense);
        System.out.println("There is a " + this.name + " with " + this.defense + " pv");

    }
}
