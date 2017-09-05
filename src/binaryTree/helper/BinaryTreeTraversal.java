/**
 * 
 */
package binaryTree.helper;

import binaryTree.pojo.BSTreeNode;

/**
 * @author pancham.gupta
 *
 */
public class BinaryTreeTraversal {

	/**
	 * traverse the Binary Tree of the root {@code rootNode} using <b> InOrder Traversal </b>
	 * 
	 * @param rootNode
	 */
	public static void inOrderTraversal(BSTreeNode rootNode) {
		if (rootNode == null)
			return;
		else
		{
			inOrderTraversal(rootNode.getLeftNode());
			System.out.print(rootNode.getValue() + " ");
			inOrderTraversal(rootNode.getRightNode());
		}
	}

	/**
	 * traverse the Binary Tree of the root {@code rootNode} using <b> PreOrder Traversal </b>
	 * 
	 * @param rootNode
	 */
	public static void preOrderTraversal(BSTreeNode rootNode) {
		if (rootNode == null)
			return;
		else
		{
			System.out.print(rootNode.getValue() + " ");
			preOrderTraversal(rootNode.getLeftNode());
			preOrderTraversal(rootNode.getRightNode());
		}
	}

	/**
	 * traverse the Binary Tree of the root {@code rootNode} using <b> PostOrder Traversal </b>
	 * 
	 * @param rootNode
	 */
	public static void postOrderTraversal(BSTreeNode rootNode) {
		if (rootNode == null)
			return;
		else
		{
			postOrderTraversal(rootNode.getLeftNode());
			postOrderTraversal(rootNode.getRightNode());
			System.out.print(rootNode.getValue() + " ");
		}
	}

}
