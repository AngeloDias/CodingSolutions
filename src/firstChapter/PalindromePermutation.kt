package firstChapter

import kotlin.collections.HashMap

class PalindromePermutation {

    fun checkPalindromeAlreadyOrdered(phrase: String): Boolean {
        val cleanPhrase = phrase.replace(" ", "")
        val phraseMiddleIndex = cleanPhrase.length/2
        val firstPart = cleanPhrase.substring(0, phraseMiddleIndex)
        var i = cleanPhrase.length - 1

        firstPart.forEach {
            if(it.toLowerCase() != cleanPhrase[i].toLowerCase()) {
                return false
            }

            i -= 1
        }

        return cleanPhrase.isEmpty() xor true
    }

    fun checkPalindromePermutationByCountingChars(phrase: String): Boolean {
        val cleanPhrase = phrase.replace(" ", "")
        val countingChars = checkCharsInPhrase(cleanPhrase)

        return (cleanPhrase.isEmpty() xor true) && countOddsRepeatingLessThanTwice(countingChars)
    }

    fun checkPalindromePermutationFromBitVector(phrase: String): Boolean {
        val cleanPhrase = phrase.replace(" ", "")
        val bitVector = createBitVectorInIntFromPhrase(cleanPhrase)

        return (cleanPhrase.isEmpty() xor true) && checkFinalNumberWasToggledEvenOrOddTimes(bitVector)
    }

    fun checkCharsInPhrase(cleanPhrase: String): HashMap<Char, Int> {
        val countingChars = HashMap<Char, Int>()

        cleanPhrase.forEach {
            val charLower = it.toLowerCase()

            if (countingChars.containsKey(charLower)) {
                countingChars[charLower] = countingChars[charLower]!!.inc()
            } else {
                countingChars[charLower] = 1
            }
        }

        return countingChars
    }

    fun createBitVectorInIntFromPhrase(cleanPhrase: String): Int {
        var retBitNum = 0

        cleanPhrase.forEach {
            val charLowerAfterOffset = it.toLowerCase() - 'a'
            val mask = 1 shl charLowerAfterOffset // saving number in binary representation

            // checking if the number was already evaluated in binary representation
            retBitNum = if((retBitNum and mask) == 0) {
                retBitNum or mask // saving the new number to the bit vector
            } else {
                retBitNum and mask.inv()
            }

        }

        return retBitNum
    }

    fun countOddsRepeatingLessThanTwice(countingChars: HashMap<Char, Int>): Boolean {
        var countOdds = 0

        countingChars.values.forEach {
            if ((it % 2) == 1) {
                countOdds += 1

                if (countOdds > 1) {
                    return false
                }
            }
        }

        return true
    }

    /**
     * The return, if true, means that it is an even number, otherwise an odd number.
     * */
    fun checkFinalNumberWasToggledEvenOrOddTimes(bitVector: Int): Boolean {
        return (bitVector and (bitVector - 1)) == 0
    }

}
