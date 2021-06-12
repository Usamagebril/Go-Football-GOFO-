package gofo;

/**
 * The User Class created to maintain all the data of each User whether player or playground owner
 * @author Usama Mohammed Gebril ( ID : 20190087, Group : S22)
 * @author Mohammed Mashhoot Mohammed ( ID : 20190478, Group : S22)
 * @version 1.0
 * @since 6/11/2021
 * and the class has six attributes
 *
 * name: represents the User's name
 * ID : represents the ID of the User
 * password : represents the User password
 * Email : represents the User Mail
 * phone : represents the number phone of the User
 * location: represents User Location
 *
 */
abstract class User {
    private String name ;
    private int id ;
    private String password ;
    private String email ;
    private String phone ;
    private String location ;

    /**
     * the default constructor created to initial the attributes
     */
    public User(){
        this.name = "N/A" ;
        this.id = 0 ;
        this.password = "N/A" ;
        this.email = "N/A" ;
        this.phone = "N/A" ;
        this.location = "N/A" ;
    }

    /**
     * this parameterized constructor is created to set values for User Attributes 
     * @param name this parameter represents User's name
     * @param id this parameter represents User's ID
     * @param password this parameter represents User's password
     * @param email this parameter represents User's Mail
     * @param phone this parameter represents User's Phone
     * @param location this parameter represents User's Location
     */
    public User(String name , int id ,String password ,
                String email ,String phone ,String location ){
        this.name = name ;
        this.id = id;
        this.password = password ;
        this.email = email ;
        this.phone = phone ;
        this.location = location ;
    }

    
    /**
     * this method is used to store User's information for making the user member at the system
     * @param name this parameter represents User's name
     * @param id this parameter represents User's ID
     * @param password this parameter represents User's password
     * @param email this parameter represents User's Mail
     * @param phone this parameter represents User's Phone
     * @param location this parameter represents User's Location
     */
    void signUp(String name, String email, String password, String phone, String location, int id ){
        setName(name);
        setId(id);
        setEmail(email);
        setPassword(password);
        setPhone(phone);
        setLocation(location);
    }
    
    /**
     * this method is used to check if User's name and password is true to access him to his profile
     * @param name this parameter represents User's name
     * @param password this parameter represents User's password
     */
    boolean checkLogIn(String name, String password){
        if(this.getName().equalsIgnoreCase(name) && this.getPassword().equalsIgnoreCase(password))
            return true;
        return false;    
    }
    
    
    /**
     * this method is used to return User's name
     * @return String this return User's name
     */
    public String getName() {
        return name;
    }
    /**
     * this method is used to set User's name
     * @param  name  represents User's name
     */
    public void setName(String name) {
        this.name = name;
    }
    /**
     * this method is used to return User's id
     * @return int this return User's id
     */
    public int getId() {
        return id;
    }
    /**
     * this method is used to set User's id
     * @param  id  represents User's id
     */
    public void setId(int id) {
        this.id = id;
    }
    /**
     * this method is used to return User's password
     * @return String this return User's password
     */
    public String getPassword() {
        return password;
    }
    /**
     * this method is used to set User's password
     * @param password  represents User's password
     */
    public void setPassword(String password) {
        this.password = password;
    }
    /**
     * this method is used to return User's email
     * @return String this return User's email
     */
    public String getEmail() {
        return email;
    }
    /**
     * this method is used to set User's email
     * @param email  represents User's email
     */
    public void setEmail(String email) {
        this.email = email;
    }
    /**
     * this method is used to return User's phone
     * @return String this return User's phone
     */
    public String getPhone() {
        return phone;
    }
    /**
     * this method is used to set User's phone
     * @param phone represents User's phone
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * this method is used to return User's Location
     * @return String this return User's Location
     */
    public String getLocation() {
        return location;
    }
    /**
     * this method is used to set User's location
     * @param location represents User's location
     */
    public void setLocation(String location) {
        this.location = location;
    }
    
    /**
     * this method is used to print out all the User's info
     */
    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", location='" + location + '\'' +
                '}';
    }
}
