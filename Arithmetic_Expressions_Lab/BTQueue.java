/* BTQueue:
 * Complete code below where you read "COMPLETE CODE HERE" 
 * or "MODIFY THIS"
 * You may also want to add methods where it says "ADD METHODS AS NEEDED"
 */

public class BTQueue {

	// Attributes
	private Node front;
	private Node end;
	private int numElements;
	// COMPLETE CODE HERE

	private class Node {
		private ExpressionBT expr;
		private Node next;

		Node(ExpressionBT expr){
			this.expr = expr;
		}

		ExpressionBT getExpressionBT(){
			return expr;
		}
	}
	
	// Constructors
	public BTQueue() {}
	
	/* Peek: MODIFY THIS METHOD BASED ON YOUR  
	  * IMPLEMENTATION OF YOUR QUEUE (ARRAY OR LINKED LIST)
	  */
	public ExpressionBT peek() {
	    // COMPLETE CODE HERE
		if (front == null) return null;

		return front.expr; // MODIFY THIS LINE WHEN YOUR CODE IS READY
	}
	
	/* Enqueue:
	 */
	public void enqueue(ExpressionBT Node) {
		// COMPLETE CODE HERE
		Node newNode = new Node(Node);

		if (front == null) front = newNode;
		else {
			Node temp = front;
			while (temp.next != null) temp = temp.next;
			temp.next = newNode;
		}
	}
	
	/* Pop: MODIFY THIS METHOD BASED ON YOUR  
	 * IMPLEMENTATION OF YOUR QUEUE (ARRAY OR LINKED LIST)
	 */
	public ExpressionBT dequeue() {
	    // COMPLETE CODE HERE
		if (front == null) return null;

		ExpressionBT ref = front.expr;
		front = front.next;

		return ref; // MODIFY THIS LINE WHEN YOUR CODE IS READY
	}

	// ADD METHODS AS NEEDED

}
