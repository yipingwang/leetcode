/**
 * Definition for binary tree
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ArrayList<Integer> preorderTraversal(TreeNode root) {
        ArrayList<Integer> result = new ArrayList<Integer>();
        if (root==null) return result;
        Stack<TreeNode> stack = new Stack<TreeNode>();
        stack.push(root);
        while (!stack.isEmpty())
        {
            TreeNode current = stack.peek();
            result.add(current.val);
            stack.pop();
            if (current.right!=null)
                stack.push(current.right);
            if (current.left!=null)
                stack.push(current.left);
                
        }
        return result;
    
        
    }
   
        
    
}
