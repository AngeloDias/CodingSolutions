package secondChapter

import utils.SinglyLinkedList

class Partition {

    fun partition(linkedList: SinglyLinkedList<Int>, byNumber: Int): SinglyLinkedList<Int> {
        var node = linkedList.head
        val iterator = linkedList.iterator()
        var globalPrevious = node
        var localPrevious = node
        var firstNode = true
        var firstGreaterThanOrEqual = false

        while (iterator.hasNext()) {

            if(!firstNode && node!!.value < byNumber) {
                localPrevious!!.next = node.next

                if(!firstGreaterThanOrEqual && linkedList.head!!.value >= byNumber) {
                    firstGreaterThanOrEqual = true

                    node.next = globalPrevious
                    linkedList.head = node
                } else {
                    node.next = globalPrevious!!.next
                    globalPrevious.next = node
                }

                globalPrevious = node
            }

            localPrevious = node
            node = node!!.next
            firstNode = false

            iterator.next()
        }

        return linkedList
    }

    fun otherPartition(linkedList: SinglyLinkedList<Int>, byNumber: Int): SinglyLinkedList<Int> {
        if(!linkedList.isEmpty()) {
            var node = linkedList.head
            var head = node
            var tail = node

            while (node != null) {
                val next = node.next

                if (node.value < byNumber) {
                    node.next = head
                    head = node
                } else {
                    tail!!.next = node
                    tail = node
                }

                node = next
            }

            tail!!.next = null
            linkedList.head = head
        }

        return linkedList
    }

}
