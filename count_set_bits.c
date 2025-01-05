#include <stdio.h>
#include <math.h>
int count(int n) {
    int num_of_bits = log(n)/log(2)+1;
    int count=0;
    for(int i = 0;i<num_of_bits;i++)
    {
        int mask = 1<<i;
        if(n&mask){
            count++;
        }
    }
    return count;
}

int main(){
int bits = count(5);
printf("%d\n",bits);

    return 0;
}