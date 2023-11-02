/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution 
{
    public static boolean lca(TreeNode root,TreeNode n,ArrayList<TreeNode>path)
    {
        if(root==null)
        {
            return false;
        }
        path.add(root);
        if(root.val==n.val)
        {
            return true;
        }
        boolean foundLeft=lca(root.left,n,path);
        boolean foundRight=lca(root.right,n,path);
        if(foundLeft||foundRight)
        {
            return true;
        }
        path.remove(path.size()-1);
        return false;
    }
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) 
    {
        ArrayList<TreeNode> path1=new ArrayList<>();
        ArrayList<TreeNode> path2=new ArrayList<>();

        lca(root,p,path1);
        lca(root,q,path2);
        int i=0;
        for(;i<path1.size() && i<path2.size();i++)
        {
            if(path1.get(i)!=path2.get(i))
            {
                break;
            }
        }
        TreeNode lowestCommonAncestor=path1.get(i-1);
        return lowestCommonAncestor;
    }
}