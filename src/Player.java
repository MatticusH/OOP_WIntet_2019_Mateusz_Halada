public class Player {
    private int gold;
    private int roundsWon;
    private int score;
    private int hp;
    private int roundTotDmg;
    private int roundTotHp;
    private int roundTotDef;

    public Player(){
        setGold(10);
        setRounds(0);
        setScore(0);
        setHp(100);
        setRoundTotDmg(0);
        setRoundTotHp(0);
        setRoundTotDef(0);
    }

    public Player(int gold, int roundsWon, int score, int hp,
                  int roundTotDmg, int roundTotHp, int roundTotDef){
        setGold(gold);
        setRounds(roundsWon);
        setScore(score);
        setHp(hp);
        setRoundTotDmg(roundTotDmg);
        setRoundTotHp(roundTotHp);
        setRoundTotDef(roundTotDef);
    }

    private void setGold(int gold) {
        this.gold = gold;
    }

    private void setRoundTotDef(int roundTotDef) {
        this.roundTotDef = roundTotDef;
    }

    private void setRoundTotHp(int roundTotHp) {
        this.roundTotHp = roundTotHp;
    }

    private void setRoundTotDmg(int roundTotDmg) {
        this.roundTotDmg = roundTotDmg;
    }

    private void setScore(int score) {
        this.score = score;
    }

    private void setRounds(int roundsWon) {
        this.roundsWon = roundsWon;
    }

    private void setHp(int hp) {
        this.hp = hp;
    }

    private int getGold(){
        return gold;
    }

    private int getRoundsWon(){
        return roundsWon;
    }

    private int getScore(){
        return score;
    }

    int getHp(){
        return hp;
    }

    private int getRoundTotDmg(){
        return roundTotDmg;
    }

    private int getRoundTotHp(){
        return roundTotHp;
    }

    private int getRoundTotDef(){
        return roundTotDef;
    }

    String enemyToString(){
        return String.format("EnemyStats\n____________\nHP:%d\nWins:%d\nScore:%d",
                getHp(),getRoundsWon(),getScore());
    }

    String playerToString(){
        return String.format("PlayerStats\n____________\nHP:%d\nGold:%d\nWins:%d\nScore:%d",
                getHp(), getGold(),getRoundsWon(),getScore());
    }
}
