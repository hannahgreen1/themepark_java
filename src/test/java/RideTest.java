import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RideTest {

    Ride ride;

    @Before
    public void before() {
        ride = new Ride("Inferno", "RollerCoaster", 10, 100);
    }

    @Test
    public void hasName(){
        assertEquals("Inferno", ride.getName());
    }

    @Test
    public void hasType(){
        assertEquals("RollerCoaster", ride.getType());
    }

    @Test
    public void hasMinAge(){
        assertEquals(10, ride.getMinAge());
    }

    @Test
    public void hasMinHeight(){
        assertEquals(100, ride.getMinHeight());
    }
}
