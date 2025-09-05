package pattern.treeBfsLevelOrderTraversal;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class DepthIterativeInOrderTraversal {
    public static void main(String[] args) {
        var treeNode = TreeNode.getTreeNodeWithValue();
        var list = DepthIterativeInOrderTraversal.traversTreeNodeDfs(treeNode);
         //  list.forEach(System.out::print);
         System.out.print(String.join(", ", list.stream()
                .map(String::valueOf)
                .toArray(String[]::new)));
    }

    private static List<Integer> traversTreeNodeDfs(TreeNode node) {
       List<Integer> list =new ArrayList<Integer>();
       Stack<TreeNode> stack =new Stack<TreeNode>();
       while(true){
           if(node != null){
               stack.push(node);
               node =  node.left;
           }
           else{
               if(stack.empty()) break;
               node =  stack.pop();
               list.add(node.val);
               node = node.right;
           }
       }
       return list;

    }
}
