package fr.campus_numerique.module_java.d_d.player.type;

abstract public class Hero {
    private String type;
    private String name;
    protected int pv;
    protected int strength;
    private int pos;


    public Hero(String name) {

        this.name = name;

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

    public int getPv() {
        return pv;
    }

    public void setPv(int pv) {
        this.pv = pv;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getPos() {
        return pos;
    }

    public void setPos(int pos) {
        this.pos = pos;
    }


}
