import java.io.*;
import java.util.*;
class Lc
{
 public static void main(String args[])
 {
  int len,i,flag=0;
  char ele;
  System.out.println("Enter the test string");
  Scanner Sc=new Scanner(System.in);
  String Str=Sc.nextLine();
  len= Str.length();
  System.out.println("Enter the letter to Search");
  Scanner Sc1=new Scanner(System.in);
  ele=Sc1.nextLine().charAt(0);
  for(i=0;i<len;i++)
  {
   if(Str.charAt(i)==ele)
   {
    flag++;
   }
  }
  if(flag!=0)
  {
   System.out.println(ele+" is present "+flag+" times");
  }
  else
  {
  System.out.println(ele+"is not present");
  }
  }
}
