package secondChapter

import java.util.LinkedList
import utils.SinglyLinkedList

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
        var current = linkedList.head

        while(iterator.hasNext()) {
            var runner = current

            while (runner!!.next != null) {
                if(current!!.value == runner.next!!.value) {

                    runner.next = runner.next!!.next
                } else {
                    runner = runner.next
                }

            }

            current = current!!.next

            iterator.next()
        }

        return linkedList
    }

}
