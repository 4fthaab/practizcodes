#include <stdio.h>
#define pie 3.14

int main()
{
    int r;
    float area;
    printf("enter the radius of circle");
    scanf("%d", &r);
    area = pie * r * r;
    printf("%f", area);
    return 0;
}