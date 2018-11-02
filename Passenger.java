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
//parent abstract class
public abstract class Passenger {

    private String name;
    private int age;
    //the super class
    public Passenger() {
        name = "";
        age = 0;
    }
    //returns the name of the passenger
    public String getName() {
        return name;
    }
    //returns the age of the passenger
    public int getAge() {
        return age;
    }
    //sets the name of the passeneger
    public void setName(String name1) {
        name = name1;
    }
    //sets the age of the passenger
    public void setAge(int age1) {
        age = age1;
    }
    //an abstract method that is modified in the member and nonmember class
    public abstract double applyDiscount(double p);
}
