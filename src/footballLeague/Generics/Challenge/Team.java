package footballLeague.Generics.Challenge;

import java.util.ArrayList;

public class Team<T extends Player> implements Comparable<Team<T>>{   // Carefull with the parameters

    private String name;
    int played=0;
    int won=0;
    int tied=0;
    int lost=0;

    private ArrayList<T> members = new ArrayList<>();

    public Team(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    public boolean addPlayer(T player){
        if(members.contains(player)){
            System.out.println(player.getName() + "is in the team");
            return false;
        }else{
            members.add(player);
            return true;
        }
    }
    public void numPlayers(){
        System.out.println( "\n" + this.getName() + " has " + this.members.size() + " players." );
    }
    public void matchResult(Team<T> opponent, int goals, int goalsOpponent) {

        String message;

        if(goals > goalsOpponent){
            won++;
            message = " beat ";
        }else if(goals < goalsOpponent){
            lost++;
            message = " lost to ";
        }else {
            tied++;
            message = " drew with ";
        }
        played++;

        if (opponent != null) {
            System.out.println(this.getName() + message + opponent.getName() + " with score " + goals + "-" + goalsOpponent);
            opponent.matchResult(null, goalsOpponent, goals);
        }
    }

    public int ranking(){
        return (won*2)+tied;
    }
    @Override
    public int compareTo(Team<T> team) {

        if (this.ranking() > team.ranking()){
            return -1;
        }else if(this.ranking() < team.ranking()){
            return -1;
        } else{
            return 0;
        }
    }


}
