/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution 
{
    public List<List<Integer>> levelOrder(TreeNode root) 
    {
        List<List<Integer>>mainli=new ArrayList<>();
        innerloop(root,0,mainli);
        return mainli;
    }
    public static void innerloop(TreeNode root,int length,List<List<Integer>> mainli)
    {
        if(root==null)
        {
            return;
        }
        if(mainli.size()==length)
        {
            List<Integer> li=new ArrayList<>();
            li.add(root.val);
            mainli.add(li);
        }
        else
        {
            mainli.get(length).add(root.val);
        }
        innerloop(root.left,length+1,mainli);
        innerloop(root.right,length+1,mainli);
        
    }
}