import java.util.*;

class StrTokenizer {
 public static void main(String[] args) {
  int n;
  int sum=0;
  Scanner Scn = new Scanner(System.in);
  System.out.println("Enter few numbers with one space gap");
  String s=Scn.nextLine();
  System.out.print("Given Integers are : ");
  StringTokenizer st=new StringTokenizer(s);
  while (st.hasMoreTokens()) {
   String temp = st.nextToken();
   n=Integer.parseInt(temp);
   System.out.print(n+"\t");
   sum=sum+n;
  }
  System.out.println();
  System.out.println("Sum of given integers is : "+sum);
 }
}
