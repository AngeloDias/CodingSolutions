package firstChapter

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

}