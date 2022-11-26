package fr.campus_numerique.module_java.d_d.player.type.enemy;

import fr.campus_numerique.module_java.d_d.board.Box;
import fr.campus_numerique.module_java.d_d.player.type.Enemy;
import fr.campus_numerique.module_java.d_d.player.type.Hero;

public class Dragon extends Enemy implements Box {


    public Dragon(String name, int pv, int attack) {
        super(name, pv, attack);
    }

    /**
     * @param hero
     */
    @Override
    public void interact(Hero hero) {

        System.out.println("There is a Dragon here");

    }
}
