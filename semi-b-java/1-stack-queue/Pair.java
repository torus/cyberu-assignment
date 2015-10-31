public class Pair {
    private Object head;
    private Pair tail;

    Pair(Object h, Pair t) {
	head = h;
	tail = t;
    }

    public Object getHead() {
	return head;
    }
    public Pair getTail() {
	return tail;
    }
}
