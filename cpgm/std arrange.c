#include<stdio.h>
struct student
{
    char name[20];
    int age,admn,dob;
}s[50],temp;
int main()
{
    int i,n,j;
    printf("enter the number of students\n");
    scanf("%d",&n);
    for(i=0;i<n;i++)
    {
        printf("enter NAME,AGE,ADMN NO.,DOB of student%d\n",i+1);
        
        scanf("%s%d%d%d",&s[i].name,&s[i].age,&s[i].admn,&s[i].dob);
        printf("\n");
    }
    for(i=0;i<n-1;i++)
    {
        for(j=0;j<n-1-i;j++)
        {
            if(strcmp(s[j].name,s[j+1].name)>0)
            {
                temp = s[j];
                s[j]= s[j+1];
                s[j+1]= temp;
            }
        }
    }
    printf("Sorted list :");
    printf("\n");
    printf("NAME\t\t AGE\t ADMN NO.\t DOB\n\n");
    for(i=0;i<n;i++)
    {
        printf("%s\t\t %d\t %d\t\t %d\n",s[i].name,s[i].age,s[i].admn,s[i].dob);
    }
    return 0;
}