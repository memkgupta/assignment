#include <stdio.h>

int powerOfTwo(int n){
    return !(n&1);
}

int main(){
printf("%d",powerOfTwo(4));

}