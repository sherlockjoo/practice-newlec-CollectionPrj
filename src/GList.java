
public class GList<T> {

	private Object[] nums;
	private int current;
	private int capacity;
	private int amount;
	
	public GList() {
		current = 0;
		capacity = 3;
		amount = 5;
		nums = new Object[capacity];
	}
	
	public void add(T num) {
		
		if(capacity == current) {
			Object[] tmp = new Object[capacity + amount];
			
			for(int i=0; i<current; i++) {
				tmp[i] = nums[i];
			}
			nums = tmp;
			capacity += amount;
		}
		
		nums[current] = num;
		current++;
	}

	public int size() {
		return current;
	}

	public void clear() {
		current = 0;
	}

	public T get(int index) {		
		if(current <= index)
			throw new IndexOutOfBoundsException();
			
		return (T)nums[index];
	}

}
