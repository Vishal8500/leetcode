class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {

        if(p.val > root.val && q.val > root.val){
            return lowestCommonAncestor(root.right, p, q); // both are in right subtree
        }else if(p.val < root.val && q.val < root.val){
            return lowestCommonAncestor(root.left, p, q); // both are in left subtree
        }else{
            return root; 
        }

    }
}
