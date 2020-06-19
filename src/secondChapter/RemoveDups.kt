package secondChapter

import java.util.LinkedList

class RemoveDups() {

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

}
