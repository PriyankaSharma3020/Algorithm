package tree;

public class isBalPrctice {
    public static void main(String[] args) {

    }
    public boolean isBalanced(TreeNode root) {
        if (root == null) return false;

        return isBal(root) > 1 ? false : true;
    }
    public int isBal(TreeNode root) {
        TreeNode lft = root.left;
        TreeNode rt = root.right;
        int lh=0;
        int rh=0;
        if(lft !=null) lh = 1+isBal(root.left);
        if(rt !=null) rh = 1+isBal(root.right);
        return Math.abs(lh-rh);
    }
}

