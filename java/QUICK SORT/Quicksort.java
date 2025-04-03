import java.util.*; 

class Quicksort
{
public static void main(String args[])
{
int[] a=new int[50];
int n,j,i;
Scanner sc=new Scanner(System.in);
System.out.print("\n\nEnter the size of the array:");
n=sc.nextInt();
System.out.println("");
for(j=0;j<n;j++)
{
System.out.print("Enter element "+(j+1)+ " : ");
i=sc.nextInt();
a[j]=i;
}
System.out.print("\nThe Array is :");
for(j=0;j<n;j++)
{
System.out.print(" "+a[j]+" ");
}
System.out.println("");
sorting s=new sorting();
s.quicksort(a,0,n-1);
System.out.print("\nThe sorted array is :");
for(j=0;j<n;j++)
{
System.out.print(" "+a[j]+" ");
}
System.out.println("");
}
}
class sorting
{
void quicksort(int a[],int low,int high)
{
int j;
if (low<high)
{
    sorting s2=new sorting();
    j=s2.partition(a,low,high);
    quicksort(a,low,j-1);
    quicksort(a,j+1,high);    
}
}
int partition(int a[],int low,int high)
{
int i,j,temp,key;
key=a[low];
i=low+1;
j=high;
while (i<high && key>=a[i])
    {
    i++;
    }
    while (key<a[j])
    {
    j--;
    }
    if(i<j)
    {
        temp=a[i];
        a[i]=a[j];
        a[j]=temp;
    }
    else
    {
        temp=a[low];
        a[low]=a[j];
        a[j]=temp;
    }  
    return j; 
}
}