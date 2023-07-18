/**
 * 
 */
package maincollection;

/**
 * @author pratham
 *
 */
public abstract class ParentCollection implements CollectionInterface {

	/**
	 * 
	 */
	int[]data;
	int capacity;
	int size;
	
	
	public ParentCollection(int initialCapacity) {
		// TODO Auto-generated constructor stub
		capacity = initialCapacity;
		data = new int[capacity];
		size =0;
		
	}

	@Override
	public void add(int number) {
		// TODO Auto-generated method stub
		if(size==capacity)
		{
			resize();
			
		}
		insert(number);
		size++;
		
		

	}

	public abstract void insert(int number);

	private void resize() {
		// TODO Auto-generated method stub
		int newCapacity = capacity*2;
		int newdata[] = new int[newCapacity];
		int oldSize = size();
		System.arraycopy(data,0 , newdata, 0, oldSize);
		data = newdata;
		capacity = newCapacity;
	}

	
	public abstract int get();

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return size==0;
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return size;
	}

	/**
	 * @param args
	 */

}
