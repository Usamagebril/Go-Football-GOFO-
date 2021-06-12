
package gofo;

/**
 * The Booking Class created to maintain all the data of player's Books
 * @author Usama Mohamed Gebril ( ID : 20190087, Group : S22)
 * @version 1.0
 * @since 6/11/2021
 * and the class has four attributes
 *
 * playgroundName: represents the Playground's name
 * bookedHours: represents how many hours the player wants to book
 * totalPay: represents the total cost
 * status : Playground's Active or not
 * bookingApplicant : represent booking owner
 */
public class Booking {
    
    private String playgroundName;
    private double bookedHours;
    private double totalPay;
    private String status;
    private Player bookingApplicant;

    /**
     * this method is used to return the booking owner
     * @return Player 
     */
    public Player getBookingApplicant() {
        return bookingApplicant;
    }

    /**
     * this function is used to set booking applicant
     * @param bookingApplicant represent booking applicant
     */
    public void setBookingApplicant(Player bookingApplicant) {
        this.bookingApplicant = bookingApplicant;
    }

    /**
     * this method is used to return Playground's status
     * @return String this return Playground's status
     */
    public String getStatus() {
        return status;
    }
    /**
     * this method is used to set Playground's status
     * @param  status  represents Playground's status
     */
    public void setStatus(String status) {
        this.status = status;
    }
    /**
     * this method is used to return Playground's name
     * @return String this return Playground's name
     */
    public String getPlaygroundName() {
        return playgroundName;
    }
    /**
     * this method is used to set Playground's name
     * @param  playgroundName  represents Playground's name
     */
    public void setPlaygroundName(String playgroundName) {
        this.playgroundName = playgroundName;
    }
    /**
     * this method is used to return Playground's Booked Hours
     * @return double this return Playground's Booked Hours
     */
    public double getBookedHours() {
        return bookedHours;
    }
    /**
     * this method is used to set Booked Hours
     * @param  bookedHours  represents Booked Hours
     */
    public void setBookedHours(double bookedHours) {
        this.bookedHours = bookedHours;
    }
    /**
     * this method is used to return The Total Pay
     * @return double this return The Total Pay
     */
    public double getTotalPay() {
        return totalPay;
    }
    /**
     * this method is used to set The Total Pay
     * @param totalPay represents The Total Pay
     */
    public void setTotalPay(double totalPay) {
        this.totalPay = totalPay;
    }
    /**
     * this method is used to return The Total Pay calculated
     * @param price
     * @param hours
     * @return double this return The Total Pay calculated
     */
    public double calculateTotalPrice(double price, double hours){
        return price * hours;
    }

    /**
     * this method is used to print out all the Bookings info
     */
    void viewBooking(){
        System.out.println(
                "-------------Booking Info-------------\n"+
                "Playground name: "+ this.getPlaygroundName() +"\n"+
                "Player: "+ this.getBookingApplicant().getName() +"\n"+
                "Booked hours: "+ this.getBookedHours() +"\n"+
                "Total pay: "+ this.getTotalPay() +"\n"+
                "Status: "+ this.getStatus() +"\n"
                
        );
    }
}
