/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gofo;

import java.util.ArrayList;

/**
 * The Player Class is the class that represent the players on the system
 * @author Mohammed Mashhoot Mohammed ( ID : 20190478, Group : S22)
 * @version 1.0
 * @since 6/11/2021
 * have some attributes
 * bookings
 * gofo
 * ewallet
 */
public class Player extends User{
    ArrayList<Booking> bookings = new ArrayList<Booking>();
    GoFoSystem goFo;
    EWallet ewallet;
    
    /**
     * this method is used to update status of the player bookings and takes 
     * 2 parameters
     * @param name
     * @param status 
     */
    public void updateStatus(String name, String status){
        for(int i = 0; i < bookings.size(); i++){
            if(bookings.get(i).getPlaygroundName().equalsIgnoreCase(name))
                bookings.get(i).setStatus(status);
            
        }
    }
    
    /**
     * this function used to display all playgrounds that are on the System
     * takes 1 parameter
     * @param gofo represent GoFoSystem
     */
    public void availablePlaygrounds(GoFoSystem gofo)
    {
        for(int i = 0; i<gofo.playgrounds.size(); i++)
        {
            if(gofo.playgrounds.get(i).getAvailableHours() > 0)
                System.out.println(gofo.playgrounds.get(i).toString());
        }
    }
    
    /**
     * this function used to display all playgrounds that are on the System
     * and in the the sane area with the player
     * takes 1 parameter 
     * @param gofo represent GoFoSystem
     */
    public void filterPlaygrounds(GoFoSystem gofo)
    {
        for(int i = 0; i<gofo.playgrounds.size(); i++)
        {
            if(gofo.playgrounds.get(i).getLocation().equalsIgnoreCase(this.getLocation()))
                System.out.println(gofo.playgrounds.get(i).toString());
        }
    }
    
    /**
     * this method used to book a playground by taking the playground name 
     * and has 3 attributes
     * @param name represent playground name
     * @param hours represent hours 
     * @param gofo represent GoFoSystem
     */
    public void bookPlayground(String name, double hours, GoFoSystem gofo){
        for(int i = 0; i<gofo.playgrounds.size(); i++){
            if(gofo.playgrounds.get(i).getName().equalsIgnoreCase(name) && gofo.playgrounds.get(i).getAvailableHours() >= hours){
               Booking booking = new Booking();
               booking.setPlaygroundName(name);
               booking.setBookedHours(hours);
               booking.setBookingApplicant(this);
               double totalPay = booking.calculateTotalPrice(gofo.playgrounds.get(i).getPricePerHour(), hours);
               booking.setTotalPay(totalPay);
               this.bookings.add(booking);
               gofo.addBooking(booking);
               gofo.playgrounds.get(i).setAvailableHours(gofo.playgrounds.get(i).getAvailableHours() - hours);
            }
        }
        
    }
    
    /**
     * this function used to cancel booking
     * and takes one parameter 
     * @param bookingName represent playground name
     */
    public void cancelBooking(String bookingName){
        for(int i = 0; i < bookings.size(); i++){
            if(bookings.get(i).getPlaygroundName().equalsIgnoreCase(bookingName))
                bookings.remove(i);
        }
    }
    
    /**
     * this function used to pay booking
     * and takes two parameter 
     * @param bookingName represent playground name
     * @param ewalletnumber represent the ewallet number 
     */
    public void payForBooking(String bookingName, int ewalletnumber){
        EWallet wallet = null;
        try{
        for(int i =0; i<goFo.ewallets.size(); i++){
            if(goFo.ewallets.get(i).geteWalletNumber() == ewalletnumber)
                wallet = goFo.ewallets.get(i);
        }
        for(int i = 0; i < bookings.size(); i++){
            if(bookings.get(i).getPlaygroundName().equalsIgnoreCase(bookingName)){
                this.ewallet.transferMoney(bookings.get(i).getTotalPay(), wallet);
            }
                
        }
        }catch(NullPointerException ex){
            System.out.println("Error: invalid ewallet number");
        }
    }
    
    /**
     * used to join team
     * @param teamName 
     */
    public void joinTeam(String teamName){
        try{
        for(int i =0; i<goFo.teams.size(); i++){
            if(goFo.teams.get(i).getTeamName().equalsIgnoreCase(teamName))
                goFo.teams.get(i).addMember(this);
            else return;
        } 
        }catch(NullPointerException ex){
            System.out.println("Error: invalid team name");
        }
    }
    
    /**
     * this method is used to log in the system
     * @param name represent user name
     * @param password represent user password
     * @return player
     */
    Player logIn(String name, String password){
        if(this.getName().equalsIgnoreCase(name) && this.getPassword().equalsIgnoreCase(password))
            return this;
        return null;
    }
     /**
      * used to display bookings
      */
    public void DisplayBookings () {
        for(int i = 0; i < bookings.size(); i++){
            this.bookings.get(i).viewBooking();
        }
        if(bookings.size() < 1)
            System.out.println("You don't have any books till now");
    } 
    
}
