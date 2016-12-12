package com.example.user.homeworkwk7day1;

/**
 * Created by user on 12/12/2016.
 */
public class Athlete {
    private String name;
    private String nationality;
    private int currentRanking;

//    Constructor
    public Athlete(String name, String nationality, int currentRanking){
        this.name = name;
        this.nationality = nationality;
        this.currentRanking = currentRanking;
    }

//    Methods
    public String getName(){
        return this.name;
    }

    public String getNationality(){
        return this.nationality;
    }

    public int getRanking(){
        return this.currentRanking;
    }

    @Override
    public String toString(){
        return "Name: " + this.name + ", Nationality: " + this.nationality + ", Ranking: " + this.currentRanking;
    }
}
