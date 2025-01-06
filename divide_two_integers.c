#include <stdio.h>
#include <stdlib.h>

int main()
{
    int n1, n2;

    printf("Enter the numbers: ");
    scanf("%d %d", &n1, &n2);

    if (n2 == 0)
    {
        printf("Error: Division by zero is not allowed.\n");
        return 1;
    }

    int sign = !((n1 < 0 && n2 > 0) || (n2 < 0 && n1 > 0));
    int dividend = abs(n1);
    int divisor = abs(n2);
    int q = 0;

    while (dividend >= divisor)
    {
        int count = 0;
        int temp = dividend;

        while (temp - (divisor << count) >= 0)
        {
            count++;
        }

        dividend -= (divisor << (count - 1));
        q += (1 << (count - 1)); // Add 2^(count - 1) to the quotient
    }

    if (!sign)
    {
        q = -q;
    }

    printf("Quotient is %d, Remainder is %d\n", q, dividend);
    return 0;
}
