import java.io.*;
import java.util.*;
class Employee{
 String name,address;
 int age;
 long phone;
 double salary;
 void printSalary()
 {
  System.out.println("SALARY: "+ salary);
 }
 }
 class Officer extends Employee{
 String spec;
 }
 class Manager extends Employee{
 String dept;
 }
 class Emp{
 public static void main(String args[]){
 Scanner Sc=new Scanner(System.in);
 //Officer
 Officer o=new Officer();
 System.out.println("Enter the details of Officer");
 System.out.print("NAME:\t");
 o.name=Sc.nextLine();
 System.out.print("SPECIALISATION:\t");
 o.spec=Sc.nextLine();
 System.out.print("AGE:\t");
 o.age=Sc.nextInt();
 Sc.nextLine();
 System.out.print("ADDRESS:\t");
 o.address=Sc.nextLine();
 System.out.print("PHONE:\t");
 o.phone=Sc.nextLong();
 System.out.print("SALARY:\t");
 o.salary=Sc.nextDouble();
 Sc.nextLine();
 System.out.println();
 //Manager
 Manager m=new Manager();
 System.out.println("Enter the details of Manager");
 System.out.print("NAME:\t");
 m.name=Sc.nextLine();
 System.out.print("DEPEARTMENT:\t");
 m.dept=Sc.nextLine();
 System.out.print("AGE:\t");
 m.age=Sc.nextInt();
 Sc.nextLine();
 System.out.print("ADDRESS:\t");
 m.address=Sc.nextLine();
 System.out.print("PHONE:\t");
 m.phone=Sc.nextLong();
 System.out.print("SALARY:\t");
 m.salary=Sc.nextDouble();
 Sc.nextLine();
 System.out.println();
 //Displaying details of officer
 System.out.println("OFFICER");
 System.out.println("NAME:\t"+o.name);
 System.out.println("SPECIALISATION:\t"+o.spec);
 System.out.println("AGE:\t"+o.age);
 System.out.println("ADDRESS:\t"+o.address);
 System.out.println("PHONE:\t"+o.phone);
 m.printSalary();
 System.out.println();
  //Displaying details of manager
 System.out.println("MANAGER");
 System.out.println("NAME:\t"+m.name);
 System.out.println("DEPARTMENT:\t"+m.dept);
 System.out.println("AGE:\t"+m.age);
 System.out.println("ADDRESS:\t"+m.address);
 System.out.println("PHONE:\t"+m.phone);
 o.printSalary();
 }
 }
 
 
