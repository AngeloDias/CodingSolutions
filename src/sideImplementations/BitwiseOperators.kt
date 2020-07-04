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

    fun getHighestOrderSetBitPositionFrom(number: Int): Int {
        if(number == 0) {
            return -1
        }

        var position = -1

        for(i in 0 until Int.SIZE_BITS) {

            if ((number shr i) and 1 == 1) {
                position = i
            }
        }

        return position
    }

    fun getLowestOrderSetBitPositionFrom(number: Int): Int {
        if(number == 0) {
            return -1
        }

        for(i in 0 until Int.SIZE_BITS) {
            if ((number shr i) and 1 == 1) {
                return i
            }
        }

        return -1
    }

    fun countTrailingZerosFrom(number: Int): Int{
        var count = 0
        var aux = number

        while (aux != 0 && (aux and 1) == 0) {
            count += 1

            aux = aux shr 1
        }

        return count
    }

    fun countLeadingZerosFrom(number: Int): Int {
        val msb = 1 shl (Int.SIZE_BITS - 1)

        for (i in 0 until Int.SIZE_BITS) {

            if((number shl i) and msb == msb) {
                return i
            }

        }

        return 0
    }

    fun flipBitsFrom(number: Int): Int {
        return number.inv()
    }

    fun countZerosAndOnesFrom(number: Int): ZerosAndOnes {
        val zerosAndOnes = ZerosAndOnes()

        for(i in 0 until Int.SIZE_BITS) {
            if((number shr i) and 1 == 1) {
                zerosAndOnes.ones += 1
            } else {
                zerosAndOnes.zeros += 1
            }
        }

        return zerosAndOnes
    }

    class ZerosAndOnes {
        var zeros = 0
        var ones = 0
    }

    fun bitwiseRotate(number: Int, fromRotationNumber: Int): RotatedNumber {
        if(fromRotationNumber < 0) {
            throw Error("Invalid number")
        }

        val rotatedNumber = RotatedNumber(number)

        for(i in 0 until fromRotationNumber) {
            // left rotation
            if(isTheMostSignificantBitSet(rotatedNumber.leftRotated)) {
                rotatedNumber.leftRotated = rotatedNumber.leftRotated shl 1
                rotatedNumber.leftRotated = rotatedNumber.leftRotated or 1
            } else {
                rotatedNumber.leftRotated = rotatedNumber.leftRotated shl 1
            }

            // right rotation
            if(isTheLeastSignificantBitSet(rotatedNumber.rightRotated)) {
                rotatedNumber.rightRotated = rotatedNumber.rightRotated shr 1
                rotatedNumber.rightRotated = rotatedNumber.rightRotated or (1 shl (Int.SIZE_BITS- 1))
            } else {
                rotatedNumber.rightRotated = rotatedNumber.rightRotated ushr 1
            }
        }

        return rotatedNumber
    }

    class RotatedNumber() {
        var leftRotated = 0
        var rightRotated = 0

        constructor(number: Int): this() {
            leftRotated = number
            rightRotated = number
        }
    }

}
