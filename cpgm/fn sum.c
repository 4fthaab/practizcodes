#include<stdio.h>
int sum(int,int);
int main()
{
    int a,b,c;
    printf("enter two numbers\n");
    scanf("%d%d",&a,&b);
    c=sum(a,b);
    printf("sum of %d and %d is %d",a,b,c);
    return 0;
}
int sum(int x,int y)
{
    int z;
    z=x+y;
    return z;
}