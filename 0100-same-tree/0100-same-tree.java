class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(q == null && p == null) return true;
        if(q != null && p != null && p.val == q.val){
            return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
        }
        return false;
    }
}