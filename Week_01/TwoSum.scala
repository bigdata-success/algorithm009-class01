object TwoSum {
    def twoSum(nums: Array[Int], target: Int): Array[Int] = {
        val res = new ArrayBuffer()
        for(i <- 0 to nums.length) {
            for (j <- 1 to nums.length) {
                if (nums[i] + nums[j] == target) {
                    res += nums[i]
                    res += nums[j]
                }
                
            }
        }
        res
    }
}
