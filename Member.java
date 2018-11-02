/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package COE528.lab1;
import java.util.Scanner;
/**
 *
 * @author zawar
 */
public class Member extends Passenger {

    private int yearsOfMembership;
    private double price;
    //initializes the member class by using the parent class passenger
    public Member() {
        super();
        yearsOfMembership = 0;
    }
    //returns the years of membership of a flight
    public int getYearsOfMembership()
    {
        return yearsOfMembership;
    }
    //sets the years of membership of a flight
    public void setYearsOfMembership(int years){
        yearsOfMembership = years;
    }
    @Override
    //applies the disount on the original price of a ticket based off the years of membership of the passenger
    public double applyDiscount(double p) {
        price = p;
        Scanner scan = new Scanner(System.in);
        System.out.println("How many years have you been a member?");
        yearsOfMembership = scan.nextInt();
        if (yearsOfMembership > 5) {
            price = 0.50 * p;
        } else {
            price = 0.90 * p;
        }
        return price;
    }

}
