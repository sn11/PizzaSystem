package pizzalabtest;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.Before;
public class pizzaTest {

	pizza Order;

	@Before
	public void setUp() throws Exception {
		
		Order=new pizza("mamamia",4,300);
	}
	

	@Test
	public void testGetQuantity() {
		//fail("Not yet implemented");
		assertEquals(4,Order.getQuantity());
	}

	@Test
	public void testSetQuantity() {
		//fail("Not yet implemented");
	}

	@Test
	public void testGetPrice() {
	//	fail("Not yet implemented");
		assertEquals(300,Order.getPrice());
	}

	@Test
	public void testSetPrice() {
		//fail("Not yet implemented");
	}

	
	@Test
	public void testNetPrice() {
		//fail("Not yet implemented");
		assertEquals(1200,Order.netPrice());
	}

}
