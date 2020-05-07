package firstChapter

class CheckPermutation(private val stringA: String, private val stringB: String) {

    fun stringsArePermutations(): Boolean {
        val sortedSetB = stringB.toSortedSet()

        if(stringA.length == stringB.length) {
            stringA.toSortedSet().forEach {
                val first = sortedSetB.first()

                if(first != it) {
                    return false
                }

                sortedSetB.remove(first)
            }
        }

        return true
    }

}