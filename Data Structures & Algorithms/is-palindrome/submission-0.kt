class Solution {
    fun isPalindrome(s: String): Boolean {
        val string  = cleanStr(s.uppercase())
        var array = string.toCharArray()
        var j = array.lastIndex
        for (i in array.indices ){
            if (array[i] != array[j]) return false
            j--
        }
        return true
    }
    fun cleanStr(s : String):String {
        val result : StringBuilder = StringBuilder()
        var array = s.toCharArray()
        for (i in array.indices){
            if (array[i] == ' ') continue
            if (
                (array[i] >= '0' && array[i] <= '9') ||
                (array[i] >= 'a' && array[i] <= 'z') ||
                (array[i] >= 'A' && array[i] <= 'Z')
                ){
                result.append(array[i])
            }
        }
        return result.toString()
    }
}
