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
        
        preorder(result,root);
        return result;
    }
    public void preorder(ArrayList<Integer> result, TreeNode root){
         result.add(root.val);
         if (root.left!=null){
             preorder(result,root.left);
        }
        if (root.right!=null){
            preorder(result,root.right);
        }
        
    }
}
