#include<stdio.h>

int main()
{
    int a[10][10],b[10][10],c[10][10],i,j,r1,c1,r2,c2;
    printf("enter the order of 1st matrix\n");
    scanf("%d%d",&r1,&c1);
    printf("enter the order of 2nd matrix\n");
    scanf("%d%d",&r2,&c2);
    if((r1==r2)&&(c1==c2))
    {
        printf("enter the elements of matrix A\n");
        for(i=0; i<r1; i++)
        {
            for(j=0; j<c1; j++)
            {
                scanf("%d",&a[i][j]);
            }
        }
        printf("\n");
        printf("enter the elements of matrix B\n");
        for(i=0; i<r2; i++)
        {
            for(j=0; j<c2; j++)
            {
                scanf("%d",&b[i][j]);
            }
        }
        printf("Matrix A>>>>>>\n");
        for(i=0; i<r1; i++)
        {
            for(j=0; j<c1; j++)
            {
                printf("%d\t",a[i][j]);
            }
            printf("\n");
        }
        printf("\n");
        printf("Matrix B>>>>>>\n");
        for(i=0; i<r2; i++)
        {
            for(j=0; j<c2; j++)
            {
                printf("%d\t",b[i][j]);
            }
            printf("\n");
        }
        printf("\n");

        printf("Sum of Given Matrixes>>>>>>\n");
        for(i=0; i<r1; i++)
        {
            for(j=0; j<c1; j++)
            {
                c[i][j]=a[i][j]+b[i][j];
                printf("%d\t",c[i][j]);
            }
            printf("\n");
        }
    }
    else
    {
        printf("Addition is not possible due to different order of A and B");
    }
return 0;
}