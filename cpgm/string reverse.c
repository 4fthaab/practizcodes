#include<stdio.h>
#include<string.h>
int main()
{
    char a[50];
    int i,n;
    printf("enter the string\n");
    gets(a);
    n=strlen(a);
    printf("reversed string is: \n");
    for(i=n-1; i>=0; i--)
    {
        printf("%c",a[i]);
    }
    return 0;
}