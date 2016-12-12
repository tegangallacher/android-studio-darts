package com.example.user.firstandroidhomework;
import org.junit.*;
import java.util.*;

import static org.junit.Assert.*;
/**
 * Created by user on 12/12/2016.
 */
public class PlayerTest {
    Player player;
    Ranking ranking;

    @Before
    public void initialise() {
        ranking = new Ranking();
        player = new Player("Michael van Gerwen", "Mighty Mike", 1);
    }

    @Test
    public void testPlayerHasName() {
        assertEquals("Michael van Gerwen", player.getName());
    }

    @Test
    public void testPlayerHasNickname() {
        assertEquals("Mighty Mike", player.getNickname());
    }

    @Test
    public void testPlayerHasRanking() {
        assertEquals(1, player.getRanking());
    }

    @Test
    public void testPlayerDetails() {
        assertEquals("Name: Michael van Gerwen, Nickname: Mighty Mike, Ranking: 1",  player.toString());
    }

    @Test
    public void getRankingsTest() {
        assertNotNull(ranking.getRankings());
    }

    @Test
    public void getRankingAtIndexTest() {
        assertEquals("Name: Michael van Gerwen, Nickname: Mighty Mike, Ranking: 1", ranking.getRankingAtIndex(0).toString());
    }



    @Test
    public void addPlayerToRanking() {
        player = new Player("Peter Wright", "Snakebite", 3);
        ranking.add(player);
        assertEquals("Name: Peter Wright, Nickname: Snakebite, Ranking: 3", ranking.getRankingAtIndex(2).toString());
    }

    @Test
    public void replaceLowestRankedPlayer() {
        player = new Player("Peter Wright", "Snakebite", 2);
        ranking.set(1, player);
        assertEquals("Name: Peter Wright, Nickname: Snakebite, Ranking: 2", ranking.getRankingAtIndex(2).toString());
    }


}


