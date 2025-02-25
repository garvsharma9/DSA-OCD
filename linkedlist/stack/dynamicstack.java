import java.util.*;
public class dynamicstack {
    int array[];
    int size;
    int top;
    public dynamicstack()
    {
         size=1;
         array=new int[size];
         top=-1;
    }
    public boolean isEmpty()
    {
        return (top==-1);
    }
    public boolean isFull()
    {
        return (top==size-1);
    }
    public void push(int data)
    {
        if(isFull()) 
        doublestack();
        array[++top]=data;
    }
    public void doublestack()
    {
        int newArray[]=new int[size*2];
        System.arraycopy(array, 0, newArray, 0, size);
        size*=2;
        array=newArray;
    }
    public int pop()
    {
        if(isEmpty())
        System.out.println("Stack Overflow");
        else
        return array[top--];
    }
    public void deletestack()
    {
        top=-1;
    }
    public static void main(String args[])
    {
    //     dynamicstack stack=new dynamicstack();
    //     stack.push(3);
    //     stack.push(4);
    //     stack.push(5);
    //     stack.push(6);
    //     stack.push(7);
    //     stack.pop();
    //    stack. pop();
    //     stack.pop();
    //     stack.pop();
    //     stack.pop();
    //    stack. pop();

    }
}
