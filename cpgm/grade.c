// a symbol system for getting grades basedon marks
#include<stdio.h>

int main()
{
int a;
printf("enter the mark:");
scanf("%d",&a);
if(a>=80)
{
printf("distinction");
}
else if(a>=60 && a<80)
{
printf("first class");
}
else if(a>=40 && a<60)
{
printf("second class");
}
else
{
printf("failed");
}
}