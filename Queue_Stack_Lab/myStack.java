public class myStack {
	private String[] data;
	private int top;
	
	/* ********** Constructors ********** */
	public myStack(int size) {
		data  = new String[size];
		top  = -1;
	}
	
	public myStack() {
		data = new String[10];
		top = -1;
	}
	
	/* ********** Operations ********** */
	//your functions go here

	public boolean push(String s){
		if (isFull()) return false;

		//Updates the value of top and sets its String
		data[top + 1] = s;
		top++;
		return true;
	}

	public String pop(){
		if (isEmpty()) return null;

		top--;
		return data[top + 1];
	}

	public String peek(){
		if (isEmpty() == true) return null;
		//Returns the string at the index on top
		return data[top];
	}

	public int getSize(){
		return top + 1;
	}

	public boolean isEmpty(){
		//If index at -1, return true, otherwise return false
		return top == -1;
	}

	public boolean isFull(){
		//If the index of the last element is equal to the index of "top"
		//return true, otherwise return false
		return data.length - 1 == top;
	}
}