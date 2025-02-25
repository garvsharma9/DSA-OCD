package Linkedlist;
import java.util.*;
import java.io.*;
public class Linkedlist
{
    Node head;
    static class Node 
    {
        int data;
        Node next;
        public Node (int value)
        {
            data=value;
            next=null;
        }
    }
    public static Linkedlist insert(int value,Linkedlist list)
    {
        Node newnode=new Node(value);
        if(list.head==null)
        {
            list.head=newnode;
        }
        else
        {
            Node temp=list.head;
            while(temp.next!=null)
            {
                temp=temp.next;
            }
            temp.next=newnode;
        }
        return list;
    }
    public static Linkedlist add(int value,int index,Linkedlist list)
    {
        Node temp=list.head;
        Node newnode=new Node(value);
        int count=index-1;
        if(index==0)
        {
                newnode.next=list.head;
                list.head=newnode;
                return list;
        }
        while (count>0) {
            temp=temp.next;
            count--;
        }
        Node tempo=temp.next;
        temp.next=newnode;
        newnode.next=tempo;
        return list;
    }
    public static void display(Linkedlist list)
    {
        Node temp=list.head;
        while(temp!=null)
        {
            System.out.println(temp.data);
            temp=temp.next;
        }
    }
    public static Node removefirst(Node head)
    {
        if(head==null)
        return null;
      head=head.next;
      return head;
    }
    public static Linkedlist removelast(Linkedlist list)
    {
        if(list.head==null)
        return null;
        int count=0;
        Node temp=list.head;
        while(temp!=null)
        {
            temp=temp.next;
            count++;
        }temp=list.head;
        for(int i=1;i<count-1;i++)
        {
            temp=temp.next;
        }
        temp.next=null;
        return list;
    }
    public static Linkedlist removeat(int index,Linkedlist list)
    {
        if(index==0)
        {
            list.head=removefirst(list.head);
            return list;
        }
        Node temp=list.head;
        for(int i=1;i<index;i++)
        {
            temp=temp.next;
        }
        Node temp1=temp.next.next;
        temp.next=temp1; 
        return list;
    }
    public static void main(String args[])
    {
        Linkedlist list=new Linkedlist();
        list=insert(10,list);
        list=insert(20,list);
        list=insert(30,list);
        list=insert(40,list);
        list=insert(50,list);
        // list=add(60,3,list);
        // list=add(70,0,list);
        // list.head=removefirst(list.head);
        // list=removelast(list);
        list=removeat(3,list);
        list=removeat(2,list);
        display(list);
    }
}