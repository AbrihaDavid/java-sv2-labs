package defaultconstructor.chess;

import java.util.Arrays;
import java.util.List;

public class ChessTournament {

    private List<Team> teams = Arrays.asList(new Team(), new Team(), new Team());

    public void addPlayersToTeams(List<Player> playersRegistrated) {
        for (int i = 0; i < (teams.size() * 2); i++) {
            setPlayers(i, playersRegistrated);
        }
    }

    public List<Team> getTeams() {
        return teams;
    }

    private void setPlayers(int i, List<Player> playersRegistrated) {     //Itt nem jöttem rá a dologra, ezért a solutions-ből másoltam ki a megoldást
        if (playersRegistrated.size() >= i + 1) {
            if (i % 2 == 0) {
                teams.get(i / 2).setPlayerOne(playersRegistrated.get(i));
            } else {
                teams.get(i / 2).setPlayerTwo(playersRegistrated.get(i));
            }
        }
    }
}
