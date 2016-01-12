public class BinaryTreeNode {
    private Comparable key = null;
    private Object value = null;
    private BinaryTreeNode left = null;
    private BinaryTreeNode right = null;

    public BinaryTreeNode(Comparable k) {
	key = k;
	value = null;
    }

    public BinaryTreeNode(Comparable k, Object val) {
	key = k;
	value = val;
    }

    public Comparable getKey() {
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

    public BinaryTreeNode getLeft() {
        return left;
    }

    public BinaryTreeNode getRight() {
        return right;
    }

    public BinaryTreeNode search(Comparable k) {
        if (k.compareTo(key) == 0) {
            return this;
        }

        if (left != null && k.compareTo(key) < 0) {
            return left.search(k);
        }

        if (right != null && k.compareTo(key) > 0) {
            return right.search(k);
        }

        return null;
    }

    public void insert(BinaryTreeNode node) throws Exception {
        if (node.getKey().compareTo(key) < 0) {
            if (left == null) {
                setLeft(node);
                return;
            }
            left.insert(node);
            return;
        }

        if (node.getKey().compareTo(key) > 0) {
            if (right == null) {
                setRight(node);
                return;
            }
            right.insert(node);
            return;
        }

        throw new Exception("Duplicated Key");
    }
}

/*
Local Variables:
tab-width: 8;
End:
 */
