package secondChapter

import java.util.LinkedList

class RemoveKthToLast {

    fun remove(kthToLastIn: Int, linkedList: LinkedList<Int>): LinkedList<Int> {
        val removed = LinkedList<Int>()

        removed.addAll(linkedList)

        for (i in 0 until kthToLastIn) {
            linkedList.removeLast()
        }

        removed.removeAt(linkedList.lastIndex)

        return removed
    }

    fun recursivelyRemove(kthToLastIn: Int, linkedList: LinkedList<Int>): LinkedList<Int> {
        if(kthToLastIn > 0) {
            linkedList.removeLast()
            return recursivelyRemove(kthToLastIn - 1, linkedList)
        }

        return linkedList
    }

}