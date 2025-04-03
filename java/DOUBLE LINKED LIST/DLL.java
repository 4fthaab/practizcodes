import java.util.*;

class Node
{  
        int data;  
        Node prev;  
        Node next;  

        public Node(int data) 
        {  
            this.data = data;  
        }  
}  
class DLL{

    Node head = null;  
    
    public void insert(int data) {   
        Node newNode = new Node(data);  
        if(head == null) {   
            head = newNode;   
            head.prev = null; 
        }  
        else {  
            Node ptr=head; 
            while (ptr.next!=null)
            {
                ptr=ptr.next;  
            }
            ptr.next=newNode ;
            newNode.prev=ptr;
            newNode.next=null;
        }  
    }  

    public void delete() {   
        if(head == null) {  
            System.out.println("There is no element to delete\n");
        }  
        else {  
            Node ptr=head; 
            Node ptr1;
            while (ptr.next!=null)
            {
                ptr=ptr.next;  
            }
            System.out.println("The node "+ ptr.data+" is deleted.");
            ptr1=ptr.prev;
            ptr.prev=null;
            ptr1.next=null;
        }  
    }
   
    public void display() 
    { 
        Node ptr = head;  
        if(head == null) {  
            System.out.println("List is empty");  
            return;  
        }  
        System.out.print("Doubly linked list:\t");  
        while(ptr != null) 
        {  
            System.out.print(ptr.data + "<==>");  
            ptr = ptr.next;  
        }  
        System.out.println("NULL");
    }  
  
    public static void main(String[] args) {  
        
        int ch=0,dt;
        DLL dl = new DLL(); 
        System.out.println("This is a program to perform tasks in a doubly linked list");
        while (ch!=4) 
        { 
        Scanner sc=new Scanner(System.in);
        System.out.println("\n\t\tMAIN MENU\t");
        System.out.println("1.Insert\t2.Delete\t3.Display\t4.Exit");
        System.out.print("Please enter your choice:\t");
        ch=sc.nextInt();
        switch (ch) 
        {
            case 1:
            System.out.print("Enter the item to be inserted:\t");
            dt=sc.nextInt();
            dl.insert(dt);
            System.out.println("The node "+dt+" is inserted.");
            break;

            case 2:
            dl.delete();
            break;

            case 3:
            dl.display(); 
            break;

            case 4:
            System.out.println("Thank You.");
            break;
        
            default:
                System.out.println("Please enter a valid option");
                break;
        }
        }
    }  
}  
