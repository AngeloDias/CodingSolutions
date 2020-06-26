package sideImplementations

class BitwiseOperators {

    fun isTheLeastSignificantBitSet(number: Int): Boolean {
        if(number and 1 == 1) {
            return true
        }

        return false
    }

    fun isTheMostSignificantBitSet(number: Int): Boolean {
        val msb = 1 shl (Int.SIZE_BITS - 1)

        if(number and msb == msb) {
            return true
        }

        return false
    }

    fun isSetThe(nthBit: Int, fromNumber: Int): Boolean {
        if((fromNumber shr (nthBit - 1)) and 1 == 1) {
            return true
        }

        return false
    }

}