/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gofo;

import java.util.ArrayList;

/**
 * The PlaygroundOwner Class created to maintain all the data of Playground Owner
 * @author Mohammed Mashhoot Mohammed ( ID : 20190478, Group : S22)
 * @version 1.0
 * @since 6/11/2021
 * and the class has three attributes
 *
 * playground: represents list of playgrounds of the playground owner
 * bookings : represents list of books of the playgrounds of the playground owner
 * ewallet : represent Playground Owner's E-Wallet
 */
public class PlaygroundOwner extends User{
    
    private ArrayList<Playground> playground = new ArrayList<Playground>();
    private ArrayList<Booking> bookings = new ArrayList<Booking>();
    public EWallet ewallet;
    
    /**
     * this method is created to copy all books that belong to a playground 
     * owner from the system bookings list to owner bookings list 
     * @param gofo this parameter represents the system object 
     */
    void setBooks(GoFoSystem gofo){
        for(int i = 0; i < gofo.bookings.size(); i++)
        {
            for(int j = 0; j < this.playground.size(); j++)
            {
                if(gofo.bookings.get(i).getPlaygroundName().equalsIgnoreCase(this.playground.get(j).getName()))
                {
                    if(!(this.bookings.contains(gofo.bookings.get(i))))
                        this.bookings.add(gofo.bookings.get(i));
                }
                
            }
        }
    }
    
    /**
     * this method is used to display the bookings that are 
     * accepted from the playground owner
     * @param gofo this parameter represents the system object
     */
    public void seeBooks(GoFoSystem gofo){
        this.setBooks(gofo);
        for(int i = 0 ; i<this.bookings.size(); i++)
        {
            try{
                if(this.bookings.get(i).getStatus().equalsIgnoreCase("accepted"))
                    this.bookings.get(i).viewBooking();
            }catch(NullPointerException ex){
                System.out.println("Error..");
            }
        }
    }
    
    /**
     * this method is used to display all books that not accepted till now 
     * @param gofo this parameter represents the system object
     */
    public void seeRequests(GoFoSystem gofo){
        this.setBooks(gofo);
        for(int i = 0 ; i<this.bookings.size(); i++)
        {
            if(!"accepted".equals(this.bookings.get(i).getStatus()))
                this.bookings.get(i).viewBooking();
        }
    } 
    
    /**
     * this method is created to enable playground owner to accept requests 
     * @param requestName represent request name
     * @param gofo this parameter represents the system object
     */
    public void acceptRequest(String requestName, GoFoSystem gofo){
        this.setBooks(gofo);
        for(int i = 0 ; i<this.bookings.size(); i++)
        {
            if(this.bookings.get(i).getPlaygroundName().equalsIgnoreCase(requestName))
                this.bookings.get(i).setStatus("accepted");
        }
    }
    
    /**
     * this method is created to enable playground owner to refuse requests 
     * @param requestName represent request name
     * @param gofo this parameter represents the system object
     */
    public void refuseRequest(String requestName, GoFoSystem gofo){
        this.setBooks(gofo);
        for(int i = 0 ; i<this.bookings.size(); i++)
        {
             if(this.bookings.get(i).getPlaygroundName().equalsIgnoreCase(requestName))
             {
                this.bookings.get(i).setStatus("refused");
             }
        }
    }
           
    /**
     * this method return the ewallet
     * @return EWallet
     */
    public EWallet getEwallet() {
        return ewallet;
    }
    
    /**
     * this method set ewallet
     * @param ewallet represent the ewallet
     */
    public void setEwallet(EWallet ewallet) {
        this.ewallet = ewallet;
    }
    
    /**
     * this method take 
     * @param name
     * @return 
     * 
     */
    public Playground getPlayground(String name) {
        for(int i =0; i < playground.size(); i++ ){
            if(this.playground.get(i).getName().equalsIgnoreCase(name))
                return this.playground.get(i);
        }
        return null;
    }
    
    /**
     * used to add playground
     * @param playground playground that will added
     */
    public void addPlayground(Playground playground) {
        this.playground.add(playground);
    }

    /**
     * display playgrounds 
     */
    public void displayPlaygrounds(){
        for(int i =0; i< playground.size(); i++ )
        {
            System.out.println(this.playground.get(i).toString());
        }
    }
    
    /**
     * log in the system
     * @param name playground name
     * @param password playground password 
     * @return PlaygroundOwner
     */
    PlaygroundOwner logIn(String name, String password){
        if(this.getName().equalsIgnoreCase(name) && this.getPassword().equalsIgnoreCase(password))
            return this;
        return null;
    }
                    
}