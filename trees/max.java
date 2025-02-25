package java.dsa.trees;

public class max {
    public class BinaryTreeNode{
        int data;
        BinaryTreeNode left;
        BinaryTreeNode  right;
        public int getData()
        {
            return data;
        }
        public void setData(int data)
        {
            this.data=data;
        }
        public BinaryTreeNode getLeft()
        {
            return left;
        }
        public void setLeft(BinaryTreeNode left)
        {
            this.left=left;
        }
        public BinaryTreeNode getRight()
        {
            return right;
        }
        public  void setRight(BinaryTreeNode right)
        {
            this.right=right;
        }

    }
    public int findmax(BinaryTreeNode root)
    {
        int value,left,right,max=(int)Double.NEGATIVE_INFINITY;
        if(root!=null){
        value=root.getData();
        right=findmax(root.getRight());
        left=findmax(root.getLeft());
        max=Math.max(left,right);
        max=Math.max(max,value);
        }
        return max;
    }
    public int findmax_iterative(BinaryTreeNode root)
    {
        S
    }
}