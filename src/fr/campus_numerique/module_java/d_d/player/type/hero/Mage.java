package fr.campus_numerique.module_java.d_d.player.type.hero;

import fr.campus_numerique.module_java.d_d.player.type.Hero;
import fr.campus_numerique.module_java.d_d.player.stuff.weapon.Potion;
import fr.campus_numerique.module_java.d_d.player.stuff.weapon.Spell;

public class Mage extends Hero {

    Spell spell;
    Potion potion;

    /**
     * function to construct a new warrior with one offensive and one defensive stuff
     * @param name Player
     */
    public Mage(String name) {
        super(name);
        this.pv = 6;
        this.strength = 15;
        spell = new Spell(12, "Pyroblast");
        potion = new Potion(5, "Healing Potion");
    }

    @Override
    public String toString() {
        return "Mage: " +
                "Spell = " + spell.getName() + "(" + spell.getAttack() + ")" +
                ", Defense = " + potion.getName() + "(" + potion.getDefense() + ")"+
                ", Health = " + pv +
                ", Attack Power = " + strength +
                '}';
    }
}
