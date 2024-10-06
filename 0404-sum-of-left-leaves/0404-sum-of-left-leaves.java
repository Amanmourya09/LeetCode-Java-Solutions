class Solution {
    public int sumOfLeftLeaves(TreeNode root) {
    traverse(root,true);
        return total;
    }
    int total=0;
    void traverse(TreeNode root,boolean rightLeaf){
    if(root==null)return;
        if(!rightLeaf && root.left==null && root.right==null){
            total+=root.val;
        }
        traverse(root.left,false);
        traverse(root.right,true);
        
    }
}