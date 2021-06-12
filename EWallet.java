/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gofo;

/**
 * The EWallet Class created to maintain all the data of E-Wallet
 * @author Mohammed Mashhoot Mohammed ( ID : 20190478, Group : S22)
 * @version 1.0
 * @since 6/11/2021
 * and the class has three attributes
 *
 * eWalletNumber: represents the E-Wallet Number
 * password : represents the E-Wallet password
 * balance : represent the E-Wallet balance
 */
public class EWallet {
    private int eWalletNumber ;
    private String password;
    private double balance;
   
     /**
     * the default constructor created to initial the attributes
     */
    EWallet(){
        this.balance = 0;
        this.eWalletNumber = 0;
        this.password = null;
    }
    
    /**
     * this parameterized constructor is created to set values for E-Wallet Attributes 
     * @param eWalletNumber this parameter represents User's and Playground Owner's Wallet
     * @param balance this parameter represents User's and Playground Owner's Money in this E-Wallet
     * @param password this parameter represents E-Wallet's password
     */
    EWallet(int eWalletNumber, String password, double balance){
        this.balance = balance;
        this.eWalletNumber = eWalletNumber;
        this.password = password;
    }
    
    /**
     * this method is used to return E-Wallet's number
     * @return int this return E-Wallet's number
     */
    public int geteWalletNumber() {
        return eWalletNumber;
    }
    
    /**
     * this method is used to set E-Wallet's number
     * @param eWalletNumber represents E-Wallet's number
     */
    public void seteWalletNumber(int eWalletNumber) {
        this.eWalletNumber = eWalletNumber;
    }
    
    /**
     * this method is used to return E-Wallet's password
     * @return String this return E-Wallet's password
     */
    public String getPassword() {
        return password;
    }
    
    /**
     * this method is used to set E-Wallet's password
     * @param password represents E-Wallet's password
     */
    public void setPassword(String password) {
        this.password = password;
    }
    
    /**
     * this method is used to return E-Wallet's balance
     * @return double this return E-Wallet's balance
     */
    public double getBalance() {
        return balance;
    }
    
    /**
     * this method is used to set E-Wallet's balance
     * @param balance represents E-Wallet's balance
     */
    public void setBalance(double balance) {
        this.balance = balance;
    }

    /**
     * this method is used to pay money for booking
     * @param payValue represents Booking Price
     */
    public void payForBooking(double payValue){
        this.balance -= payValue;
        System.out.println("**Money Payed**");
    }
    
    /**
     * this method is used to take money from player to playground owner
     * @param collectedValue represents Collect the money in playground owner's E-Wallet
     */
    public void collectMoney(double collectedValue){
        this.balance += collectedValue;
        System.out.println("**Money Collected**");
    }
    /**This method to return balance to player or playground owner
     * @return double return balance to player or playground owner
     * */
    public double checkMoney(){
        return this.balance;
    }
    
    /**
     * @param payValue
     * @param eWallet
     * */
    public void transferMoney(double payValue, EWallet eWallet){
        this.payForBooking(payValue);
        eWallet.collectMoney(payValue);
    }
    
}
