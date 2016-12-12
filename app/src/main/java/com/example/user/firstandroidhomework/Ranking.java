package com.example.user.firstandroidhomework;

import java.util.*;

/**
 * Created by user on 12/12/2016.
 */
public class Ranking {

    Player player1;
    Player player2;

    private ArrayList<Player> playerRankings;

    public Ranking() {
        this.playerRankings = new ArrayList<Player>();
        this.player1 = new Player("Michael van Gerwen", "Mighty Mike", 1);
        this.player2 = new Player("Gary Anderson", "The Flying Scotsman", 2);
        setupPlayerRankings();
    }

    public Ranking(ArrayList<Player> playerRankings) {
        this.playerRankings = new ArrayList<Player>(playerRankings);
    }

    public ArrayList<Player> getRankings() {
        return new ArrayList<Player>(this.playerRankings);
    }

    public Player getRankingAtIndex(int index) {
        return playerRankings.get(index);
    }


    public void add(Player player) {
        playerRankings.add(player);
    }

    public int getRankingSize() {
        return playerRankings.size();
    }

    private void setupPlayerRankings() {
        Player[] playersToAdd = {
                player1,
                player2
        };

        for (Player player : playersToAdd) {
            add(player);
        }
    }


}


