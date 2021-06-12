/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gofo;

import java.util.ArrayList;

/**
 * The Team Class created to maintain all the data of each Team
 * @author Mohammed Mashhoot Mohammed ( ID : 20190478, Group : S22)
 * @version 1.0
 * @since 6/11/2021
 * and the class has three attributes
 *
 * teamName: represents the Team's name
 * teamNumber : represents the Number of players in each team
 * Player : This arraylist store player's team in it
 */
public class Team {
    private String teamName;
    private int teamNumber;
    private ArrayList<Player> teamMembers = new ArrayList<Player>(11);

    /**
     * this method is used to return Team's name
     * @return String this return Team's name
     */
    public String getTeamName() {
        return teamName;
    }
    /**
     * this method is used to set Team's name
     * @param teamName represents Team's name
     */
    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }
    /**
     * this method is used to return Team's Number of players
     * @return int this return Team's Number of players
     */
    public int getTeamNumber() {
        return teamNumber;
    }
    /**
     * this method is used to set Team's Number of players
     * @param teamNumber represents Team's Number of players
     */
    public void setTeamNumber(int teamNumber) {
        this.teamNumber = teamNumber;
    }

    /**
     * this method is used to add players to the team
     * @param player represents the player
     */
    void addMember(Player player){
        if (teamMembers.size() < teamNumber)
            teamMembers.add(player);
        else
            System.out.println("sorry: team is completed");
    }
    
}
