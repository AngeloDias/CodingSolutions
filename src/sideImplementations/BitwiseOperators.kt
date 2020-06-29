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

    fun setToOneThe(nthBit: Int, fromNumber: Int): Int{
        if(nthBit < 0) {
            return fromNumber
        }

        return (1 shl nthBit) or fromNumber
    }

    fun getHighestOrderSetBitPosition(fromNumber: Int): Int {
        if(fromNumber == 0) {
            return -1
        }

        var position = -1

        for(i in 0 until Int.SIZE_BITS) {

            if ((fromNumber shr i) and 1 == 1) {
                position = i
            }
        }

        return position
    }

    fun getLowestOrderSetBitPosition(fromNumber: Int): Int {
        if(fromNumber == 0) {
            return -1
        }

        for(i in 0 until Int.SIZE_BITS) {
            if ((fromNumber shr i) and 1 == 1) {
                return i
            }
        }

        return -1
    }

}