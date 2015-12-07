import static org.junit.Assert.*;
import org.junit.Test;

// Spec
// データの表示：指定したノードのデータを表示する
// データの探索：指定したデータをリストから探す
// 先頭へのデータの追加：リストの先頭へデータを追加する
// 末尾へのデータの追加：リストの末尾へデータを追加する
// データの挿入：任意の位置にデータを追加する
// データの削除：指定したデータを削除する

public class ListTest {
    @Test
    public void create() {
	List lis = new List();
	assertNotNull(lis);

	List lis2 = new List(new Object[]{1, 2, 3});
	assertNotNull(lis2);
    }

    @Test
    public void createElement() {
	ListElement elem = new ListElement(1);
	assertEquals(1, elem.get());
    }

    @Test
    public void firstElement() {
    }

    @Test
    public void getElementsAsArray() {
	Object[] data = {1, 2, 3};
	List lis = new List(data);

	Object[] elems = lis.getElementsAsArray();
	assertArrayEquals(new Object[]{1, 2, 3}, elems);
    }

    @Test
    public void find() {
	Object[] data = {1, 2, 3};
	List lis = new List(data);

	ListElement elem = lis.find(2);

	assertEquals(2, elem.get());
    }

    @Test
    public void unshift() {
	Object[] data = {1, 2, 3};
	List lis = new List(data);

	lis.unshift(5);

	Object[] elems = lis.getElementsAsArray();
	assertArrayEquals(new Object[]{5, 1, 2, 3}, elems);
    }

    @Test
    public void push() {
	Object[] data = {1, 2, 3};
	List lis = new List(data);

	lis.push(5);

	Object[] elems = lis.getElementsAsArray();
	assertArrayEquals(new Object[]{1, 2, 3, 5}, elems);
    }

    @Test
    public void insert() {
	Object[] data = {1, 2, 3};
	List lis = new List(data);

	ListElement elem = lis.find(2);
	lis.insertAfter(elem, 5);

	Object[] elems = lis.getElementsAsArray();
	assertArrayEquals(new Object[]{1, 2, 5, 3}, elems);
    }

    @Test
    public void delete() {
	Object[] data = {1, 2, 3, 4};
	List lis = new List(data);

	ListElement elem = lis.find(2);
	lis.delete(elem);

	Object[] elems = lis.getElementsAsArray();
	assertArrayEquals(new Object[]{1, 3, 4}, elems);
    }
}
