package secondChapter

import java.util.LinkedList
import Utils.Companion.SinglyLinkedList

class RemoveDups {

    fun removeDupsUsingHashTable(unsortedList: LinkedList<Int>): LinkedList<Int> {
        val mapMemory = HashMap<Int,Int>()
        val dupsRemoved = LinkedList<Int>()

        unsortedList.forEach {
            if(!mapMemory.containsKey(it)) {
                dupsRemoved.add(it)
                mapMemory[it] = it
            }
        }

        return dupsRemoved
    }

    /**
     * It assumes that the [linkedList] has an even number of items.
     * */
    fun removeDupsUsingPointers(linkedList: SinglyLinkedList<Int>): SinglyLinkedList<Int> {
        val iterator = linkedList.iterator()
        var runner = linkedList.head
        var reachedTheEnd = false
        var currentValue = 0
        var previous = runner

        while(iterator.hasNext()) {
            if(!reachedTheEnd && runner!!.next!!.next == null) {
                runner = linkedList.head!!.next
                reachedTheEnd = true
            }

            currentValue = iterator.next()

            if(reachedTheEnd) {
                if(currentValue == runner!!.value) {
                    previous!!.next = runner.next
                }

                runner = runner.next
            } else {
                runner = runner!!.next!!.next
            }

            previous = runner
        }

        return linkedList
    }

}
