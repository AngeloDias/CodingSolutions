package firstChapter

class URLify {

    fun changeBlankSpacesToSymbols(strURL: String, strLength: Int): String {
        var blankSpacesArray = ""

        for (i in 0 until (strLength - strURL.length)) {
            blankSpacesArray += "%20"
        }

        return strURL.plus(blankSpacesArray).replace(" ", "%20", ignoreCase = true)
    }

}
