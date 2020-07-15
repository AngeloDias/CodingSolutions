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

        class Node<Int>(var value: Int) {
            var next: Node<Int>? = null
        }

        class SinglyLinkedList<Int>(override var size: kotlin.Int) : Collection<Int> {
            var head: Node<Int>? = null

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

                size += 1
            }

            /**
             * Removes the first node to match the value provided.
             *
             * @param value The value to be removed from the list if is contained in it.
             * @return The node removed from the list.
             * */
            fun removeFirstToMatch(value: Int): Node<Int>? {
                return if(head == null) {
                    head
                } else {
                    var node = head
                    var previous = head

                    while (node?.next != null) {
                        if(node.value == value) {
                            previous?.next = node.next
                            size -= 1

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
            fun removeLast(): Node<Int>? {
                var node = head

                return if (node != null){
                    if(node.next == null){
                        head = null
                        size -= 1

                        return head
                    }

                    var previous = node

                    while (node!!.next != null) {
                        previous = node
                        node = node.next
                    }

                    previous?.next = node.next
                    size -= 1

                    node
                } else {
                    null
                }
            }

            /**
             * Do the head node be null.
             * */
            fun clear() {
                head = null
                size = 0
            }

            /**
             * It receives an instance of [SinglyLinkedList] to add values to this list and iterate through
             * each element getting its value and creating a new [Node] in list.
             *
             * @param listToAdd The list to copied to this list.
             * @return True if the [listToAdd] has at least one element to copy, false otherwise.
             * */
            fun addAll(listToAdd: SinglyLinkedList<Int>): Boolean {
                if(listToAdd.head == null) {
                    return false
                }

                for(element in listToAdd) {
                    add(element)
                }

                return true
            }

            override fun contains(element: Int): Boolean {
                if(head == null) {
                    return false
                }
                val iterator = iterator()

                while (iterator.hasNext()) {
                    if(iterator.next() == element) {
                        return true
                    }
                }

                return false
            }

            /**
             * Get the [iterator] and iterate through the collection checking if each element is contained
             * in this collection.
             *
             * @return If all elements from elements are the same in this collection.
             * */
            override fun containsAll(elements: Collection<Int>): Boolean {
                val iterator = iterator()

                while (iterator.hasNext()) {
                    if(!contains(iterator.next())) {
                        return false
                    }
                }

                return true
            }

            /**
             * @return If the head is null.
             * */
            override fun isEmpty(): Boolean {
                return head == null
            }

            /**
             * @return This class Iterator instance.
             * */
            override fun iterator(): Iterator<Int> {
                return SinglyIterator(this)
            }

            fun theNodeAt(index: kotlin.Int): Node<Int>? {
                if(this.isEmpty() || index < 0 || index > this.size) {
                    return null
                }

                var count = 0
                var node = this.head

                while(node!!.next != null) {
                    if(count == index) {
                        return node
                    }

                    node = node.next
                    count += 1
                }

                return null
            }

        }

        class SinglyIterator<Int>(singlyLinkedList: SinglyLinkedList<Int>) : Iterator<Int> {
            var current: Node<Int>? = null

            init {
                current = singlyLinkedList.head
            }

            /**
             * Check if the current [Node] isn't null.
             *
             * @return True if current isn't null, false otherwise.
             * */
            override fun hasNext(): Boolean {
                return current != null
            }

            /**
             * Get the current value and make the current node be the next.
             *
             * @return The value of the next [Node].
             * */
            override fun next(): Int {
                val value = current!!.value
                current = current!!.next

                return value
            }

        }

    }

}
