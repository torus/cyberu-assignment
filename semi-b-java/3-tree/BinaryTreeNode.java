public class BinaryTreeNode {
    private Object key = null;
    private Object value = null;
    private BinaryTreeNode left = null;
    private BinaryTreeNode right = null;

    public BinaryTreeNode(Object k) {
	key = k;
	value = null;
    }

    public BinaryTreeNode(Object k, Object val) {
	key = k;
	value = val;
    }

    public Object getKey() {
	return key;
    }

    public Object getValue() {
	return value;
    }

    public BinaryTreeNode setLeft(BinaryTreeNode child) {
	left = child;
	return this;
    }

    public BinaryTreeNode setRight(BinaryTreeNode child) {
	right = child;
	return this;
    }
}
