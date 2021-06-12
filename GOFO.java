/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gofo;

import java.util.Scanner;

/**
 * this is main class to run the project and use every class has been created and view user tabs 
 * @author Mohammed Mashhoot Mohammed ( ID : 20190478, Group : S22)
 * @author Usama Mohamed Gebril ( ID : 20190087, Group : S22)
 * @author Andrew Mamdouh Fayez ( ID : 20190113, Group : S21)
 * @version 1.0
 * @since 6/11/2021
 */
public class GOFO {

    /**
     * 
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
       GoFoSystem gofo = new GoFoSystem();
        
       Scanner input = new Scanner(System.in);
       while (true)
       {
           /**
            * First Page of the app
            * */
            System.out.println("Hello In GoFo\n");
            System.out.println("1- Sign Up");
            System.out.println("2- Log In");
            System.out.println("3- Exit");
            
            int selectValue = input.nextInt();
            switch(selectValue)
            {
                /**
                 * User Will enter his personal data  
                 * */
                case 1:
                    System.out.println("Input your name: ");
                    String name = input.next();
                    
                    System.out.println("Input your id: ");
                    int id = input.nextInt();
                    
                    System.out.println("Input your password: ");
                    String password = input.next();
                    
                    System.out.println("Input your email: ");
                    String email = input.next();
                    
                    System.out.println("Input your phone: ");
                    String phone = input.next();
                    
                    System.out.println("Input your loction: ");
                    String location = input.next();
                    
                    /**User choosing to become a player or a playground owner
                     * */
                    System.out.println("Sign Up As:");
                    System.out.println("1- Player");
                    System.out.println("2- Playground owner");
                    
                    int choose = input.nextInt();
                    switch(choose)
                    {
                        case 1:
                            /**
                             * user select to be a player
                             */
                            Player player = new Player();
                            
                            /**
                             * player sign Up
                             */
                            player.signUp(name, email, password, phone, location, id);
                            
                            gofo.addPlayer(player);
                            int select = 0;
                            while(select !=10)
                            {     
                                /**
                                 * player menu
                                 */
                                System.out.println("1- Book playground");
                                System.out.println("2- Join team");
                                System.out.println("3- My Books");
                                System.out.println("10- Log Out");

                                select = input.nextInt();
                                switch(select)
                                {
                                    /**
                                     * Case 1 :
                                     * Player Booking Playground
                                     * */
                                    case 1:
                                        /**
                                         * Booking Options
                                         * */
                                        System.out.println("1- Display playgrounds");
                                        System.out.println("2- Filter near playground");
                                        System.out.println("3- Back");

                                        select = input.nextInt();
                                        switch(select)
                                        {

                                            case 1:
                                                /**
                                                 * Display Available Playgrounds
                                                 * */
                                                player.availablePlaygrounds(gofo);
                                                /**
                                                 * Player's Choices
                                                 * */
                                                System.out.println("1- Book ");
                                                System.out.println("2- Back");

                                                select = input.nextInt();
                                                switch(select)
                                                {
                                                    /**
                                                     * Case 1 :
                                                     * Player wants to book
                                                     * */
                                                    case 1:
                                                        System.out.println("Input playground name:");
                                                        name = input.next();
                                                        System.out.println("Input Booking hour/s:");
                                                        double hours = input.nextInt();

                                                        player.bookPlayground(name, hours, gofo);
                                                        break;
                                                        /**
                                                         * Case 2 :
                                                         * Player wants to go back to the menu
                                                         * */
                                                    case 2:
                                                        break;
                                                }
                                                break;
                                            /**
                                             * case 2 :
                                             * searching for the nearest playground
                                             * */
                                            case 2:
                                                player.filterPlaygrounds(gofo);
                                                
                                                System.out.println("1- Book ");
                                                System.out.println("2- Back");

                                                select = input.nextInt();
                                                /**
                                                 * Choices to book or to go back
                                                 * */
                                                switch(select)
                                                {
                                                    case 1:
                                                        System.out.println("Input playground name:");
                                                        name = input.next();
                                                        System.out.println("Input Booking hour/s:");
                                                        double hours = input.nextInt();

                                                        player.bookPlayground(name, hours, gofo);
                                                        break;
                                                    case 2:
                                                        break;
                                                }
                                                break;
                                        }
                                        break;

                                     /**
                                      * Case 2 :
                                      * Player Join Team
                                      * */
                                    case 2:
                                        System.out.println("Input team name:");
                                        name = input.next();
                                        
                                        player.joinTeam(name);
                                        break;
                                    /**
                                     * Case 3 :
                                     * Display Player's Booking List
                                     * */
                                    case 3:
                                        player.DisplayBookings();
                                        
                                        System.out.println("1- cancel booking:");
                                        System.out.println("2- Pay for a booking:");
                                        System.out.println("3- Back:");
                                        
                                        select = input.nextInt();
                                        /**
                                         * Player choices
                                         * (Cancel Booking or Pay for a booking or Go back to the menu)
                                         * */
                                        switch(select)
                                        {
                                            case 1:
                                                System.out.println("Input book name:");
                                                name = input.next();
                                                player.cancelBooking(name);
                                                break;
                                            case 2:
                                                System.out.println("Input book name:");
                                                name = input.next();
                                                
                                                System.out.println("Input ewallet number:");
                                                int number = input.nextInt();
                                                
                                                player.payForBooking(name, number);
                                                break;
                                            case 3:
                                                break;
                                        }
                                        break;
                                        /**
                                         * Case 10 :
                                         * Log Out
                                         * */
                                    case 10:
                                        break;

                                }
                            
                            }
                            break;
                        /**
                         * User wants to become a playground owner
                         * */
                        case 2:
                            PlaygroundOwner owner = new PlaygroundOwner();
                            
                            owner.signUp(name, email, password, phone, location, id);
                            
                            gofo.addOwner(owner);
                            select = 0;
                            /**
                             * Playground Owner Choices
                             * */
                            while(select != 4)
                            {
                                System.out.println("1- My playground");
                                System.out.println("2- Books");
                                System.out.println("3- My requests");
                                System.out.println("4- Log Out");
                                
                                select = input.nextInt();
                                switch(select)
                                {
                                    /**
                                     * Case 1 :
                                     * if the owner wants to add new playground or update one of them
                                     * */
                                    case 1:
                                        owner.displayPlaygrounds();
                                        while(select != 3)
                                        {
                                            System.out.println("1- Add new playground");
                                            System.out.println("2- Update playground information");
                                            System.out.println("3- Back");

                                            select = input.nextInt();
                                            switch(select)
                                            {
                                                case 1:
                                                    System.out.println("Input playground information");
                                                    System.out.println("Input name:");
                                                    name = input.next();                              
                                                    System.out.println("Input location:");
                                                    location = input.next();
                                                    System.out.println("Input size:");
                                                    int size = input.nextInt();
                                                    System.out.println("Input available hours:");
                                                    double availavleHourse = input.nextDouble();
                                                    System.out.println("Input price per hour:");
                                                    double price = input.nextDouble();
                                                    System.out.println("Input cancellation period:");
                                                    String cancellationPeriod = input.next();

                                                    Playground playground = new Playground(name, location, size, availavleHourse, price, cancellationPeriod);
                                                    owner.addPlayground(playground);
                                                    gofo.addPlayground(playground);
                                                    break;
                                                case 2:
                                                    System.out.println("Input playground name:");
                                                    name = input.next();  
                                                    String tempName = name; 
                                                    while(select != 7)
                                                    {    
                                                       System.out.println("1- Update name");
                                                       System.out.println("2- Update location");
                                                       System.out.println("3- Update size");
                                                       System.out.println("4- Update available hours");
                                                       System.out.println("5- Update price per hour");
                                                       System.out.println("6- Update cancellation period");
                                                       System.out.println("7- Back:");

                                                       select = input.nextInt();
                                                       try{
                                                           
                                                            switch(select)
                                                            {
                                                                case 1:
                                                                   System.out.println("Input name:"); 
                                                                   name = input.next();
                                                                   owner.getPlayground(tempName).setName(name);
                                                                   break;
                                                                case 2:
                                                                   System.out.println("Input location:");
                                                                   location = input.next();
                                                                   owner.getPlayground(tempName).setLocation(location);
                                                                   break;
                                                                case 3:
                                                                   System.out.println("Input size:");
                                                                   size = input.nextInt();
                                                                   owner.getPlayground(tempName).setSize(size);
                                                                   break;
                                                                case 4:
                                                                   System.out.println("Input available hours:");
                                                                   availavleHourse = input.nextDouble();
                                                                   owner.getPlayground(tempName).setAvailableHours(availavleHourse);
                                                                   break;
                                                                case 5:
                                                                   System.out.println("Input price:");
                                                                   price = input.nextDouble();
                                                                   owner.getPlayground(tempName).setPricePerHour(price);
                                                                   break;
                                                                case 6:
                                                                   System.out.println("Input cancellation period:");
                                                                   cancellationPeriod = input.next();
                                                                   owner.getPlayground(tempName).setCancelLocationPeriod(cancellationPeriod);
                                                                   break;
                                                                case 7:
                                                                    break;
                                                            }
                                                            
                                                       }catch(NullPointerException ex){
                                                           System.out.println("Error: invalid playground");
                                                       }
                                                    }
                                                    break;
                                            }
                                        }
                                        break;
                                    /**
                                     * display books
                                     * */
                                    case 2:
                                        owner.seeBooks(gofo);
                                        break;
                                    /**
                                     * request list
                                     * */
                                    case 3:
                                        owner.seeRequests(gofo);
                                        System.out.println("1- Accept request:");
                                        System.out.println("2- refuse request:");
                                        System.out.println("3- Back:");
                                        
                                        select = input.nextInt();
                                        switch(select)
                                        {
                                            case 1:
                                                System.out.println("Input request name:");
                                                name = input.next();
                                                owner.acceptRequest(name, gofo);
                                                try{
                                                    gofo.getPlayer(name).updateStatus(name, "accepted");
                                                }catch(NullPointerException ex){
                                                    System.out.println("Error: invalid request name");
                                                }
                                                break;
                                            case 2:
                                                System.out.println("Input request name:");
                                                name = input.next();
                                                owner.refuseRequest(name, gofo);
                                                try{
                                                    gofo.getPlayer(name).updateStatus(name, "refused");
                                                }catch(NullPointerException ex){
                                                    System.out.println("Error: invalid request name");
                                                }
                                                break;
                                            case 3:
                                                break;
                                        }
                                        break;
                                    /**
                                     * Log Out
                                     * */
                                    case 4:
                                        break;
                                        
                                }
                            }
                            
                            break;
                    }
                    break;
                /**
                 * If user got already account in the app . He will log in directly
                 * */
                case 2:
                    System.out.println("Input your name: ");
                     name = input.next();
                    
                    System.out.println("Input your password: ");
                    password = input.next();
                    
                    for(int i =0; i< gofo.players.size(); i++)
                    {
                        
                        Player player = gofo.players.get(i).logIn(name, password);
                        if(gofo.players.get(i).checkLogIn(name, password))
                        {
                            
                            /**
                             * Player's Menu
                             * */
                            int select = 0;
                            while(select !=10)
                            {     
                                System.out.println("1- Book playground");
                                System.out.println("2- Join team");
                                System.out.println("3- My Books");
                                System.out.println("10- Log Out");

                                select = input.nextInt();
                                switch(select)
                                {
                                    case 1:
                                        System.out.println("1- Display playgrounds");
                                        System.out.println("2- Filter near playground");
                                        System.out.println("3- Back");

                                        select = input.nextInt();
                                        switch(select)
                                        {
                                            case 1:
                                                player.availablePlaygrounds(gofo);

                                                System.out.println("1- Book ");
                                                System.out.println("2- Back");

                                                select = input.nextInt();
                                                switch(select)
                                                {
                                                    case 1:
                                                        System.out.println("Input playground name:");
                                                        name = input.next();
                                                        System.out.println("Input Booking hour/s:");
                                                        double hours = input.nextInt();

                                                        player.bookPlayground(name, hours, gofo);
                                                        break;
                                                    case 2:
                                                        break;
                                                }
                                                break;
                                            case 2:
                                                player.filterPlaygrounds(gofo);
                                                
                                                System.out.println("1- Book ");
                                                System.out.println("2- Back");

                                                select = input.nextInt();
                                                switch(select)
                                                {
                                                    case 1:
                                                        System.out.println("Input playground name:");
                                                        name = input.next();
                                                        System.out.println("Input Booking hour/s:");
                                                        double hours = input.nextInt();

                                                        player.bookPlayground(name, hours, gofo);
                                                        break;
                                                    case 2:
                                                        break;
                                                }
                                                break;
                                        }
                                        break;
                                    case 2:
                                        System.out.println("Input team name:");
                                        name = input.next();
                                        
                                        player.joinTeam(name);
                                        break;
                                    case 3:
                                        player.DisplayBookings();
                                        
                                        System.out.println("1- cancel booking:");
                                        System.out.println("2- Pay for a booking:");
                                        System.out.println("3- Back:");
                                        
                                        select = input.nextInt();
                                        switch(select)
                                        {
                                            case 1:
                                                System.out.println("Input book name:");
                                                name = input.next();
                                                player.cancelBooking(name);
                                                break;
                                            case 2:
                                                System.out.println("Input book name:");
                                                name = input.next();
                                                
                                                System.out.println("Input ewallet number:");
                                                int number = input.nextInt();
                                                
                                                player.payForBooking(name, number);
                                                break;
                                            case 3:
                                                break;
                                        }
                                        break;
                                    case 10:
                                        break;

                                }
                            
                            }
                            break;
                        }
                    }
                    
                    for(int i =0; i< gofo.owners.size(); i++)
                    {
                        PlaygroundOwner owner = gofo.owners.get(i).logIn(name, password);
                        if(gofo.owners.get(i).checkLogIn(name, password))
                        {
                            /**
                             * Playgrund Owner's Menu
                             * */
                            int select = 0;
                            while(select != 4)
                            {
                                System.out.println("1- My playground");
                                System.out.println("2- Books");
                                System.out.println("3- My requests");
                                System.out.println("4- Log Out");
                                
                                select = input.nextInt();
                                switch(select)
                                {
                                    case 1:
                                        owner.displayPlaygrounds();
                                        while(select != 3)
                                        {
                                            System.out.println("1- Add new playground");
                                            System.out.println("2- Update playground information");
                                            System.out.println("3- Back");

                                            select = input.nextInt();
                                            switch(select)
                                            {
                                                case 1:
                                                    System.out.println("Input playground information");
                                                    System.out.println("Input name:");
                                                    name = input.next();                              
                                                    System.out.println("Input location:");
                                                    location = input.next();
                                                    System.out.println("Input size:");
                                                    int size = input.nextInt();
                                                    System.out.println("Input available hours:");
                                                    double availavleHourse = input.nextDouble();
                                                    System.out.println("Input price per hour:");
                                                    double price = input.nextDouble();
                                                    System.out.println("Input cancellation period:");
                                                    String cancellationPeriod = input.next();

                                                    Playground playground = new Playground(name, location, size, availavleHourse, price, cancellationPeriod);
                                                    owner.addPlayground(playground);
                                                    gofo.addPlayground(playground);
                                                    break;
                                                case 2:
                                                    System.out.println("Input playground name:");
                                                    name = input.next();  
                                                    String tempName = name; 
                                                    while(select != 7)
                                                    {    
                                                       System.out.println("1- Update name:");
                                                       System.out.println("2- Update location:");
                                                       System.out.println("3- Update size:");
                                                       System.out.println("4- Update available hours:");
                                                       System.out.println("5- Update price per hour:");
                                                       System.out.println("6- Update cancellation period:");
                                                       System.out.println("7- Back:");

                                                       select = input.nextInt();
                                                       switch(select)
                                                       {
                                                           case 1:
                                                                System.out.println("Input name:"); 
                                                                name = input.next();
                                                                owner.getPlayground(tempName).setName(name);
                                                                break;
                                                             case 2:
                                                                System.out.println("Input location:");
                                                                location = input.next();
                                                                owner.getPlayground(tempName).setLocation(location);
                                                                break;
                                                             case 3:
                                                                System.out.println("Input size:");
                                                                size = input.nextInt();
                                                                owner.getPlayground(tempName).setSize(size);
                                                                break;
                                                             case 4:
                                                                System.out.println("Input available hours:");
                                                                availavleHourse = input.nextDouble();
                                                                owner.getPlayground(tempName).setAvailableHours(availavleHourse);
                                                                break;
                                                             case 5:
                                                                System.out.println("Input price:");
                                                                price = input.nextDouble();
                                                                owner.getPlayground(tempName).setPricePerHour(price);
                                                                break;
                                                             case 6:
                                                                System.out.println("Input cancellation period:");
                                                                cancellationPeriod = input.next();
                                                                owner.getPlayground(tempName).setCancelLocationPeriod(cancellationPeriod);
                                                                break;
                                                             case 7:
                                                                 break;
                                                       }

                                                       owner.getPlayground(name);
                                                    }
                                                    break;
                                            }
                                        }
                                        break;
                                    case 2:
                                        owner.seeBooks(gofo);
                                        break;
                                    case 3:
                                        owner.seeRequests(gofo);
                                        System.out.println("1- Accept request:");
                                        System.out.println("2- refuse request:");
                                        System.out.println("3- Back:");
                                        
                                        select = input.nextInt();
                                        switch(select)
                                        {
                                            case 1:
                                                System.out.println("Input request name:");
                                                name = input.next();
                                                owner.acceptRequest(name, gofo);
                                                break;
                                            case 2:
                                                System.out.println("Input request name:");
                                                name = input.next();
                                                owner.refuseRequest(name, gofo);
                                                break;
                                            case 3:
                                                break;
                                        }
                                        break;
                                    case 4:
                                        break;
                                        
                                }
                            }
                            
                            break;
                        }
                    }
                    break;
                /**
                 * Exit The App
                 * */    
                case 3:
                    return;
            }
       }
        
    }
    
}
