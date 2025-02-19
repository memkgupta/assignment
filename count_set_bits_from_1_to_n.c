#include<stdio.h>
#include<math.h>
int countSetBits(int n){
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
    int n;
    printf("Enter the number: ");
    scanf("%d",&n);
    int res = 0;
    for(int i = 1;i<n;i++){
        res+=countSetBits(i);
    }
    printf("Total Set bits %d",res);
    return 0;
}