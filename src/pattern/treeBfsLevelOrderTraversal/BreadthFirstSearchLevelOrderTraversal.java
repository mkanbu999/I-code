package pattern.treeBfsLevelOrderTraversal;

import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BreadthFirstSearchLevelOrderTraversal {
    public static void main(String[] args) {
        
        // Simple binary tree
        var treeNode = TreeNode.getTreeNodeWithValue();
        var list = BreadthFirstSearchLevelOrderTraversal.traverseBinaryTree(treeNode);
            list.stream()
                .flatMap(Collection::stream)
                .forEach(System.out::print);    ;
    }

    private static List<List<Integer>> traverseBinaryTree(TreeNode root) {
     Queue<TreeNode> queue= new LinkedList<TreeNode>();
     List<List<Integer>> wrapList = new LinkedList<List<Integer>>();
     if(root == null){
         return wrapList;
     }
     queue.offer(root);
     while (!queue.isEmpty()){
       var size=  queue.size();
       List<Integer> subList = new LinkedList<Integer>();

       for(int i=0; i< size ; i ++){
           if(queue.peek().left != null) queue.offer(queue.peek().left);
           if(queue.peek().right != null) queue.offer(queue.peek().right);
           subList.add(queue.poll().val);
       }
         wrapList.add(subList);
     }
     return wrapList;
    }


}
