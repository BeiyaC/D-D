package fr.campus_numerique.module_java.d_d.player.stuff;

abstract public class DefensiveStuff {
    private String type;
    protected int defense;
    protected String name;

    public DefensiveStuff(int defense, String name) {
        this.defense = defense;
        this.name = name;
    }

    ////////////////////////


    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getDefense() {
        return defense;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
