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

    fun removeDupsUsingPointers(unsortedList: LinkedList<Int>): LinkedList<Int> {
        var runner: Int

        for(current in unsortedList.indices) {
            runner = current + 1

            while(runner < unsortedList.size) {
                if(unsortedList[runner] == unsortedList[current]) {
                    unsortedList.removeAt(runner)

                    runner += 1
                }

                runner += 1
            }

        }

        return unsortedList
    }

}
