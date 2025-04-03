import java.io.*;
import java.util.*;
class Pal
{
 public static void main(String args[])
 {
  int len,i,flag=0;
  System.out.println("Enter the test string");
  Scanner Sc=new Scanner(System.in);
  String Str=Sc.nextLine();
  len= Str.length();
  for(i=0;i<=len/2;i++)
  {
   if(Str.charAt(i)!=Str.charAt(len-i-1))
   {
    flag++;
   }
  }
  if(flag==0)
  {
   System.out.println("The given string is palindrome");
  }
  else
  {
   System.out.println("The given string is not palindrome");
  }
 }
}
