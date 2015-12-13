public class List {
    public List() {}
    public List(Object[] array) {
	for (int i = 0; i < array.length; i ++) {
	    push(array[i]);
	}
    }

    private ListElement first = null;
    private ListElement last = null;
    private int length = 0;

    public Object[] getElementsAsArray() {
	Object[] elems = new Object[length];
	ListElement elem = first;
	for (int i = 0; i < length; i ++) {
	    elems[i] = elem.get();
	    elem = elem.getNext();
	}
	return elems;
    }

    public ListElement find(Object val) {
	for (ListElement e = first; e != null; e = e.getNext()) {
	    if (val == e.get()) {
		return e;
	    }
	}
	return null;
    }

    public List unshift(Object val) {
	ListElement elem = new ListElement(val);
	if (length > 0) {
	    elem.setNext(first);
	} else {
	    last = elem;
	}
	first = elem;
	first.setPrevious(null);

	length ++;
	return this;
    }

    public List push(Object val) {
	ListElement elem = new ListElement(val);
	if (length > 0) {
	    last.setNext(elem);
	} else {
	    first = elem;
	}

	elem.setPrevious(last);
	last = elem;
	length ++;
	return this;
    }

    public List insertAfter(ListElement elem, Object val) {
	ListElement newElem = new ListElement(val);
	ListElement after = elem.getNext();

	if (last == elem) {
	    last = newElem;
	} else {
	    after.setPrevious(newElem);
	}

	elem.setNext(newElem);
	newElem.setNext(after);
	newElem.setPrevious(elem);

	length ++;
	return this;
    }

    public List delete(ListElement elem) {
	ListElement next = elem.getNext();
	ListElement prev = elem.getPrevious();

	if (next != null) next.setPrevious(prev);
	if (prev != null) prev.setNext(next);

	if (elem == first) {
	    first = next;
	}

	if (elem == last) {
	    last = prev;
	}

	length --;
	return this;
    }
}
