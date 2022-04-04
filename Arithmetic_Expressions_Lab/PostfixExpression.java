/* PostfixExpression:
 * Complete code below where you read "COMPLETE CODE HERE"
 */

public class PostfixExpression {

	// Attributes: 
	private String expression;
	
	// Constructors:
	public PostfixExpression() {}
	
	public PostfixExpression(String e) {expression = e;}
	
	// Accessor:
	public String getExpression() {return expression;}
	
	// Modifier:
	public void setExpression(String e) {expression = e;}
	
	// Print out the expression: 
	public void print() {
		// COMPLETE CODE HERE
		System.out.println(expression);
	}
	
	// Evaluate expression:
	public int evaluate() {
		IntStack S = new IntStack();
		// COMPLETE CODE HERE

		for (int i = 0; i < expression.length(); i++) {
			int var = expression.charAt(i) - '0';
			if (var >= 0 && var <= 9)
				S.push(var);
			else{
				char a = expression.charAt(i);
				int num1 = S.pop();
				int num2 = S.pop();

				if (a == '+') S.push(num2 + num1);
				if (a == '-') S.push(num2 - num1);
				if (a == '*') S.push(num2 * num1);
				if (a == '/') S.push(num2 / num1);
			}
		}
		
		return S.pop(); // MODIFY THIS LINE WHEN YOUR CODE IS READY
	}

}
