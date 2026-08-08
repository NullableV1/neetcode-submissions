class Solution {
    fun hasDuplicate(nums: IntArray): Boolean {
        var hashSet = HashSet<Int>()
        for (i in nums.indices){
            if(!hashSet.add(nums[i])) return true
        }
        return false
    }
}
