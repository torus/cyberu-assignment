public class List {
    public List() {}
    public List(Object[] array) {}

    public Object[] getElementsAsArray() {
	return new Object[]{};
    }

    public ListElement find(Object val) {
	return null;
    }

    public List unshift(Object val) {
	return this;
    }

    public List push(Object val) {
	return this;
    }

    public List insertAfter(ListElement elem, Object val) {
	return this;
    }

    public List delete(ListElement elem) {
	return this;
    }
}
