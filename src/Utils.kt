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

            fun first(): Node? {
                return this.head
            }

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
        }

    }

}