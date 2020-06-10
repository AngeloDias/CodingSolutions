package firstChapter

class URLify {

    fun changeBlankSpacesToSymbols(strURL: String, strLength: Int): String {
        var blankSpacesArray = ""

        for (i in 0 until (strLength - strURL.length)) {
            blankSpacesArray += "%20"
        }

        return strURL.plus(blankSpacesArray).replace(" ", "%20", ignoreCase = true)
    }

    fun changeBlankToSymbolsIteration(strURL: String): String {
        var retStr = strURL

        for(i in (strURL.length - 1) downTo 0) {

            if(strURL[i] == ' ') {
                retStr = if((i + 1) < retStr.length) {
                    "${retStr.substring(0, i)}%20${retStr.substring(i+1, retStr.length)}"
                } else {
                    "${retStr.substring(0, i)}%20"
                }
            }

        }

        return retStr

    }

}
