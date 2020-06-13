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
        if(strA.length != strB.length) {
            return false
        }

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
        if(biggerStr.length - smallestStr.length > 1) {
            return false
        }

        var indexBigger = 0
        var indexSmallest = 0
        var foundAway = false

        while (indexBigger < biggerStr.length && indexSmallest < smallestStr.length) {

            if(biggerStr[indexBigger].toLowerCase() != smallestStr[indexSmallest].toLowerCase()) {
                if (foundAway) {
                    return false
                }

                foundAway = true
                indexBigger += 1
            } else {
                indexBigger += 1
                indexSmallest += 1
            }

        }

        return true
    }

}
