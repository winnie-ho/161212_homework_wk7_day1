package com.example.user.homeworkwk7day1;

import java.util.ArrayList;

/**
 * Created by user on 12/12/2016.
 */
public class Rankings {
    private Athlete[]rankings;

//    Constructor
    public Rankings(){
        this.rankings = new Athlete[10];
    }

//    Methods
    public int athleteCount(){
        int count = 0;
        for (Athlete athlete : rankings) {
            if (athlete != null) {
                count++;
            }
        }
        return count;
    }

    public boolean topTenFull(){
        return this.athleteCount()==rankings.length;
    }

    public void addAthlete(Athlete athlete){
        if (topTenFull()){
            return;
        }
        int athleteCount = this.athleteCount();
        rankings[athlete.getRanking()-1] = athlete;
    }

    public Athlete findAthlete(int rank){
        return rankings[rank-1];
    }

    public String findByName(String name){
        for (Athlete athlete : rankings) {
            if (athlete.getName().equals (name)){
               return athlete.toString();
            }
        }
        return "Athlete not found.";
    }



}

