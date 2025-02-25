package trees;
import java.util.Stack;
import java.util.*;
public class BinaryTreeNode {
    int data;
    BinaryTreeNode leftNode;
    BinaryTreeNode rightNode;
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
        return leftNode;
    }
    public void setLeft(BinaryTreeNode leftNode)
    {
        this.leftNode=leftNode;
    }
    public BinaryTreeNode getRight()
    {
        return rightNode;
    }
    public void setRight(BinaryTreeNode rightNode)
    {
        this.rightNode=rightNode;
    }
    void preOrder(BinaryTreeNode root)
    {
        if(root!=null)
        {
            System.out.println(root.getData());
            preOrder(root.getLeft());
            preOrder(root.getRight());
        }
    }
    void PreOrderNonRecursive(BinaryTreeNode root)
    {
        if(root==null)
        return;
        Stack s=new Stack();
        while(true)
        {
            while(root!=null)
            {
                System.out.println(root.getData());
                s.push(root);
                root=root.getLeft();
            }
            if(s.isEmpty())
            break;
            root=(BinaryTreeNode)s.pop();
            root=root.getRight();
        }
        return;
    }
    void InOrderNonRecursive(BinaryTreeNode root)
    {
        if(root==null)
        return ;
        Stack s=new Stack();
        while(true)
        {
            while(root!=null)
            {
                s.push(root);
                root=root.getLeft();
            }
            if(s.isEmpty())
            break;
            root=(BinaryTreeNode)s.pop();
            System.out.println(root.getData());
            root=root.getRight();
        }
        return;
    }
    void PostOrder(BinaryTreeNode root)
    {
        if(root==null)
        return;
        PostOrder(root.getLeft());
        PostOrder(root.getRight());
        System.out.println(root.getData());
    }
    void PostOrderNonRecursive(BinaryTreeNode root)
    {
        
    }
}


