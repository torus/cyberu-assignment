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
    public void setRoot() {
	BinaryTreeNode node = new BinaryTreeNode(10, "foo");
	BinaryTree tree = new BinaryTree();
	tree.setRoot(node);

	BinaryTreeNode root = tree.getRoot();
	assertNotNull(root);

	assertEquals("foo", root.getValue());
    }
}
