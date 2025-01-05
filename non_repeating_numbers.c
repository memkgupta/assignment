#include <stdio.h>
#include <stdlib.h>
int* singleNumber(int* nums, int numsSize) {
    int* res;

    res = (int*)malloc(2*(sizeof(int)));
    int xor_res = 0;
    for(int i = 0;i<numsSize;i++)
    {
        xor_res^=*(nums+i);
    }
    int num1=0;int num2=0;
    int set_bit = xor_res & ~(xor_res-1);
    for(int i = 0;i<numsSize;i++)
    {
        if(set_bit & *(nums+i))
        {
            num1^=*(nums+i);
        }
        else{
            num2^=*(nums+i);
        }
    }
    res[0]=num1;
    res[1] = num2;
    return res;
}

int main(){
int nums[] = {1,2,3,4,1,2,3,5};
int *res= singleNumber(&nums[0],8);
// for(int i = )
printf("%d, %d",*res,*(res+1));
return 0;
}