package com.example.user.homeworkwk7day1;
import org.junit.*;
import static org.junit.Assert.*;
/**
 * Created by user on 12/12/2016.
 */
public class AthleteTest {
    Athlete player;

    @Before
    public void before(){
        player = new Athlete("Brianne Theisan Eaton", "Canadian", 1);
    }

    @Test
    public void getNameTest(){
        assertEquals("Brianne Theisan Eaton", player.getName());
    }

    @Test
    public void getNationalityTest(){
        assertEquals("Canadian", player.getNationality());
    }

    @Test
    public void getRankingTest() {
        assertEquals(1, player.getRanking());
    }

    @Test
    public void toStringTest(){
        assertEquals("Name: Brianne Theisan Eaton, Nationality: Canadian, Ranking: 1", player.toString());
    }
}
