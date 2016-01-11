public class BinaryTree {
    private BinaryTreeNode root = null;

    public BinaryTreeNode search(Object key) {
	return null;
    }

    public BinaryTree insertLeft(BinaryTreeNode parent, BinaryTreeNode child) {
	parent.setLeft(child);
	return this;
    }

    public BinaryTree insertRight(BinaryTreeNode parent, BinaryTreeNode child) {
	parent.setLeft(child);
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
