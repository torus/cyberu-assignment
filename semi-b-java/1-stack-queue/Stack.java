public class Stack {
    private Pair list;

    Stack() {
	list = null;
    }

    public Stack push(Object o) {
	list = new Pair(o, list);
	return this;
    }
    public Object pop() {
	Object ret = top();
	list = list.getTail();
	return ret;
    }
    public Object top() {
	return list.getHead();
    }
    public boolean empty() {
	return list == null;
    }
}
