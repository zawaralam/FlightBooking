/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package COE528.lab1;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author zawar
 */
public class FlightTest {

    public FlightTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of getFlightNumber method, of class Flight.
     */
    @Test
    public void testGetFlightNumber() {
        System.out.println("getFlightNumber");
        Flight instance = new Flight(1030, "Toronto", "Kolkota", "03/02/99 7:50 pm", 500, 0.0);
        int expResult = 1030;
        int result = instance.getFlightNumber();
        assertEquals(expResult, result);

    }

    /**
     * Test of getOrgin method, of class Flight.
     */
    @Test
    public void testGetOrgin() {
        System.out.println("getOrgin");
        Flight instance = new Flight(1030, "Toronto", "Kolkota", "03/02/99 7:50 pm", 500, 0.0);
        String expResult = "Toronto";
        String result = instance.getOrgin();
        assertEquals(expResult, result);

    }

    /**
     * Test of getDestination method, of class Flight.
     */
    @Test
    public void testGetDestination() {
        System.out.println("getDestination");
        Flight instance = new Flight(1030, "Toronto", "Kolkota", "03/02/99 7:50 pm", 500, 0.0);
        String expResult = "Kolkota";
        String result = instance.getDestination();
        assertEquals(expResult, result);

    }

    /**
     * Test of getDepartureTime method, of class Flight.
     */
    @Test
    public void testGetDepartureTime() {
        System.out.println("getDepartureTime");
        Flight instance = new Flight(1030, "Toronto", "Kolkota", "03/02/99 7:50 pm", 500, 0.0);
        String expResult = "03/02/99 7:50 pm";
        String result = instance.getDepartureTime();
        assertEquals(expResult, result);

    }

    /**
     * Test of getCapacity method, of class Flight.
     */
    @Test
    public void testGetCapacity() {
        System.out.println("getCapacity");
        Flight instance = new Flight(1030, "Toronto", "Kolkota", "03/02/99 7:50 pm", 500, 0.0);
        int expResult = 500;
        int result = instance.getCapacity();
        assertEquals(expResult, result);

    }

    /**
     * Test of getNumberofSeatsLeft method, of class Flight.
     */
    @Test
    public void testGetNumberofSeatsLeft() {
        System.out.println("getNumberofSeatsLeft");
        Flight instance = new Flight(1030, "Toronto", "Kolkota", "03/02/99 7:50 pm", 500, 0.0);
        int expResult = 500;
        int result = instance.getNumberofSeatsLeft();
        assertEquals(expResult, result);

    }

    /**
     * Test of getOriginalPrice method, of class Flight.
     */
    @Test
    public void testGetOriginalPrice() {
        System.out.println("getOriginalPrice");
        Flight instance = new Flight(1030, "Toronto", "Kolkota", "03/02/99 7:50 pm", 500, 0.0);
        double expResult = 0.0;
        double result = instance.getOriginalPrice();
        assertEquals(expResult, result, 0.0);

    }

    /**
     * Test of bookASeat method, of class Flight.
     */
    @Test
    public void testBookASeat() {
        System.out.println("bookASeat");
        Flight instance = new Flight(1030, "Toronto", "Kolkota", "03/02/99 7:50 pm", 500, 0.0);
        boolean expResult = true;
        boolean result = instance.bookASeat();
        assertEquals(expResult, result);

    }

    /**
     * Test of toString method, of class Flight.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Flight instance = new Flight(1030, "Toronto", "Kolkota", "03/02/99 7:50 pm", 500, 0.0);
        String expResult = "Flight 1030, Toronto to Kolkota, 03/02/99 7:50 pm, Original Price: 0.0";
        String result = instance.toString();
        assertEquals(expResult, result);

    }

    @Test
    public void testConstructor() {
        Flight instance = new Flight(1030, "Toronto", "Kolkota", "03/02/99 7:50 pm", 500, 0.0);
    }

    @Test
    public void testInvalidConstructor() {
        boolean gotEx = false;
        try {
            Flight instance = new Flight(1030, "Toronto", "Toronto", "03/02/99 7:50 pm", 500, 0.0);

        } catch (IllegalArgumentException e) {
            gotEx = true;
        }
        assertTrue(gotEx);
    }
}
