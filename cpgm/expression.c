#include <stdio.h>
int main()
{
    int a, b, c, d, e, f, g, result;
    printf("enter the values a b c d e f g\n");
    scanf("%d%d%d%d%d%d%d", &a, &b, &c, &d, &e, &f, &g);
    result = ((a - b / c * d + e) * (f + g));
    printf("value of [(%d-%d/%d*%d+%d)*(%d+%d)] is %d", a, b, c, d, e, f, g, result);
    return 0;
}