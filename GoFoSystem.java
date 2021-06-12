/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gofo;

import java.util.ArrayList;

/**
 * The GoFoSystem Class is the class that holds and contain all the data and provide it for all members 
 * @author Mohammed Mashhoot Mohammed ( ID : 20190478, Group : S22)
 * @version 1.0
 * @since 6/11/2021
 * and the class has six attributes
 *
 * teams is an array list variable that has all teams
 * ewallets is an array list variable that has all ewallets
 * players is an array list variable that has all players
 * playgrounds is an array list variable that has all playgrounds
 * owners is an array list variable that has all playground owners
 * bookings is an array list variable that has all bookings
 * 
 *
 */
public class GoFoSystem {
    ArrayList<Team> teams = new ArrayList<Team>();
    ArrayList<EWallet> ewallets = new ArrayList<EWallet>();
    ArrayList<Player> players = new ArrayList<Player>();
    ArrayList<Playground> playgrounds = new ArrayList<Playground>();
    ArrayList<PlaygroundOwner> owners = new ArrayList<PlaygroundOwner>(); 
    ArrayList<Booking> bookings = new ArrayList<Booking>();
    
    /**
     * this method is a special method because it takes a booking name and return a player
     * @param bookingName represent booking name
     * @return player
     */
    public Player getPlayer(String bookingName){
        for(int i = 0; i < bookings.size(); i++){
            if(bookings.get(i).getPlaygroundName().equalsIgnoreCase(bookingName)){
                for(int j =0; j<players.size(); j++ ){
                    if(bookings.get(i).getBookingApplicant() == players.get(j))
                        return players.get(j);
                }
            }
        }
        return null;
    }
    
    /**
     * this method used to add booking to the bookings list
     * @param booking 
     */
    public void addBooking(Booking booking){
        bookings.add(booking);
    }
    
    /**
     * this method used to add e-wallet to the ewallets list
     * @param ewallet 
     */
    public void addEWallet(EWallet ewallet){
        ewallets.add(ewallet);
    }
    
    /**
     * this method used to add team to the teams list
     * @param team 
     */
    public void addETeam(Team team){
        teams.add(team);
    }
    
    /**
     * this method used to add player to the players list
     * @param player 
     */
    public void addPlayer(Player player){
        players.add(player);
    }
    
    /**
     * this method used to add playground to the playgrounds list
     * @param playground 
     */
    public void addPlayground(Playground playground){
        playgrounds.add(playground);
    }
    
    /**
     * this method used to add owner to the owners list
     * @param owner 
     */
    public void addOwner(PlaygroundOwner owner){
        owners.add(owner);
    }
    
    
}
