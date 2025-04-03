#include<stdio.h>
int main()
{
    int a[100],i,n,sum=0;
    float avg;
    printf("enter the limit of array\n");
    scanf("%d",&n);
    printf("enter the elements of array\n");
    for(i=0; i<n; i++)
    {
        scanf("%d",&a[i]);
    }
    printf("elements of array are:\n");
    for(i=0; i<n; i++)
    {
        printf("%d",a[i]);
    }
    for(i=0; i<n; i++)
    {
        sum=sum+a[i];
    }
    avg=sum/n;
    printf("sum of elements is %d\n",sum);
    printf("average of elements is %f\n",avg);
    return 0;
}