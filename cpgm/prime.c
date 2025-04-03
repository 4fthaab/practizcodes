#include <stdio.h>
int main()
{
    int c = 0, i, a;
    printf("enter test number");
    scanf("%d", &a);
    for (i = 1; i <= a; i++)
    {
        if (a % i == 0)
        {
            c++;
        }
    }
    if (c == 2)
    {
        printf("%d is prime\n", a);
    }
    else
    {
        printf("%d is not prime\n", a);
    }
    return 0;
}