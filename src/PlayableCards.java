import java.util.ArrayList;

public class PlayableCards {
    public static ArrayList<Card> allCards = new ArrayList<Card>(15);
    public ArrayList<Card> enemyHand = new ArrayList<Card>(5);
    public static ArrayList<Card> shopDeck = new ArrayList<Card>(30);
    public ArrayList<Card> playerDeck = new ArrayList<Card>(12);
    public ArrayList<Card> playerHand = new ArrayList<Card>(5);

    /**
     * Populates an arraylist with a list of pre-defined cards to be
     * playable in-game
     */
    public PlayableCards() {
        allCards.add(new Card("Jim", 500, 1000, 50));
        allCards.add(new Card("", 0, 0, 0));
        allCards.add(new Card("", 0, 0, 0));
        allCards.add(new Card("", 0, 0, 0));
        allCards.add(new Card("", 0, 0, 0));
        allCards.add(new Card("", 0, 0, 0));
        allCards.add(new Card("", 0, 0, 0));
        allCards.add(new Card("", 0, 0, 0));
        allCards.add(new Card("", 0, 0, 0));
        allCards.add(new Card("", 0, 0, 0));
        allCards.add(new Card("", 0, 0, 0));
        allCards.add(new Card("", 0, 0, 0));
        allCards.add(new HealerCard("Joe", 200, 800, 30, 250));
        allCards.add(new HealerCard("", 0, 0, 0, 0));
        allCards.add(new HealerCard("", 0, 0, 0, 0));

    }

    /**
     * Generates a random deck for the enemy at the start of
     * each round
     */
    public void setEnemyHand(){
        for(int i = 0; i<5; i++){
            enemyHand.add(allCards.get((int)Math.random() * 10));
        }
    }

    /**
     * Generates a set of 30 random cards to be purchasable from
     * the in-game deck
     */
    public static void shuffleShopDeck(){
        for(int i = 0; i<30; i++){
            shopDeck.add(allCards.get((int)Math.random() * 15));
        }
    }
    /**
     * Generates a start of 3 random cards for the player to start with
    */
    public void setPlayerDeck(){
        for(int i = 0; i<3; i++){
            playerDeck.add(allCards.get((int)Math.random() * 15));
        }
    }
}
