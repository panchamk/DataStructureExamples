/**
 * 
 */
package binaryTree.helper;

import binaryTree.pojo.BSTreeNode;

/**
 * @author pancham.gupta
 *
 */
public class BinaryTreeConstructor {

	/**
	 * construct Binary Tree from the input<br><br>
	 *<b>Note: </b> <i>Currently It creates binary tree at compile time.</i>
	 * 
	 * @return {@link BSTreeNode} instance {@code rootNode}
	 */
	public static BSTreeNode constructBinaryTree() {
		BSTreeNode leafNode1 = new BSTreeNode(5, null, null);
		BSTreeNode leafNode2 = new BSTreeNode(6, null, null);
		BSTreeNode leafNode3 = new BSTreeNode(7, null, null);
		BSTreeNode leafNode4 = new BSTreeNode(8, null, null);
		BSTreeNode leafNode5 = new BSTreeNode(9, null, null);
		BSTreeNode leafNode6 = new BSTreeNode(10, null, null);

		BSTreeNode iNode1 = new BSTreeNode(4, leafNode1, leafNode2);
		BSTreeNode iNode2 = new BSTreeNode(3, iNode1, leafNode3);
		BSTreeNode iNode3 = new BSTreeNode(2, iNode2, leafNode4);
		BSTreeNode iNode4 = new BSTreeNode(1, leafNode5, leafNode6);
		return new BSTreeNode(0, iNode3, iNode4);

	}
}
