import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class StackQueueTest {
    @Test
    public void stack() {
	Stack s = new Stack();

	s.push(1).push(2).push(3);
	assertEquals(3, s.pop());
	assertEquals(2, s.pop());

	s.push(4).push(5);
	assertEquals(5, s.pop());
    }

    @Test
    public void queue() {
	Queue q = new Queue();

	q.enqueue(1).enqueue(2).enqueue(3);
	assertEquals(1, q.dequeue());
	assertEquals(2, q.dequeue());
	assertEquals(3, q.dequeue());

	q.enqueue(4).enqueue(5);
	assertEquals(4, q.dequeue());
	assertEquals(5, q.dequeue());
    }
}
