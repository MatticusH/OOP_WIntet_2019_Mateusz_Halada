import java.util.Date;

//This class is intended to keep track of gamedata to be saved

public class GameTime {

    private String name;
    private final Date startTime = new Date();
    public int i;
    public int time;
    public int rounds = 0;

    public void setName(String name){
        this.name = name;
    }

    public void setT(int time){
        this.time = time;
    }

    public void setRounds(int rounds){
        this.rounds = rounds;
    }

    public int getRounds(){
        return rounds;
    }

    public static String timeAsString(int t){
        int a = (t % 60);
        int b = (t/60%60);
        int c = ((t/60)/60);
        return a + ":" + b + ":" + c;
    }

    public int getTimeInSeconds(){
        Date currentTime = new Date();
        return (int)((currentTime.getTime() - this.startTime.getTime()) / 1000);
    }
}
