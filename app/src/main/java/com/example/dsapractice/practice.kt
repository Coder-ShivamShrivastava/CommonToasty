package com.example.dsapractice

fun main(){
    lengthOfLongestSubstring()
}
fun lengthOfLongestSubstring(s: String = "hkcpm prx xxqw"): Int {

        val set = mutableSetOf<Char>()
        val temp = mutableSetOf<Char>()

        for (i in s.indices){
            if (!set.contains(s[i])){
                set.add(s[i])
            }else{
                if (temp.size<=set.size){
                temp.clear()
                temp.addAll(set)
                   val position =  set.indexOfFirst{
                       s[i]== it
                   }
                    for (j in 0..position){
                        set.remove(temp.elementAt(j))
                    }
                    set.add(s[i])
                }
            }
        }

    println(set)
    println(set.size)
    println(temp)
    println(temp.size)

    return if(set.size>temp.size) set.size else temp.size


}