#include<stdio.h>

int main()
{
    int a[10][10],i,j,r,c,s1=0,s2=0,s3=0;
    printf("enter the order of matrix\n");
    scanf("%d%d",&r,&c);
    if(r==c)
    {
        printf("enter the elements of matrix \n");
        for(i=0; i<r; i++)
        {
            for(j=0; j<c; j++)
            {
                scanf("%d",&a[i][j]);
            }
        }
        printf("\n");
        for(i=0; i<r; i++)
        {
            for(j=0; j<c; j++)
            {
                if(i==j)
                {
                    s1=s1+a[i][j];
                }
                else if(i<j)
                {
                    s2=s2+a[i][j];
                }
                else if(i>j)
                {
                    s3=s3+a[i][j];
                }


            }
        }
        printf("Given matrix>>>> \n");
        for(i=0; i<r; i++)
        {
            for(j=0; j<c; j++)
            {
                printf("%d\t",a[i][j]);
            }
            printf("\n");
        }
        printf("\n");
        printf("Sum of principle diagonal elements=%d\n",s1);
        printf("Sum of lower triangle elements=%d\n",s2);
        printf("Sum of upper triangle elements=%d\n",s3);
        printf("\n");
    }
    else
    {
        printf("error in Matrix");
        printf("\n");
    }
return 0;
}