/**
 * 
 */
package maincollection;

/**
 * @author pratham
 *
 */
public class LIFOImplementation extends ParentCollection {

	/**
	 * @param initialCapacity
	 */
	public LIFOImplementation(int initialCapacity) {
		super(initialCapacity);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public int get() {
		// TODO Auto-generated method stub
		if(size==0)
		{
			throw new RuntimeException("No Element present in the collection");
		}
		
		int topIndex = size -1;
		int number = data[topIndex];
		size--;
		return number;
	}
	
	@Override
	public void insert(int number) {
		// TODO Auto-generated method stub
		
		int CurrentIndex = size;
		data[CurrentIndex] = number;
		
		
	}
	

}
