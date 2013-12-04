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
    public ArrayList<Integer> postorderTraversal(TreeNode root) {
        ArrayList<Integer> result = new ArrayList<Integer>();
        postorder(result,root);
        return result;
    }
    public void postorder(ArrayList<Integer> result, TreeNode root){
        if (root!=null){
        
        if (root.left!=null)
            postorder(result,root.left);
        if (root.right!=null)
            postorder(result,root.right);
       
         result.add(root.val);  
        
        }
        
         
        
    }
}
