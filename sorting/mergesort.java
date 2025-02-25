import java.util.Scanner;
import java.util.*;
public class mergesort{
    public static void sort(int arr[],int left,int right)
    {
        int mid=(left+right)/2;
        sort(arr,left,mid);
        sort(arr,mid+1,right);
        merge(arr,left,mid+1,right);
    }
    public static void merge(int arr[],int left,int mid ,int right)
    {
        while()
    }
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int size=in.nextInt();
        int arr[]=new int[size];
        sort(arr,1,size);
    }
}