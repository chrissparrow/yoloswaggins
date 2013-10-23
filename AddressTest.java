import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class AddressTest {

	Address frank, tim, joe, moh, bob;
	@Before
	public void setUp() throws Exception {
		frank = new Address("Ross","Toronto", "L6k 5g6");
		tim = new Address("Fifth","Ottawa", "H4j 5k6");
		joe = new Address("Fifth","Ottawa", "H4j 5k6");
		moh = new Address(5, "Fifth","Ottawa", "H4j 5k6");
		bob = new Address(5 ,"King","Toronto", "g5b 7k4");
	}
	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testToString() {
		assert(frank.toString().equals("Ross, Toronto, L6k 5g6"));
		assert(tim.toString().equals("Fifth, Ottawa, H4j 5k6"));
		assert(joe.toString().equals("Fifth, Ottawa, H4j 5k6"));
		assert(moh.toString().equals("moh, 5, Fifth, Ottawa, H4j 5k6"));
		assert(bob.toString().equals("bob, 5, King, Toronto, g5b 7k4"));
	}

	@Test
	public void testEqualsObject() {
		assertFalse(frank.equals(tim));
		assertFalse(frank.equals(joe));
		assertFalse(frank.equals(moh));
		assertFalse(frank.equals(bob));
		assertTrue(tim.equals(joe));
		assertFalse(tim.equals(moh));
		assertFalse(tim.equals(bob));
		assertFalse(joe.equals(moh));
		assertFalse(joe.equals(bob));
		assertFalse(moh.equals(bob));
	}

}
