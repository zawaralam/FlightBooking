/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author zawar
 */
package COE528.lab1;

public class Flight {

    private int flightNumber;
    private String orgin;
    private String destination;
    private String departureTime;
    private int capacity;
    private static int numberofSeatsLeft;
    private double originalPrice=0.00;
    //Initialize the instance variables in the flight object
    public Flight(int flightNum, String org, String dest, String departTime, int cap, double origPrice) {
        flightNumber = flightNum;
        orgin = org;
        destination = dest;
        departureTime = departTime;
        capacity = cap;
        originalPrice = origPrice;
        numberofSeatsLeft = capacity;
        //throw the error that the destination can not be the same as the orgin
        if (orgin.equals(destination)) {
            throw new IllegalArgumentException("Orgin can not be Destination");

        }

    }
    //return the flight number
    public int getFlightNumber() {
        return flightNumber;
    }
    //return the orgin
    public String getOrgin() {
        return orgin;
    }
    //return the destination
    public String getDestination() {
        return destination;
    }
    //return the departure time
    public String getDepartureTime() {
        return departureTime;
    }
    // return the capacity
    public int getCapacity() {
        return capacity;
    }
    //return the number of seats left
    public int getNumberofSeatsLeft() {
        return numberofSeatsLeft;
    }
    //return the original price
    public double getOriginalPrice() {
        return originalPrice;
    }
    //set the flight number
    public void setFlightNumber(int flightNum)
    {
        flightNumber = flightNum;
    }
    //set the orgin
    public void setOrgin(String org)
    {
        orgin = org;
    }
    //set the destination
    public void setDestination(String dest)
    {
        destination = dest;
    }
    //set the departure time
    public void setDepartureTime(String departTime)
    {
        departureTime = departTime;
    }
    //set the capacity
    public void setCapacity(int cap)
    {
        capacity = cap;
    }
    //set the the number of seats left
    public void setNumberOfSeatsLeft(int numSeatsLeft)
    {
        numberofSeatsLeft = numSeatsLeft;
    }
    //set the original price
    public void setOriginalPrice(double origPrice)
    {
        originalPrice = origPrice;
    }
    //check if they are seats variable to book
    //checks the number of seats left is greater than 0
    public boolean bookASeat() {
        if (numberofSeatsLeft > 0) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    //Return information about the flight
    public String toString() {
        return "Flight " + flightNumber + ", " + orgin + " to " + destination + ", " + departureTime + ", Original Price: $" + originalPrice;
    }
}
