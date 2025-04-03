#include<stdio.h>

int main()
{
int n,rev=0,a; 
printf("Enter the number:");
scanf("%d",&n);
a=n;
while ( n > 0 )
{
rev = rev*10+n%10; 
n = n/10;
}
printf("\nthe given number is %d",a);
printf("\nthe reversed number is %d",rev);
if( a == rev)
{
printf("\nPalindrome");
}
else
{
printf("\nNot Palindrome");
}
return 0;
}