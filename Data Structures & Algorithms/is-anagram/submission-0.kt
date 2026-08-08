class Solution {
    fun isAnagram(s: String, t: String): Boolean {
        if (s.length != t.length) return false
        val hashMap = HashMap<Char,Int>()
        val charArray = s.toCharArray()
        for (i in s.indices){
            val count = hashMap.getOrDefault(charArray[i],0)
            hashMap[charArray[i]] = count + 1
        }
        val tCharArray = t.toCharArray()
        for (i in t.indices){
            val count = hashMap.getOrDefault(tCharArray[i],-1)
            hashMap[tCharArray[i]] = count - 1
        }
        for (i in t.indices){
            val count = hashMap.getOrDefault(tCharArray[i],-1)
            if (count != 0 ) return false 
        }
        return true 
    }
}
