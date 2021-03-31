package DFS;

public class LC98 {
    public boolean dfs(TreeNode root){
        if(root==null)return true;
        if(root.left==null&&root.right==null)return true;
        else if(root.left!=null&&root.right==null){
            if(root.left.val<root.val)return true;
            else return false;
        }
        else if(root.right!=null&&root.left==null){
            if(root.right.val>root.val)return true;
            else return false;
        }

        return dfs(root.left)&&dfs(root.right);
    }
    public boolean isValidBST(TreeNode root) {
        return dfs(root);
    }
    public static void main(String[]args){
        LC98 s=new LC98();
    }
}
