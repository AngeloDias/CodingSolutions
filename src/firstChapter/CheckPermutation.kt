package firstChapter

class CheckPermutation(val stringA: String, val stringB: String) {

    fun stringsArePermutations(): Boolean {
        val sortedSetB = stringB.toSortedSet()

        if(stringA.length == stringB.length) {
            stringA.toSortedSet().forEach {
                val first = sortedSetB.first()

                print("First: $first - it: $it\n")

                if(first != it) {
                    return false
                }

                sortedSetB.remove(first)
            }

            return true
        }

        return false
    }

}