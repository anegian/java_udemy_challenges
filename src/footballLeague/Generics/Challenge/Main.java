package footballLeague.Generics.Challenge;

public class Main {

    public static void main(String[] args) {
        FootballPlayer rivaldo = new FootballPlayer("Rivaldo");
        FootballPlayer viyafanes = new FootballPlayer("Viyafanes");

        League<Team<FootballPlayer>> footballLeague = new League<>("Super League");

        Team<FootballPlayer> olympiakos = new Team<>("Olympiakos F.C");
        Team<FootballPlayer> paok = new Team<>("PAOK F.C");
        Team<FootballPlayer> aek = new Team<>("AEK F.C");
        Team<FootballPlayer> pao = new Team<>("PAO F.C");
        Team<BaseballPlayer> chicagoCubs = new Team<>("Chicago Cubs");

        footballLeague.add(olympiakos);
        footballLeague.add(paok);
        footballLeague.add(aek);
        footballLeague.add(pao);

        // footballLeague.add(chicagoCubs);    cannot add baseball team because of the type parameter in the <Team <FootballPlayer> >

        olympiakos.matchResult(paok, 2, 1);
        pao.matchResult(aek,0,1);

        olympiakos.addPlayer(rivaldo);
        pao.addPlayer(viyafanes);

        olympiakos.numPlayers();
        pao.numPlayers();
        }
}

