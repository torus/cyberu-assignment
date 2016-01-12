import static org.junit.Assert.*;
import org.junit.Test;

public class BinaryTreeTest {
    @Test
    public void create() {
	BinaryTree tree = new BinaryTree();
	assertNotNull(tree);
    }

    @Test
    public void createNode() {
	BinaryTreeNode node = new BinaryTreeNode(10, "foo");
	assertEquals(10, node.getKey());
	assertEquals("foo", node.getValue());
    }

    @Test
    public void setLeft() {
	BinaryTreeNode node = new BinaryTreeNode(10, "foo");
        BinaryTreeNode ret = node.setLeft(new BinaryTreeNode(8, "bar"));
        assertEquals(ret, node);
        assertEquals("bar", node.getLeft().getValue());
    }

    @Test
    public void setRight() {
	BinaryTreeNode node = new BinaryTreeNode(10, "foo");
        BinaryTreeNode ret = node.setRight(new BinaryTreeNode(8, "bar"));
        assertEquals(ret, node);
        assertEquals("bar", node.getRight().getValue());
    }

    @Test
    public void setRoot() {
	BinaryTreeNode node = new BinaryTreeNode(10, "foo");
	BinaryTree tree = new BinaryTree();
	tree.setRoot(node);

	BinaryTreeNode root = tree.getRoot();
	assertNotNull(root);

	assertEquals("foo", root.getValue());
    }

    private BinaryTreeNode node(BinaryTreeNode l, Comparable o, BinaryTreeNode r) {
        BinaryTreeNode n = new BinaryTreeNode(o, o);
        return n.setLeft(l).setRight(r);
    }

    private BinaryTreeNode makeTree() {
        // [[1, 3, [5, 7, 9]], 11, [[13, 15, 17], 19]]
        BinaryTreeNode root = node(node(node(null, 1, null),
                                        3,
                                        node(node(null, 5, null),
                                             7,
                                             node(null, 9, null))),
                                   11,
                                   node(node(node(null, 13, null),
                                             15,
                                             node(null, 17, null)),
                                        19,
                                        null));
        return root;
    }

    @Test
    public void search() {
        BinaryTreeNode root = makeTree();
	BinaryTree tree = new BinaryTree();
	tree.setRoot(root);

        BinaryTreeNode found = tree.search(7);
        assertEquals(7, found.getValue());
    }

    @Test
    public void searchNonexistent() {
        BinaryTreeNode root = makeTree();
	BinaryTree tree = new BinaryTree();
	tree.setRoot(root);

        BinaryTreeNode found = tree.search(123);
        assertNull(null, found);
    }

    @Test
    public void insert() throws Exception {
        BinaryTreeNode root = makeTree();
	BinaryTree tree = new BinaryTree();
	tree.setRoot(root);

        BinaryTree newTree = tree.insert(node(null, 8, null));
        assertEquals(newTree, tree);
        assertNotNull(newTree);

        BinaryTreeNode parent = tree.search(9);
        assertEquals(8, parent.getLeft().getValue());
    }
}

/*
Local Variables:
tab-width: 8;
End:
 */
