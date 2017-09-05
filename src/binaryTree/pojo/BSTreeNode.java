/**
 * 
 */
package binaryTree.pojo;

/**
 * @author pancham.gupta
 *
 */
public class BSTreeNode {
	private int	value;
	BSTreeNode	leftNode;
	BSTreeNode	rightNode;

	/**
	 * default constructor 
	 */
	public BSTreeNode() {
		super();
	}

	/**
	 * @param value
	 * @param leftNode
	 * @param rightNode
	 */
	public BSTreeNode(int value, BSTreeNode leftNode, BSTreeNode rightNode) {
		super();
		this.value = value;
		this.leftNode = leftNode;
		this.rightNode = rightNode;
	}

	/**
	 * @return the value
	 */
	public int getValue() {
		return value;
	}

	/**
	 * @param value the value to set
	 */
	public void setValue(int value) {
		this.value = value;
	}

	/**
	 * @return the leftNode
	 */
	public BSTreeNode getLeftNode() {
		return leftNode;
	}

	/**
	 * @param leftNode the leftNode to set
	 */
	public void setLeftNode(BSTreeNode leftNode) {
		this.leftNode = leftNode;
	}

	/**
	 * @return the rightNode
	 */
	public BSTreeNode getRightNode() {
		return rightNode;
	}

	/**
	 * @param rightNode the rightNode to set
	 */
	public void setRightNode(BSTreeNode rightNode) {
		this.rightNode = rightNode;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "{value : " + value + ", leftNode : " + leftNode + ", rightNode : " + rightNode + "}";
	}

}
