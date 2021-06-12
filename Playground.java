package gofo;

/**
 * The Playground Class created to maintain all the data of each Playground
 * @author Usama Mohamed Gebril ( ID : 20190087, Group : S22)
 * @version 1.0
 * @since 6/11/2021
 * and the class has six attributes
 *
 * name: represents the Playground's name
 * location: represents Playground's Location
 * size: represents how many players will play in the playground
 * availableHours : Playground's Available Hours
 * pricePerHour : Playground's Price Per Hour
 * cancellationPeriod : represents the available period of time that the user could cancel the book
 */
public class Playground {
    private String name ;
    private String location ;
    private int size ;
    private double availableHours ;
    private double pricePerHour ;
    private String cancellationPeriod ;
    
    /**
     * the default constructor created to initial the attributes
     */
    public Playground(){
        this.name = "N/A" ;
        this.location = "N/A" ;
        this.size = 0 ;
        this.availableHours = 0;
        this.pricePerHour = 0.0f ;
        this.cancellationPeriod = "N/A" ;
    }
    
    /**
     * this parameterized constructor is created to set values for Playground Attributes 
     * @param name this parameter represents Playground's name
     * @param location this parameter represents Playground's location
     * @param size this parameter represents Playground's available number of players in the match
     * @param availableHours this parameter represents Playground's Available Hours
     * @param pricePerHour this parameter represents Playground's Price Per Hour
     * @param cancelLocationPeriod this parameter represents Playground's cancelation period
     */
    public Playground(String name ,String location , int size , double availableHours, 
                      double pricePerHour ,String cancelLocationPeriod){
        this.name = name ;
        this.location = location ;
        this.size = size ;
        this.availableHours = availableHours ;
        this.pricePerHour = pricePerHour ;
        this.cancellationPeriod = cancelLocationPeriod ;
    }

    /**
     * this method is used to return Playground's name
     * @return String this return Playground's name
     */
    public String getName() {
        return name;
    }
    /**
     * this method is used to set Playground's name
     * @param  name  represents Playground's name
     */
    public void setName(String name) {
        this.name = name;
    }
    /**
     * this method is used to return Playground's Location
     * @return String this return Playground's Location
     */
    public String getLocation() {
        return location;
    }
    /**
     * this method is used to set Playground's Location
     * @param location  represents Playground's Location
     */
    public void setLocation(String location) {
        this.location = location;
    }
    /**
     * this method is used to return Playground's no. of players in one match
     * @return int this return Playground's no. of players in one match
     */
    public int getSize() {
        return size;
    }
    /**
     * this method is used to set Playground's no. of players in one match
     * @param size  represents Playground's no. of players in one match
     */
    public void setSize(int size) {
        this.size = size;
    }
    /**
     * this method is used to return Playground's Price Per Hour
     * @return double this return Playground's Price Per Hour
     */
    public double getPricePerHour() {
        return pricePerHour;
    }
    /**
     * this method is used to set Playground's Price Per Hour
     * @param pricePerHour  represents Playground's Price Per Hour
     */
    public void setPricePerHour(double pricePerHour) {
        this.pricePerHour = pricePerHour;
    }
    /**
     * this method is used to return Playground's Cancelation period
     * @return String this return Playground's Cancelation period
     */
    public String getCancellationPeriod() {
        return this.cancellationPeriod;
    }
    /**
     * this method is used to set Playground's Cancelation period
     * @param cancellationPeriod represents Playground's Cancelation period
     */
    public void setCancelLocationPeriod(String cancellationPeriod) {
        this.cancellationPeriod = cancellationPeriod;
    }
    /**
     * this method is used to return Playground's Available Hours
     * @return double this return Playground's Available Hours
     */
    public double getAvailableHours() {
        return availableHours;
    }
    /**
     * this method is used to set Playground's Available Hours
     * @param availableHours represents Playground's Available Hours
     */
    public void setAvailableHours(double availableHours) {
        this.availableHours = availableHours;
    }

    /**
     * this method is used to print out all the Playground's info
     * @return String
     */
    @Override
    public String toString() {
        return "Playground{ "+
                "name = '" + name +
                "', location = '" + location +
                "', size = " + size +
                ", availableHours = " + availableHours +
                ", pricePerHour = " + pricePerHour +
                ", cancellationPeriod = '" + cancellationPeriod +
                "' }";
    }
}
