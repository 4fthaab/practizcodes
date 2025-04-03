#include<stdio.h>
struct student
{
    char name[20];
    int age,admn,dob;
}s[50];
int main()
{
    int i,n;
    printf("enter the number of students\n");
    scanf("%d",&n);
    for(i=0;i<n;i++)
    {
        printf("enter NAME,AGE,ADMN NO.,DOB of student%d\n",i+1);
        
        scanf("%s%d%d%d",&s[i].name,&s[i].age,&s[i].admn,&s[i].dob);
        printf("\n");
    }
    printf("\n");
    printf("DETAILS OF STUDENTS\n");
    printf("\n");
    for(i=0;i<n;i++)
    {
        printf("STUDENT %d\n",i+1);
        printf("NAME : %s\n",s[i].name);
        printf("AGE : %d\n",s[i].age);
        printf("ADMN NO : %d\n",s[i].admn);
        printf("D.O.B : %d\n",s[i].dob);
        printf("\n");
    }
    return 0;
}