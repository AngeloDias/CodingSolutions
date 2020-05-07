package firstChapter

class IsUniqueQuestion(private val unique: String) {
    private val charHashMap = HashMap<Char, Char>()

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