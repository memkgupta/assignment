#include <stdio.h>

void generatePowerSet(int arr[], int n) {
    int totalSubsets = 1 << n;
    for (int i = 0; i < totalSubsets; i++) {
        printf("{ ");
        for (int j = 0; j < n; j++) {
            if (i & (1 << j)) {
                printf("%d ", arr[j]);
            }
        }
        printf("}\n");
    }
}

int main() {
    int arr[] = {1, 2, 3};
    int n = sizeof(arr) / sizeof(arr[0]);
    generatePowerSet(arr, n);
    return 0;
}
