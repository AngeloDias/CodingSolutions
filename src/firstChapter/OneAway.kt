package firstChapter

class OneAway {

    fun zeroOrOneEditAway(strA: String, strB: String): Boolean {

        if(strA.length > strB.length) {
            return compareCharsDiffLength(strA, strB)
        } else if(strA.length < strB.length) {
            return compareCharsDiffLength(strB, strA)
        }

        return checkStringWasEditedAtMostOneAway(strB, strA)
    }

    /**
     * This function assumes that the two strings are the same length
     * */
    fun checkStringWasEditedAtMostOneAway(strA: String, strB: String): Boolean {
        var oneAway = false

        for(i in strA.indices) {
            if(strA[i].toLowerCase() != strB[i].toLowerCase()) {
                if(oneAway) {
                    return false
                }

                oneAway = true
            }
        }

        return true
    }

    fun compareCharsDiffLength(biggerStr: String, smallestStr: String): Boolean {
        return true
    }

}
