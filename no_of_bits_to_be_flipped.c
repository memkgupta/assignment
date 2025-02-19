#include<stdio.h>

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
int n_bits(int a, int b){
    int xor = a^b;
    return count(xor);
}
int main(){
printf("%d",n_bits(3,4));
return 0;
}