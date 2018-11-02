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
//initializes the ticket object, and the instance variables inside
public class Ticket {
    private Passenger p ;
    private Flight flight;
    private double price=0.00;
    private static int ticketNumber;
    private int seats;
    //initializes the ticket object, and the instance variables inside
    public Ticket(Passenger p, Flight flight, double price)
    {   
        this.p = p;
        this.flight = flight;
        //reduces the seats left by 1, when a new ticket is created
        seats = flight.getNumberofSeatsLeft();
        flight.setNumberOfSeatsLeft(seats-1);
        this.price = price;
        ticketNumber = ticketNumber++;
    }
    //returns the object passenger
    public Passenger getPassenger()
    {
        return p;
    }
    //returns the object flight
    public Flight getFlight()
    {
        return flight;
    }
    //returns the final price of the ticket
    public double getPrice()
    {
        return price;
    }
    //returns the ticket number
     public double getTicketNumber()
    {
        return ticketNumber;
    }
    //sets the passenger opject
    public void setPassenger(Passenger passenger)
    {
        p = passenger;
    }
    //sets flight object
     public void setFlight(Flight f)
    {
        flight = f;
    }
     //sets the pice 
     public void setPrice(double cost)
    {
        price = cost;
    }
     @Override
     //displays information of the ticket and the flight
    public String toString()
    {
        return flight.toString() + ", ticket price:  $" + price   ;
    }
    
}
//