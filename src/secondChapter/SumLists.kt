package secondChapter

import utils.Node
import utils.SinglyLinkedList
import kotlin.math.pow

class SumLists {

    fun sumReversedSameSizeForBoth(listA: SinglyLinkedList<Int>, andListB: SinglyLinkedList<Int>): SinglyLinkedList<Int> {
        val sumList = SinglyLinkedList<Int>(0)
        var nodeListA = listA.head
        var nodeListB = andListB.head
        var overForNext = 0
        var sumNumbers:Int

        while(nodeListA != null) {
            sumNumbers = nodeListA.value + nodeListB!!.value + overForNext

            if(sumNumbers > 9) {
                overForNext = 1
                sumNumbers -= 10
            } else {
                overForNext = 0
            }

            sumList.add(sumNumbers)

            nodeListA = nodeListA.next
            nodeListB = nodeListB.next
        }

        if(overForNext == 1) {
            sumList.add(overForNext)
        }

        return sumList
    }

    fun sumRecursivelyReversed(listA: SinglyLinkedList<Int>, withListB: SinglyLinkedList<Int>): SinglyLinkedList<Int> {
        val sumList = SinglyLinkedList<Int>(0)

        recursiveSumReversedLists(listA.head, withListB.head, 0, sumList)

        return sumList
    }

    fun recursiveSumReversedLists(nodeA: Node<Int>?, nodeB: Node<Int>?, remainder: Int, sumList: SinglyLinkedList<Int>): Int {

        if(nodeA == null && nodeB == null) {
            if(remainder > 0) {
                sumList.add(remainder)
            }

            return -1
        }

        var currValue = (nodeA?.value ?: 0) + (nodeB?.value ?: 0) + remainder
        var r = 0

        if (currValue >= 10) {
            currValue -= 10
            r = 1
        }

        sumList.add(currValue)

        return recursiveSumReversedLists(nodeA?.next, nodeB?.next, r, sumList)
    }

    fun sumReversed(listA: SinglyLinkedList<Int>, withListB: SinglyLinkedList<Int>): SinglyLinkedList<Int> {
        val sumList: SinglyLinkedList<Int>
        val transformedA = transformReversed(listToNumber = listA)
        val transformedB = transformReversed(withListB)
        val powerA = transformedA.second
        val powerB = transformedB.second

        sumList = if(powerA > powerB) {
            from(transformedA.first + transformedB.first, powerA)
        } else {
            from(transformedA.first + transformedB.first, powerB)
        }

        return sumList
    }

    private fun calcPowerOfTen(byPowerValue: Int): Int {
        return (10.0.pow(byPowerValue)).toInt()
    }

    fun sumRegular(listA: SinglyLinkedList<Int>, withListB: SinglyLinkedList<Int>): SinglyLinkedList<Int> {
        val sumList = SinglyLinkedList<Int>(0)
        val transformedA = transform(listToNumber = listA)
        val transformedB = transform(withListB)
        var powerA = transformedA.second
        var powerB = transformedB.second

        return sumList
    }

    private fun transform(listToNumber: SinglyLinkedList<Int>): Pair<Int, Int> {
        var number = 0
        var power = 0

        for(elem in listToNumber) {
            number *= calcPowerOfTen(power)
            number += elem

            power += 1
        }

        return Pair(number, power)
    }

    private fun transformReversed(listToNumber: SinglyLinkedList<Int>): Pair<Int, Int> {
        var number = 0
        var power = 0

        for(elem in listToNumber) {
            number += elem * calcPowerOfTen(power)

            power += 1
        }

        return Pair(number, power - 1)
    }

    internal fun from(numberToReversedList: Int, mPower: Int): SinglyLinkedList<Int> {
        val sumList = SinglyLinkedList<Int>(0)
        var power = mPower
        var numberToList = numberToReversedList

        if(numberToList >= calcPowerOfTen(power + 1)) {
            power += 1
        }

        while(power >= 0) {
            val digitToInsertInList = numberToList / calcPowerOfTen(power)

            sumList.insertBeforeHead(digitToInsertInList)

            var diff = calcPowerOfTen(power + 1) - (digitToInsertInList * calcPowerOfTen(power))
            diff = calcPowerOfTen(power + 1) - diff

            numberToList -= diff
            power -= 1
        }

        return sumList
    }

}
