class Utils {

    companion object {

        fun generateMatrixOfInt(n: Int, m: Int): Array<Array<Int>> {
            var matrix = arrayOf<Array<Int>>()

            for (i in 0 until n) {
                var column = arrayOf<Int>()

                for (j in 0 until m) {
                    column += (-100 until 1000).random()
                }

                matrix += column
            }

            return matrix
        }

        class Node(var value: Int) {
            var next: Node? = null
        }

        class SinglyLinkedList {
            private var head: Node? = null

            /**
             * Used to get the head node from this list.
             *
             * @return The head node.
             * */
            fun first(): Node? {
                return this.head
            }

            /**
             * Responsible to return the last node in list.
             *
             * @return The last node.
             * */
            fun last(): Node? {
                var node = head

                return if (node != null){
                    while (node?.next != null) {
                        node = node.next
                    }

                    node
                } else {
                    null
                }
            }

            /**
             * Iterate through the list until to find the last not null and add new node,
             * or to define the head.
             *
             * @param value The value to be insert to the list
             * */
            fun add(value: Int) {
                if(head == null) {
                    head = Node(value)
                } else {
                    var node = head

                    while (node?.next != null) {
                        node = node.next
                    }

                    node?.next = Node(value)
                }
            }

            /**
             * Removes the first node to match the value provided.
             *
             * @param value The value to be removed from the list if is contained in it.
             * @return The node removed from the list.
             * */
            fun removeFirstToMatch(value: Int): Node? {
                return if(head == null) {
                    head
                } else {
                    var node = head
                    var previous = head

                    while (node?.next != null) {
                        if(node.value == value) {
                            previous?.next = node.next

                            return node
                        }

                        previous = node
                        node = node.next
                    }

                    null
                }

            }

            /**
             * Iterate through list until the last node. Then, remove it.
             *
             * @return The removed last node from list.
             * */
            fun removeLast(): Node? {
                var node = head

                return if (node != null){
                    if(node.next == null){
                        head = null

                        return head
                    }

                    var previous = node

                    while (node!!.next != null) {
                        previous = node
                        node = node.next
                    }

                    previous?.next = node.next

                    node
                } else {
                    null
                }
            }

        }

    }

}