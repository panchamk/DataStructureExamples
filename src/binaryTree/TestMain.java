package binaryTree;

import binaryTree.helper.BinaryTreeConstructor;
import binaryTree.helper.BinaryTreeTraversal;
import binaryTree.pojo.BSTreeNode;

/**
 * @author pancham.gupta
 *
 */
public class TestMain {
	public static void main(String[] args) {

		BSTreeNode rootNode = BinaryTreeConstructor.constructBinaryTree();

		System.out.println("{BinaryTree : " + rootNode + "}");
		BinaryTreeTraversal.inOrderTraversal(rootNode);
		System.out.println();
		BinaryTreeTraversal.preOrderTraversal(rootNode);
		System.out.println();
		BinaryTreeTraversal.postOrderTraversal(rootNode);

	}
}
