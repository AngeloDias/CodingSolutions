package firstChapter

class StringRotation {

    fun checkIfStringIs(rotation: String, ofStringA: String): Boolean {
        if(rotation.length != ofStringA.length) {
            throw Error("Strings \"$rotation\" and \"$ofStringA\" doesn't have the same size.")
        }
        val dup = "$ofStringA$ofStringA"

        return dup.contains(rotation)
    }

}
