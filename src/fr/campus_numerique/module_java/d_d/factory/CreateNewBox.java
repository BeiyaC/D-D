package fr.campus_numerique.module_java.d_d.factory;

import fr.campus_numerique.module_java.d_d.board.Box;
import fr.campus_numerique.module_java.d_d.board.box.EmptyBox;
import fr.campus_numerique.module_java.d_d.board.ItemType;
import fr.campus_numerique.module_java.d_d.player.stuff.item.*;
import fr.campus_numerique.module_java.d_d.player.stuff.weapon.Potion;
import fr.campus_numerique.module_java.d_d.player.type.enemy.Dragon;
import fr.campus_numerique.module_java.d_d.player.type.enemy.Goblin;
import fr.campus_numerique.module_java.d_d.player.type.enemy.Wizard;

public class CreateNewBox {


    public static Box createNewBox(ItemType itemType) {
        switch(itemType){
            case DRAGON -> {
                return new Dragon("Dragon", 15, 4);
            }
            case WIZARD -> {
                return new Wizard("Wizard", 9, 2);
            }
            case GOBLIN -> {
                return new Goblin("Goblin", 6, 1);
            }
            case BOLT -> {
                return new Bolt(2, "Bolt");
            }
            case FIREBALL -> {
                return new Fireball(7, "Fireball");
            }
            case GREATER_HEAL_POTION -> {
                return new GreaterHealPotion(5, "Greater Heal Potion");
            }
            case HEAL_POTION -> {
                return new HealPotion(2, "Heal Potion");
            }
            case MASS -> {
                return new Mass(3, "Mass");
            }
            case SWORD -> {
                return new Sword(5, "Sword");
            }
            case EMPTY_BOX -> {
                return new EmptyBox();
            }
        }
        return null;
    };
}
