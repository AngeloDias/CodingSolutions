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

    fun removeDupsUsingPointers(linkedList: SinglyLinkedList<Int>): SinglyLinkedList<Int> {
        var runner: Int

        for(current in linkedList.indices) {
            runner = current + 1

            while(runner < linkedList.size) {

                runner += 1
            }

        }

        return linkedList
    }

}
