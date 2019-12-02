/**
 * This class is used to define the card object used in the PlayableCards
 * class.
 *
 * @author  Mateusz Halada
 */

public class Card {
    private String name;
    private int dmg;
    private int hp;
    private int def;

    /**
     * This 4 argument constructor defines the parameters of the Card object
     * allowing us to create new Cards with parameters as we define
     */
    public Card(String name, int dmg, int hp, int def){
        setName(name);
        setDmg(dmg);
        setHp(hp);
        setDef(def);
    }

    /**
     * Sets the name of the Card/character
     * @param name
     */
    public void setName(String name){
        this.name = name;
    }

    /**
     * Sets the damage(attack) value for the Card/character
     * @param dmg
     */
    public void setDmg(int dmg){
        this.dmg = dmg;
    }

    /**
     * Sets the max health of the Card/character
     * @param hp
     */
    public void setHp(int hp){
        this.hp = hp;
    }

    /**
     * Sets the defence modifier of the Card/character
     * @param def
     */
    public void setDef(int def){
        this.def = def;
    }

    /**
     * Returns the name of the Card/character
     */
    public String getName(){
        return name;
    }
    /**
     * Returns the damage output of the Card/character
     */
    public int getDmg(){
        return dmg;
    }
    /**
     * Returns the max health of the Card/character
     */
    public int getHp(){
        return hp;
    }
    /**
     * Returns the defence modifier of the Card/character
     */
    public int getDef(){
        return def;
    }

    /**
     * Formats the card values to appear in below each other
     * when displayed on a card
     */
    public String toString(){
        return String.format("Name: %s \nHP: %d \nDMG: %d \nDEF: %d",
                getName(),getHp(),getDmg(),getDef());
    }

}
