package pattern.treeBfsLevelOrderTraversal;

public class TreeNode {
    TreeNode left;
    TreeNode right;
    int val;
    public TreeNode(int val){
        this.val = val;
    }
    public static TreeNode getTreeNodeWithValue() {
        var threeLeftNode = new TreeNode(6);
        threeLeftNode.right= null;
        threeLeftNode.left= null;

        var threeRightNode = new TreeNode(7);
        threeRightNode.right= null;
        threeRightNode.left= null;

        var twoLeftNode = new TreeNode(4);
        twoLeftNode.right= null;
        twoLeftNode.left= null;

        var twoRightNode = new TreeNode(5);
        twoRightNode.right= null;
        twoRightNode.left= null;

        var oneLeftNode = new TreeNode(2);
        oneLeftNode.left = twoLeftNode;
        oneLeftNode.right = twoRightNode;

        var oneRightNode = new TreeNode(3);
        oneRightNode.left= threeLeftNode;
        oneRightNode.right= threeRightNode;

        var rootNode = new TreeNode(1);
        rootNode.left=oneLeftNode;
        rootNode.right=oneRightNode;
        return rootNode;
    }
}
