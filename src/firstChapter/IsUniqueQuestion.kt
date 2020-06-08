package firstChapter

class IsUniqueQuestion(uniqueStr: String) {
    private val charHashMap = HashMap<Char, Char>()
    var unique: String = uniqueStr

    fun printArray() {
        for (i in unique) {
            print("Char: ${i}\n")
        }
    }

    fun checkIsUnique():Boolean {

        unique.toCharArray().forEach {
            if(charHashMap.containsKey(it)) {
                return false
            } else {
                charHashMap[it] = it
            }
        }

        return true
    }
}