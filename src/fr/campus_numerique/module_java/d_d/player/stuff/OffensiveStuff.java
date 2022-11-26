package fr.campus_numerique.module_java.d_d.player.stuff;

abstract public class OffensiveStuff {
    private String type;
    protected int attack;
    protected String name;

    public OffensiveStuff(int attack, String name) {
        this.attack = attack;
        this.name = name;
    }

    //////////////////////////


    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
