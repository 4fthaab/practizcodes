import java.io.*;
abstract class Shapes{
abstract void noOfSides();{}
}
class Rectangle extends Shapes{
void noOfSides(){
System.out.println("Number of sides in Rectangle = 4"); }
}
class Triangle extends Shapes{
void noOfSides(){
System.out.println("Number of sides in Triangle = 3"); }
}
class Hexagon extends Shapes{
void noOfSides(){
System.out.println("Number of sides in Hexagon = 6"); }
}
class Abs{
public static void main(String args[]){
Rectangle rec=new Rectangle();
Triangle tri=new Triangle();
Hexagon hex=new Hexagon();
rec.noOfSides();
tri.noOfSides();
hex.noOfSides(); }
}