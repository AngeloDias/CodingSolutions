package firstChapter

class StringCompression {

    fun compressString(original: String): String {
        if(original.isEmpty()) {
            return original
        }

        var compressed = ""
        var countPreviousChar = 0
        var previousChar = original[0]

        for(i in original.indices) {
            if(original[i] != previousChar) {
                compressed = "$compressed$previousChar$countPreviousChar"
                countPreviousChar = 1
            } else {
                countPreviousChar += 1
            }

            if(i+1 == original.length) {
                compressed = if (original[i] == previousChar) {
                    "$compressed$previousChar$countPreviousChar"
                } else {
                    "$compressed${original[i]}1"
                }
            }

            if(compressed.length >= original.length) {
                return original
            }

            previousChar = original[i]

        }

        return compressed
    }

    fun compressStringUsingStringBuilder(original: String): String {
        if(original.isEmpty()) {
            return original
        }

        val compressed = StringBuilder("")
        var countPreviousChar = 0
        var previousChar = original[0]

        for(i in original.indices) {
            if(original[i] != previousChar) {
                compressed.append(previousChar)
                compressed.append(countPreviousChar)

                countPreviousChar = 1
            } else {
                countPreviousChar += 1
            }

            if(i+1 == original.length) {
                if (original[i] == previousChar) {
                    compressed.append(previousChar)
                    compressed.append(countPreviousChar)
                } else {
                    compressed.append(original[i])
                    compressed.append(1)
                }
            }

            if(compressed.length >= original.length) {
                return original
            }

            previousChar = original[i]

        }

        return compressed.toString()
    }

}
