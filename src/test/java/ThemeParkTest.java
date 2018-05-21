import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ThemeParkTest {
    ThemePark themePark;
    Ride ride;
    Customer customer1;
    Customer customer2;

    @Before
    public void before() {
        themePark = new ThemePark("Alton Towers");
        ride = new Ride("Inferno", "RollerCoaster", 10, 100);
        customer1 = new Customer("Hannah", "Adult", 23, 150, 50);
        customer2 = new Customer("Rachel", "Child", 9, 150, 20);

    }

    @Test
    public void hasName(){
        assertEquals("Alton Towers", themePark.getName());
    }

    @Test
    public void getRideTotal(){
        themePark.addRide(ride);
        assertEquals(1, themePark.ridesCount());
    }

    @Test
    public void getCustomerTotal(){
        themePark.addCustomer(customer1);
        themePark.addCustomer(customer2);
        assertEquals(2,themePark.customerCount());
    }


}
