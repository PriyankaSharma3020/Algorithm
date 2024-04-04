package tree;

public class LowestCommonAncestor {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        TreeNode rl=new TreeNode(2);
        TreeNode rr=new TreeNode(3);
        root.left=rl;
        root.right=rr;
        TreeNode rll=new TreeNode(4);
        TreeNode rlr=new TreeNode(5);
        root.left.left=rll;
        root.left.right=rlr;
        TreeNode rlrr= new TreeNode(6);
        root.left.right.right=rlrr;
        LowestCommonAncestor mi = new LowestCommonAncestor();
        System.out.println(mi.lowestCommonAncestor(root,rll,rlrr).val);
    }
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        //base case
        if (root == null || root == p || root == q) {
            return root;
        }
        TreeNode left = lowestCommonAncestor(root.left, p, q);
        TreeNode right = lowestCommonAncestor(root.right, p, q);

        //result
        if(left == null) {
            return right;
        }
        else if(right == null) {
            return left;
        }
        else { //both left and right are not null, we found our result
            return root;
        }
    }
}
