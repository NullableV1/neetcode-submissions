class Solution {
    fun hasDuplicate(nums: IntArray): Boolean {
        for (i in nums.indices){
            val duplicateNumber = nums.count{
            it == nums[i]
            }
            if (duplicateNumber > 1 ) return true
        }
        return false
    }
}
