/**
 * This class is used to extend the Card class to have a second playable card
 * type which acts as a healer to the rest of your played deck.
 *
 * @author  Mateusz Halada
 */
public class HealerCard extends Card{
    private int heal;

    /**
     *Defines the HealerCard object using the super values of the superclass
     * and adding a heal attribute to it
     */
    public HealerCard(String name, int dmg, int hp, int def, int heal){
        super(name, dmg, hp, def);
        setHeal(heal);
    }

    public void setHeal(int heal){
        this.heal = heal;
    }

    /**
     * Returns the healing value for the card
     */
    public int getHeal(){
        return heal;
    }

    /**
     * Returns a formatted object that builds upon the superclass's toString
     * method adding the unique healing property
     */
    public String toString(){
        return super.toString() + String.format("\nHeal: %d",getHeal());
    }
}
