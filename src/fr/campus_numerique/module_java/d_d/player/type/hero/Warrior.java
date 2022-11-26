package fr.campus_numerique.module_java.d_d.player.type.hero;

import fr.campus_numerique.module_java.d_d.player.type.Hero;
import fr.campus_numerique.module_java.d_d.player.stuff.weapon.Shield;
import fr.campus_numerique.module_java.d_d.player.stuff.weapon.Weapon;

public class Warrior extends Hero {

    Weapon weapon;
    Shield shield;

    /**
     * function to construct a new warrior with one offensive and one defensive stuff
     */
    public Warrior(String name) {

        super(name);
        this.pv = 10;
        this.strength = 10;
        weapon = new Weapon(13, "Arthas Sword");
        shield = new Shield(10, "Turtle Shield");

    }

    @Override
    public String toString() {
        return "Warrior: " +
                "Attack = " + weapon.getName() + "(" + weapon.getAttack() + ")" +
                ", Defense = " + shield.getName() + "(" + shield.getDefense() + ")"+
                ", Health = " + pv +
                ", Attack Power = " + strength +
                '}';
    }
}
