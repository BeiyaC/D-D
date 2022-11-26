package fr.campus_numerique.module_java.d_d.board.box;

import fr.campus_numerique.module_java.d_d.board.Box;
import fr.campus_numerique.module_java.d_d.player.type.Hero;

public class EmptyBox implements Box {

    /**
     *
     */
    @Override
    public void interact(Hero hero) {
        System.out.println("The box is empty");
    }
}
