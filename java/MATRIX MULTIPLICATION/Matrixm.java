import java.io.*;
import java.util.*;
class Matrixm
{
 public static void main(String[] args)
 {
  int i,j,k,r1,c1,r2,c2;
  Scanner Sc=new Scanner(System.in);
  System.out.println("Enter order of 1st Matrix");
  r1=Sc.nextInt();
  c1=Sc.nextInt();
  System.out.println("Enter order of 2nd Matrix");
  r2=Sc.nextInt();
  c2=Sc.nextInt();
  if(c1==r2)
  {
   int a[][]=new int[r1][c1];
   int b[][]=new int[r2][c2];
   int c[][]=new int[r1][c2];
   System.out.println("Enter elements of 1st Matrix");
   for(i=0;i<r1;i++)
   {
    for(j=0;j<c1;j++)
    {
     a[i][j]=Sc.nextInt();
    }
   }
   System.out.println("Enter elements of 2nd Matrix");
   for(i=0;i<r2;i++)
   { 
    for(j=0;j<c2;j++)
    {
     b[i][j]=Sc.nextInt();
    }
   }
   for(i=0;i<r1;i++)
   {
    for(j=0;j<c2;j++)
    {
     c[i][j]=0;
     for(k=0;k<c1;k++)
     {
      c[i][j]=c[i][j]+a[i][k]*b[k][j];
     }
    } 
   }
   System.out.println("Result Matrix");
   for(i=0;i<r1;i++)
   {
   for(j=0;j<c2;j++)
    {
    System.out.print(c[i][j]+" ");
    }
   System.out.println();
   }
  }
  else
  {
  System.out.println("Multipliaction not possible");
  }
 }
}
  
   
   
   
   
   
   
   
   
