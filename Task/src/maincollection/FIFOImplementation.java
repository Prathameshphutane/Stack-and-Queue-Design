/**
 * 
 */
package maincollection;

/**
 * @author pratham
 *
 */
public class FIFOImplementation extends ParentCollection {

	/**
	 * @param initialCapacity
	 */
	
	
	int FrontIndex = 0;
	
	public FIFOImplementation(int initialCapacity) {
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
		
		
		int number = data[FrontIndex];
		FrontIndex++;
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
