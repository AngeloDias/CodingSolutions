package secondChapter

import utils.Node
import utils.SinglyLinkedList

class ReturnKthToLast {

    fun returnThe(kthToLastIn: Int, linkedList: SinglyLinkedList<Int>): Int {
        if(kthToLastIn < 1) {
            throw Error("The \"kthToLastIn\" must be greater than 0.")
        }

        if(kthToLastIn > linkedList.size) {
            throw Error("The \"kthToLastIn\" can't be greater than the elements amount in list.")
        }

        return linkedList.elementAt(linkedList.size - kthToLastIn)
    }

    fun recursivelyReturnThe(kthToLastIn: Int, linkedList: SinglyLinkedList<Int>): Node<Int>? {
        val temp = SinglyLinkedList<Int>(0)

        temp.addAll(linkedList)

        if(kthToLastIn == 1) {
            return temp.removeLast()
        }

        temp.removeLast()

        return recursivelyReturnThe(kthToLastIn - 1, temp)
    }

    fun iterativelyReturnThe(kthToLastIn: Int, linkedList: SinglyLinkedList<Int>): Int {
        if(kthToLastIn < 1) {
            throw Error("The \"kthToLastIn\" must be greater than 0.")
        }

        if(kthToLastIn > linkedList.size) {
            throw Error("The \"kthToLastIn\" can't be greater than the elements amount in list.")
        }

        var p1 = linkedList.head
        var p2 = linkedList.head
        var count = 0

        while(count < kthToLastIn) {
            if(p1 == null) {
                throw Error("Out of bounds")
            }

            p1 = p1.next
            count += 1
        }

        while(p1 != null) {
            p1 = p1.next
            p2 = p2!!.next
        }

        return p2!!.value
    }

}
