public class myQueue {
	private String[] data;
	private int head;
	private int numElements;
	
	/* ********** Constructors ********** */
	public myQueue(int size) {
		data = new String[size];
		head = -1;
		numElements = 0;
	}
	
	public myQueue() {
		data = new String[10];
		head = -1;
		numElements = 0;
	}
	
	/* ********** Operations ********** */
	//your functions go here

	public boolean enqueue(String s){
		if (isFull()) return false;

		//Sets the value to 0 and sets the value of it
		if (isEmpty()) {
			data[0] = s;
			head = 0;
		}

		else data[(head + numElements) % data.length] = s;

		numElements++;
		return true;
	}

	public String dequeue(){
		if (isEmpty()) return null;

		//Updates the head and decrements the number of elements
		int originalHead = head;
		head = (head + 1) % data.length;
		numElements--;

		//Sets the value of the head to -1 when there are no elements
		if (numElements == 0) head = -1;

		//Returns the past head
		return data[originalHead];
	}

	public String peek(){
		if (isEmpty()) return null;
		//Returns string located at the head
		return data[head];
	}

	public int getSize() {
		return numElements;
	}

	public boolean isEmpty(){
		return head == -1;
	}

	public boolean isFull(){
		return numElements == data.length;
	}
}