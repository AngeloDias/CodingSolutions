package secondChapter

import Utils.Companion.SinglyLinkedList
import Utils.Companion.Node

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

}
