import java.util.*;
import java.util.Scanner;
public class T {
public static void main(String[] args) {
int i,j;
Scanner sc = new Scanner(System.in);
System.out.println("Enter the length of array");
    int n=sc.nextInt();
    int [] a=new int[n];
    System.out.println("Enter Array Elements:");
    for(i=0;i<n;i++)
    {
        a[i]=sc.nextInt();
    }
    i=0;
    while(i<n)
    {
    if(a[i]==10)
    {
    for(j=i;j<n-1;j++)
    {
    a[j]=a[j+1];
    }
    a[j]=0;
    }
    else
    {
    i++;
    }
    }
    System.out.println("Array after removing 10:");
    for(i=0;i<n;i++)
        System.out.println(a[i]);
}
}
