package firstChapter

/**
 * The @param uniqueStr is guaranteed to be inside 128-character alphabet
 * */
class IsUniqueQuestion(uniqueStr: String) {
    var unique: String = uniqueStr

    fun checkIsUniqueWithHashMap():Boolean {
        if(unique.length > 128) {
            return false
        }

        val charHashMap = HashMap<Char, Char>()

        unique.forEach {
            if(charHashMap.containsKey(it)) {
                return false
            } else {
                charHashMap[it] = it
            }
        }

        return true
    }

    fun checkIsUniqueWithBooleanArray(): Boolean {
        if(unique.length > 128) {
            return false
        }

        val booleanArray = BooleanArray(128)

        unique.forEach {
            val charIntPosition = it.toInt()

            if(booleanArray[charIntPosition]) {
                return false
            }

            booleanArray[charIntPosition] = true
        }

        return true
    }

    /** Only characters in a-z interval are allowed */
    fun checkIsUniqueWithBits(): Boolean {
        if(unique.length > 26) {
            return false
        }

        var checker = 0

        unique.forEach {
            val charIntPosition = it - 'a'

            if((checker and (1 shl charIntPosition)) > 0) {
                return false
            }

            checker = checker or (1 shl charIntPosition)
        }

        return true
    }

}
