/* BTStack:
 * Complete code below where you read "COMPLETE CODE HERE" 
 * or "MODIFY THIS"
 * You may also want to add methods where it says "ADD METHODS AS NEEDED"
 */

public class BTStack {

	// Attributes
	private Node top;
	// COMPLETE CODE HERE

	private class Node {
		private ExpressionBT data;
		private Node next;

		Node(){}

		Node(ExpressionBT d){
			data = d;
		}

		ExpressionBT getData() {
			return data;
		}

		Node getNext() {
			return next;
		}
	}
	
	// Constructors
	public BTStack() {}
	
	// Modifiers
	
	/* Peek: MODIFY THIS METHOD BASED ON YOUR  
	  * IMPLEMENTATION OF YOUR STACK (ARRAY OR LINKED LIST)
	  */
	public ExpressionBT peek() {
        // COMPLETE CODE HERE
		return top.getData(); // MODIFY THIS LINE WHEN YOUR CODE IS READY
	}
	
	/* Push:
	 */
	public void push(ExpressionBT NodeS) {
		// COMPLETE CODE HERE
		if (top == null) top = new Node(NodeS);
		else {
			Node topNew = new Node(NodeS);

			topNew.next = top;

			top = topNew;
		}
	}
	
	/* Pop: MODIFY THIS METHOD BASED ON YOUR  
	 * IMPLEMENTATION OF YOUR STACK (ARRAY OR LINKED LIST)
	 */
	public ExpressionBT pop() {
        // COMPLETE CODE HERE
		if (top == null) return null;

		ExpressionBT temp = top.getData();

		top = top.getNext();

		return temp; // MODIFY THIS LINE WHEN YOUR CODE IS READY
	}

	// ADD METHODS AS NEEDED

}
