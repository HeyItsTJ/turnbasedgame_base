package mcm.edu.ph.turnbasedgame_base;

public class GameUnit {

    private int level;
    private String unitName;
    private int baseHealth;
    private int baseMana;
    private int baseArmor;
    private int minDPT;
    private int maxDPT;


    public GameUnit(){} //default constructor
    public GameUnit(String unitName, int baseHealth, int baseMana, int minDPT, int maxDPT){
        this.unitName =         unitName;
        this.baseHealth =       baseHealth;
        this.baseMana =         baseMana;
        this.minDPT =           minDPT;
        this.level =        0;
        this.baseArmor =    0;

    }

    public int getLevel() {return  level;}
    public String getUnitName() {return  unitName;}
    public int getBaseHealth() {return baseHealth;}
    public int getBaseMana() {return baseMana;}
    public int getBaseArmor() {return baseArmor;}
    public int getMinDPT() {return  minDPT;}
    public int getMaxDPT() {return  maxDPT;}
    public void setLevel(int level) { this.level = level;}
    public void setUnitName(String unitName) {this.unitName = unitName;}
    public void setBaseHealth(int baseHealth) {
        this.baseHealth = baseHealth;
    }
    public void setBaseMana(int baseMana) {
        this.baseMana = baseMana;
    }
    public void setBaseArmor(int baseArmor) {
        this.baseMana = baseArmor;
    }
    public void setMinDPT(int minDPT) {
        this.minDPT = minDPT;
    }
    public void setMaxDPT(int maxDPT) {
        this.maxDPT = maxDPT;
    }
}
