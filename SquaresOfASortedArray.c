int* sortedSquares(int* nums, int numsSize, int* returnSize)
{
    int *res = malloc(sizeof(nums[0]) * numsSize);
    int start = 0;
    int end = numsSize - 1;
    for (int i = numsSize - 1; start <= end; i--) {
        int a = nums[start] * nums[start];
        int b = nums[end] * nums[end];
        if (a > b) {
            res[i] = a;
            start++;
        } else {
            res[i] = b;
            end--;
        }
    }
    *returnSize = numsSize;
    return res;
}
