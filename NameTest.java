import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class NameTest {
	
	Name frank, tim, joe, moh, bob, frank2, tim2;
	@Before
	public void setUp() throws Exception {
	
		frank = new Name("frank", "Parker");
		tim = new Name("tim", "Parker");
		tim2 = new Name("tim", "Parker");
		joe = new Name("joe", "Parker");
		moh = new Name("moh", "Smith");
		bob = new Name("bob", "Dole");
	}
		
	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testName() {
		frank2 = new Name("frank", "Parker");
		assert(frank.equals(frank2));
	}

	@Test
	public void testGetFirst() {
		assertFalse(frank.getFirst().equals("jack"));
		assertTrue(tim.getFirst().equals("tim"));
		assertTrue(joe.getFirst().equals("joe"));
		assertTrue(moh.getFirst().equals("moh"));
		assertTrue(bob.getFirst().equals("bob"));
	}

	@Test
	public void testGetLast() {
		assertTrue(frank.getFirst().equals("Parker"));
		assertTrue(tim.getFirst().equals("Parker"));
		assertTrue(joe.getFirst().equals("Parker"));
		assertTrue(moh.getFirst().equals("Smith"));
		assertTrue(bob.getFirst().equals("Dole"));
	}

	@Test
	public void testToString() {
		assertTrue(frank.toString().equals("frank Parker"));
		assertTrue(tim.toString().equals("tim Parker"));
		assertTrue(joe.toString().equals("joe Parker"));
		assertTrue(moh.toString().equals("moh Smith"));
		assertTrue(bob.toString().equals("bob Dole"));
	}

	@Test
	public void testEqualsObject() {
		assertFalse(frank.equals(tim));
		assertFalse(frank.equals(tim2));
		assertFalse(frank.equals(joe));
		assertFalse(frank.equals(moh));
		assertFalse(frank.equals(bob));
		assertTrue(tim.equals(tim2));
		assertFalse(tim.equals(joe));
		assertFalse(tim.equals(moh));
		assertFalse(tim.equals(bob));
		assertFalse(joe.equals(moh));
		assertFalse(joe.equals(bob));
		assertFalse(moh.equals(bob));
	}

}
