import java.io.*;
import java.util.*;
class Num_pal
{
    public static void main(String args[])
    {
        int a,n,rev=0; 
        System.out.println("Enter the number:");
        Scanner Sc=new Scanner(System.in);
        n=Sc.nextInt();
        a=n;
        while(n>0)
        {
        rev=rev*10+n%10; 
        n=n/10;
        }
        System.out.println("the given number is " +a);
        System.out.println("the reversed number is " +rev);
        if(a==rev)
        {
        System.out.println(a+" is Palindrome");
        }
        else
        {
        System.out.println(a+" is Not Palindrome");
        }
    }
}