package com.cc.java;

public class Level_2 {
    
    private String levelName = "Level 2";
    private int points= 1000;

    //mit Super() kann das man Overriding ausser Kraftsetzen
    public String play(){
        return "Yahoo, " + levelName + " here, and I have " + points + " points!";
    }

}
