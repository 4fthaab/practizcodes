#include <stdio.h>
int main()

{
    int a, i, n, sum = 0;
    printf("enter a number\n");
    scanf("%d", &n);
    a = n;
    while (a > 0)
    {
        i = a % 10;
        sum = sum + i * i * i; // only applicable in case of 3 digit numbers(if n is a 4 digit number; sum=sum+i*i*i*i)
        a = a / 10;
    }
    if (sum == n)
    {
        printf("the number is amstrong number");
    }
    else
    {
        printf("the number is not amstrong number");
    }
    return 0;
}