public class ListElement {
    private Object value = null;
    private ListElement next = null;
    private ListElement previous = null;

    public ListElement(Object val) {
	value = val;
    }

    public Object get() {
	return value;
    }

    public ListElement getNext() {
	return next;
    }

    public void setNext(ListElement elem) {
	next = elem;
    }

    public ListElement getPrevious() {
	return previous;
    }

    public void setPrevious(ListElement elem) {
	previous = elem;
    }
}
