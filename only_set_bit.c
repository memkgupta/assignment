#include<stdio.h>
#include<math.h>
int pos(int n){
    int p = -1;
    int n_bits = log(n)/log(2)+1;
    for(int i = 0;i<n_bits;i++)
    {
    int mask = 1<<i;
        if(mask&n){
            return i;
        }
    }
    return -1;
}
int main(){
    printf("%d",pos(4));
    return 0;
}