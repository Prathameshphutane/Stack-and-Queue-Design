package maincollection;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class FIFOImplementationTest {

	@Test
	public void testAdd() {
		FIFOImplementation queue = new FIFOImplementation(2);
		queue.add(2);
		queue.add(4);
		queue.add(5);
		assertEquals(2,queue.get());
	}
	
	
//	@Test(expected = NullPointerException.class)
//	@Test
//	public void testGetwithEmptyQueue(){
//		FIFOImplementation queue = new FIFOImplementation(0);
//		assertThrows(RuntimeException.class, () -> queue.get());
//		// 2 add and 3 get
//	}
	
	@Test
	public void testGetwithElementsInQueue(){
		FIFOImplementation queue = new FIFOImplementation(3);
		queue.add(1);
		queue.add(2);
		queue.get();
		queue.get();
		assertThrows(RuntimeException.class, () -> queue.get());
		// 2 add and 3 get
	}
	
	
	
	@Test
	public void testFIFOSize() {
		FIFOImplementation queue = new FIFOImplementation(2);
		queue.add(2);
		queue.add(3);
		queue.add(4);
		assertEquals(3,queue.size());

	}

	@Test
	public void testResize() {
		FIFOImplementation queue = new FIFOImplementation(2);
		queue.add(1);
		queue.add(2);
		queue.add(3);
		queue.add(4);
		queue.add(5);
		queue.add(6);
		assertEquals(6,queue.size());
		// check capacity

	}
	
	@Test
	public void testResizeCapacity() {
		FIFOImplementation queue = new FIFOImplementation(2);
		queue.add(1);
		queue.add(2);
		queue.add(3);
		queue.add(4);
		queue.add(5);
		queue.add(6);
		assertEquals(8,queue.capacity);

	}
	
	@Test
	public void testNotEmpty() {
		FIFOImplementation queue = new FIFOImplementation(2);
		queue.add(5);
		assertFalse(queue.isEmpty());

	}
	@Test
	public void testEmpty() {
		FIFOImplementation queue = new FIFOImplementation(2);
		//stack.add(5);
		assertTrue(queue.isEmpty());

	}
}
