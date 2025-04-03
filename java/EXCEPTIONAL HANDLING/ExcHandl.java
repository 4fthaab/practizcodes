class ExcHandl {
 public static void main(String args[]) throws ArithmeticException,ArrayIndexOutOfBoundsException {
  try {
   int a,b,c;
   a=0;
   b=25;
   c=b/a; } 
  catch(ArithmeticException e) {
   System.out.println("Division by zero occured"); }
  try {
   char name[]={'a','m','a','l'};
   name[5]='k'; }
  catch(ArrayIndexOutOfBoundsException e) {
   System.out.println("Array Index out of bounds Exception occured"); }
   try {
   int a,b,c;
   a=0;
   b=100;
   c=b/a; }
finally{
    System.out.println("Remaining part of program will be executed without any interruptions"); }  
  }
 }
