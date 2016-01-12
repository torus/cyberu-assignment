public class BinaryTree {
    private BinaryTreeNode root = null;

    public BinaryTreeNode search(Comparable key) {
        return root.search(key);
    }

    public BinaryTree insert(BinaryTreeNode node) throws Exception {
        if (root == null) {
            return setRoot(node);
        }
        root.insert(node);
        return this;
    }

    public BinaryTreeNode getRoot() {
	return root;
    }

    public BinaryTree setRoot(BinaryTreeNode node) {
	root = node;
	return this;
    }
}

/*
Local Variables:
tab-width: 8;
End:
 */
