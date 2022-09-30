func findDuplicates(nums []int) []int {
    //we can make use of index of nums
    n := len(nums)
    res := []int{}
    for i := 0; i < n; i++ {
        k := nums[i]
        if nums[abs(k)-1] < 0 {
            res = append(res, abs(k))
        }
        nums[abs(k)-1] = -nums[abs(k)-1]
    }
    return res
}

func abs(x int) int {
    if x >= 0 {
        return x
    } else {
        return -x
    }
}
