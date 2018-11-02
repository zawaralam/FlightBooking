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
import java.util.ArrayList;
import java.util.Scanner;

public class Manager {

    //creats an arraylist of flights and ticket objects
    private static ArrayList<Flight> flights = new ArrayList<>();
    private static ArrayList<Ticket> tickets = new ArrayList<>();

    //creates a new object of flight, initializes the parameters through user input and adds it to the flights arraylist
    public static void createFlights() {
        int flightNumber = 0, capacity = 0;
        String orgin = "", destination = "1", departureTime = "";
        double originalPrice = 0.0;
        //sets and adds new flight using set methods
        Flight f = new Flight(flightNumber, orgin, destination, departureTime, capacity, originalPrice);
        f.setFlightNumber(3000);
        f.setOrgin("Toronto");
        f.setDestination("Tokyo");
        f.setDepartureTime("11/11/18 4:30");
        f.setCapacity(4);
        f.setOriginalPrice(1010.00);
        flights.add(f);
        //pre-assigned Flights
        flights.add(new Flight(1000, "Toronto", "Tokyo", "30/09/18 3:30", 1, 1000.00));
        flights.add(new Flight(1100, "Toronto", "Paris", "04/03/18 3:30", 3, 2000.00));
        flights.add(new Flight(2000, "Tokyo", "Toronto", "10/12/18 3:30", 2, 4000.32));
        flights.add(new Flight(2100, "Paris", "Toronto", "21/12/18 3:30", 4, 6040.32));
        System.out.println("Flights have been created...");
    }

    //checks available flights, if the orgin and destination matches in any flight objects
    public static void displayAvailableFlights(String orgin, String destination) {

        System.out.println("Available Flights from " + orgin + " to " + destination + ": ");
        for (int i = 0; i < flights.size(); i++) {
            if (flights.get(i).getOrgin().equals(orgin) && flights.get(i).getDestination().equals(destination)) {
                if (flights.get(i).bookASeat()) {
                    System.out.println(flights.get(i));
                } else {
                    System.out.println("No flights available at the moment.");
                }
            } 
        }
    }

    //returns a flight object if the flight number matches a flight number variable in a flight object
    public static Flight getFlight(int flightNumber) {
        Flight f;
        int j = 0;
        for (int i = 0; i < flights.size(); i++) {
            if (flights.get(i).getFlightNumber() == flightNumber) {
                j = i;
            }

        }
        return f = flights.get(j);
    }

    //books a seat for a passenger
    public static void bookSeat(int flightNumber, Passenger p) {
        Flight fly;
        double discountPrice;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the passenger's name: ");
        p.setName(scan.nextLine());
        System.out.println("Enther the passenger's age: ");
        p.setAge(scan.nextInt());
        System.out.println("Finding the flight...");
        fly = getFlight(flightNumber);
        //checks if the flight object is null
        if (fly != null) {
            //checks if they are available flights
            if (fly.bookASeat()) {
                discountPrice = p.applyDiscount(fly.getOriginalPrice());
                Ticket t = new Ticket(p, fly, discountPrice);
                tickets.add(t);
                System.out.println("Your ticket has been issued for the following: ");
                System.out.println(t);
            } else {
                System.out.println("The flight is booked out.");
            }
        } else {
            System.out.println("The flight does not exist");
        }
    }

    public static void main(String[] args) {
        int choice, flightnum, flightsearch;
        String orgin1, dest1, response;
        Passenger p;
        Scanner scan = new Scanner(System.in);
        //menu for user, type a number associated with each option in the menu
        String menu = "1.Create Flights\n2.Available Flights\n3.Flight info\n4.Book a flight\n5.Exit";

        do {
            System.out.println(menu);
            choice = scan.nextInt();
            switch (choice) {
                case 1:
                    createFlights();
                    break;
                case 2:
                    System.out.println("Enter the orgin:");
                    orgin1 = scan.next();
                    System.out.println("Enter the destination:");
                    dest1 = scan.next();
                    displayAvailableFlights(orgin1, dest1);
                    break;
                case 3:
                    System.out.println("Enter the flight number of the flight you are looking for: ");
                    flightsearch = scan.nextInt();
                    if (getFlight(flightsearch) != null) {
                        System.out.println(getFlight(flightsearch));
                    } else {
                        System.out.println("No flights with that flight number.");
                    }
                    break;
                case 4:
                    System.out.println("Enter the flight number of the flight you are looking to buy");
                    flightnum = scan.nextInt();
                    System.out.println("Are you a member: (Enter y for yes, and n for no)");
                    response = scan.next();
                    if (response.equals("y")) {
                        p = new Member();
                        bookSeat(flightnum, p);
                        break;
                    } else if (response.equals("n")) {
                        p = new NonMember();
                        bookSeat(flightnum, p);
                        break;
                    }
                case 5:
                    break;
            }
        } while (choice != 5);

    }

}
