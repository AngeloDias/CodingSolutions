package secondChapter

import utils.Node
import utils.SinglyLinkedList

class DeleteMiddleNode {

    fun knowingHeadDeleteMiddle(nodeIn: Int, linkedList: SinglyLinkedList<Int>): SinglyLinkedList<Int> {
        if(linkedList.size > 2) {
            var node = linkedList.head!!.next
            var previous = linkedList.head

            while (node!!.next != null) {
                if(node.value == nodeIn) {
                    previous!!.next = node.next
                    linkedList.size -= 1
                    break
                }

                previous = node
                node = node.next
            }
        }

        return linkedList
    }

    fun deleteMiddle(nodeIn: Node<Int>?, linkedList: SinglyLinkedList<Int>): SinglyLinkedList<Int> {
        if(nodeIn == null) {
            return linkedList
        }

        var node = nodeIn

        while (node!!.next != null) {
            node.value = node.next!!.value

            node = node.next
        }

        linkedList.removeLast()

        return linkedList
    }

}