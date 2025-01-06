#include<stdio.h>
// int calculateMultiplicand()
int main(){
    int n;
    printf("Enter the number ");
    scanf("%d",&n);
    int pre = n;
    int res = 0;
    int i = 0;
    while(pre>0){
        if(pre&1){
         res+=(n<<i);
        }
        i++;
        pre = pre>>1;
    }
    printf("%d",res);
    return 0;
}