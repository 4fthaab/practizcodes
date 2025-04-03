import java.io.*;
import java.util.*;
class Sum
{
    public static void main(String args[])
    {
        int a,b,sum;
        Scanner Sc=new Scanner(System.in);
        System.out.println("Enter 1st number");
        a= Sc.nextInt();
        System.out.println("Enter 2nd number");
        b= Sc.nextInt();
        sum=a+b;
        System.out.println("the sum of given number is " +sum);
    }
}