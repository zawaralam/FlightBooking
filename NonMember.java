/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package COE528.lab1;

/**
 *
 * @author zawar
 */
public class NonMember extends Passenger {

    private double price;
    //initialized the nonmember class by using the parent class passenger
    public NonMember() {
        super();
    }

    /**
     *
     * @param p
     * @return
     */
    @Override
    //applies a discound to the original price, based off the age of the passenger
    public double applyDiscount(double p) {
        price = p;
        if (super.getAge() > 65) {
            price = 0.90 * p;
        }
        return price;
    }
}
