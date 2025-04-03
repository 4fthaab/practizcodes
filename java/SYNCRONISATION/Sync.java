class Table{  
 synchronized void printTable(int n) {
   System.out.println("\nMULTIPLICATION TABLE OF "+n);
  for(int i=1;i<=10;i++) {
   System.out.print(n+" x "+i+" = "+(n*i));
   System.out.println(); }
 }
}
class MyThread1 extends Thread {  
 Table t;  
 MyThread1(Table t) {  
  this.t=t;  } 
 public void run() { 
  t.printTable(5);
  System.out.println();}
}
class MyThread2 extends Thread {  
 Table t;  
 MyThread2(Table t) {  
  this.t=t;   }  
 public void run() {
  t.printTable(100);
  System.out.println(); }
}  
  
class Sync {  
 public static void main(String args[]) {  
  Table obj = new Table();
  MyThread1 t1=new MyThread1(obj);  
  MyThread2 t2=new MyThread2(obj);  
  t1.start(); 
  t2.start();  
 }
}  
