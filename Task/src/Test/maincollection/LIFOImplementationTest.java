package maincollection;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class LIFOImplementationTest {
	
	
	@Test
	public void testAdd() {
		LIFOImplementation stack = new LIFOImplementation(3);
		stack.add(2);
		assertEquals(2,stack.get());
		
		
		//fail("Not yet implemented");
	}
	
//	@Test(expected = NullPointerException.class)
	@Test
	public void testGetwithEmptyStack(){
		LIFOImplementation stack = new LIFOImplementation(0);
		assertThrows(RuntimeException.class, () -> stack.get());
	}
		
	
	@Test
	public void testSize() {
		LIFOImplementation stack = new LIFOImplementation(2);
		stack.add(2);
		assertEquals(1,stack.size());

	}
	
	
	
	@Test
	public void testResize() {
		LIFOImplementation stack = new LIFOImplementation(3);
		stack.add(1);
		stack.add(2);
		stack.add(3);
		stack.add(4);
		assertEquals(4,stack.size()); 
		

	}
	
	@Test
	public void testResizeCapacity() {
		LIFOImplementation stack = new LIFOImplementation(3);
		stack.add(1);
		stack.add(2);
		stack.add(3);
		stack.add(4);
		assertEquals(6,stack.capacity); 
		

	}
	
	@Test
	public void testNotEmpty() {
		LIFOImplementation stack = new LIFOImplementation(3);
		stack.add(5);
		assertFalse(stack.isEmpty());

	}
	@Test
	public void testEmpty() {
		LIFOImplementation stack = new LIFOImplementation(2);
		//stack.add(5);
		assertTrue(stack.isEmpty());

	}

}
