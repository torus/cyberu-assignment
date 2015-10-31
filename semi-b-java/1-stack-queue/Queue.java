public class Queue {
    private Stack stack1;
    private Stack stack2;

    Queue() {
	stack1 = new Stack();
	stack2 = new Stack();
    }

    public Queue enqueue(Object o) {
	stack1.push(o);
	return this;
    }
    public Object dequeue() {
	if (stack2.empty()) {
	    while (!stack1.empty()) {
		// System.out.println(stack1.top());
		stack2.push(stack1.pop());
	    }
	}
	return stack2.pop();
    }
    public boolean empty() {
	return stack1.empty() && stack2.empty();
    }
}
