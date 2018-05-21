import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CustomerTest {

    Customer customer;

    @Before
    public void before() {
        customer = new Customer("Hannah", "Adult", 23, 150, 50);
    }

    @Test
    public void hasName(){
        assertEquals("Hannah", customer.getName());
    }

    @Test
    public void hasType(){
        assertEquals("Adult", customer.getType());
    }

    @Test
    public void hasMinAge(){
        assertEquals(23, customer.getAge());
    }

    @Test
    public void hasMinHeight(){
        assertEquals(150, customer.getHeight());
    }

    @Test
    public void hasMoney(){
        assertEquals(50, customer.getMoney());
    }


}
