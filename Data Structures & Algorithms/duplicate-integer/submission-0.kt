class Solution {
    fun hasDuplicate(nums: IntArray): Boolean {
        for (i in nums.indices){
            for (j in i+1 .. nums.lastIndex){
                if (nums[i].equals(nums[j])) return true
            }
        }
        return false
    }
}
