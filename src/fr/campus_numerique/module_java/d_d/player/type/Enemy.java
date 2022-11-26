package fr.campus_numerique.module_java.d_d.player.type;

abstract public class Enemy {
    private String type;
    private String name;
    protected int pv;

    protected int attack;


    public Enemy(String name, int pv, int attack) {

        this.name = name;
        this.pv = pv;
        this.attack = attack;

    }

    ////////////////////////

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }
}
