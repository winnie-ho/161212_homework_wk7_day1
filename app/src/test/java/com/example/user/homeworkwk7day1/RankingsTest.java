package com.example.user.homeworkwk7day1;
import org.junit.*;
import static org.junit.Assert.*;
/**
 * Created by user on 12/12/2016.
 */
public class RankingsTest {
    Rankings rankings;
    Athlete athlete1;
    Athlete athlete2;
    Athlete athlete5;
    Athlete athlete10;
    Athlete athlete10_2;

    @Before
    public void before(){
        rankings = new Rankings();
        athlete1 = new Athlete("Brianne Theisan Eaton", "Canadian", 1);
        athlete2 = new Athlete("Jessica Ennis-Hill", "British", 2);
        athlete5 = new Athlete("Carolin Schafer", "German", 5);
        athlete10 = new Athlete("Barbara Nwaba", "American", 10);
        athlete10_2 = new Athlete ("Ida Antoinette Nana Djimou", "French", 10);
    }

    @Test
    public void athleteCountTest(){
        assertEquals(0, rankings.athleteCount());
    }

    @Test
    public void top10RankingsFullTest(){
        assertEquals(false,rankings.topTenFull());
    }

    @Test
    public void addAthleteTest(){
        rankings.addAthlete(athlete1);
        rankings.addAthlete(athlete2);
        assertEquals(2, rankings.athleteCount());
    }
//
    @Test
    public void returnAthleteByIndex(){
        rankings.addAthlete(athlete1);
        rankings.addAthlete(athlete2);
        rankings.addAthlete(athlete5);
        assertEquals("Carolin Schafer", rankings.findAthlete(5).getName());
    }

    @Test
    public void addAthleteToEndOfRankings(){
        rankings.addAthlete(athlete10);
        rankings.addAthlete(athlete10_2);
        assertEquals("Ida Antoinette Nana Djimou", rankings.findAthlete(10).getName());
    }
}
