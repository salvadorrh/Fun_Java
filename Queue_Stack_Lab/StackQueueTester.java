import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StackQueueTester {

    /*1st test case: Checks if the "push" method works when the stack
    * IS NOT FULL, with help of the "peek" method by pushing Strings
    * and then checking if the String on top (by peeking) is the last pushed*/
    //STATUS: PASSED
    @Test
    void myStack(){
        myStack stack = new myStack(4);
        stack.push("Hello");
        stack.push("Hey");

        assertEquals("Hey", stack.peek());
    }

    /*2nd test case: Checks if the "push" method works when the stack
    * IS FULL, expecting that when trying to push an element, the "push"
    * method will return false, because it wasn't pushed*/
    //STATUS: PASSED
    @Test
    void myStack2(){
        myStack stack = new myStack(4);
        stack.push("you?");
        stack.push("are");
        stack.push("how");
        stack.push("Hey,");

        assertEquals(false, stack.push("ERROR"));
    }

    /*3rd test case: Examines if the "pop" method returns the String which was
    * last expected and also checks if the "pop" method returns null when the stack
    * DOES NOT HAVE elements*/
    //STATUS: PASSED
    @Test
    void myStack3(){
        myStack stack = new myStack();
        stack.push("CS");

        assertEquals("CS", stack.pop());
        assertEquals(null, stack.pop());
    }

    /*4th test case: Checks if the "peek" method really returns the last element
    * pushed to the stack. Also then checks if it returns null when the array is empty*/
    //STATUS: PASSED
    @Test
    void myStack4(){
        myStack stack = new myStack();
        stack.push("Stacks");
        stack.push("Hello,");

        assertEquals("Hello,", stack.peek());

        stack.pop();
        stack.pop();

        assertEquals(null, stack.peek());
    }

    /*5th test case:  Checks the functionality of the "getSize" method by
    * inserting 10 elements and checking if its the correct result */
    //Status: PASSED
    @Test
    void myStack5(){
        myStack stack = new myStack();
        stack.push("10"); stack.push("9"); stack.push("8");
        stack.push("7"); stack.push("6"); stack.push("5");
        stack.push("4"); stack.push("3"); stack.push("2"); stack.push("1");

        assertEquals(10, stack.getSize());
    }

    /*6th test case:  Checks the functionality of the "isEmpty" method by
     * checking if it returns FALSE when the stack is not empty and then checking
     * it returns TRUE when the stack HAS NO elements */
    //Status: PASSED
    @Test
    void myStack6(){
        myStack stack = new myStack();
        stack.push("Code");

        assertEquals(false, stack.isEmpty());

        stack.pop();

        assertEquals(true, stack.isEmpty());
    }

    /*7th test case:  Checks the functionality of the "isFull" method by
     * checking if it returns TRUE when the stack is FULL and then checking
     * it returns FALSE when the stack is not FULL */
    //Status: PASSED
    @Test
    void myStack7(){
        myStack stack = new myStack(1);
        stack.push("Code");

        assertEquals(true, stack.isFull());

        stack.pop();

        assertEquals(false, stack.isFull());
    }



    /*8th test case: This checks if the "enqueue" method returns TRUE when an
    * element in the Queue is inserted and then checks if the method returns
    * FALSE when an element can NOT be inserted into the Queue*/
    //Status: PASSED
    @Test
    void myQueue(){
        myQueue queue = new myQueue(3);
        queue.enqueue("Testing!"); queue.enqueue("Testing!!");

        assertEquals(true, queue.enqueue("Testing!!!"));

        assertEquals(false, queue.enqueue("Not inserted"));
    }

    /*9th test case: This checks if the "dequeue" method works when the Queue
    * HAS elements and returns the first string inserted, and then checks if the method works
    * when the Queue is empty and should return null*/
    //Status: PASSED
    @Test
    void myQueue2(){
        myQueue queue = new myQueue(3);
        queue.enqueue("First"); queue.enqueue("Last");

        assertEquals("First", queue.dequeue());

        queue.dequeue();

        assertEquals(null, queue.dequeue());
    }

    /*10th test case: This checks whether or not the method "peek"
    * return the String located in the Head of the Queue*/
    //Status: PASSED
    @Test
    void myQueue3(){
        myQueue queue = new myQueue();
        queue.enqueue("Head");

        assertEquals("Head", queue.peek());

    }

    /*11th test case: This checks the functionality of the "getSize" method
    * by enqueueing and dequeueing elements into the Queue*/
    //Status: PASSED
    @Test
    void myQueue4(){
        myQueue queue = new myQueue();
        queue.enqueue("1"); queue.enqueue("2"); queue.enqueue("3");
        queue.enqueue("4"); queue.enqueue("5"); queue.dequeue();

        assertEquals(4, queue.getSize());
    }

    /*12th test case: Checks if the "isEmpty" method returns FALSE when
    * the queue HAS elements, and then whether or not returns TRUE when
    * the queue is empty*/
    //Status: PASSED
    @Test
    void myQueue5(){
        myQueue queue = new myQueue(5);
        queue.enqueue("Hi");

        assertEquals(false, queue.isEmpty());

        queue.dequeue();

        assertEquals(true, queue.isEmpty());
    }

    /*13th test case: Checks if the "isFull" method returns FALSE when
     * the queue IS NOT full, and then whether or not returns TRUE when
     * the queue IS full*/
    //Status: PASSED
    @Test
    void myQueue6(){
        myQueue queue = new myQueue(5);
        queue.enqueue("1");

        assertEquals(false, queue.isFull());

        queue.enqueue("2"); queue.enqueue("3");
        queue.enqueue("4"); queue.enqueue("5");

        assertEquals(true, queue.isFull());
    }
}