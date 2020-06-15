package sideImplementations

class CyclicRotation {

    fun solution(A: IntArray, K: Int): IntArray {
        var index = 0

        while(index < K) {
            var curr: Int
            var next = -1001

            if(A.isNotEmpty()) {
                next = A[0]
            }

            for (i in A.indices) {
                curr = next

                if (i == 0) {
                    A[i] = A[A.size-1]
                }

                if(i+1 < A.size) {
                    next = A[i+1]
                    A[i+1] = curr
                } else {
                    next = A[0]
                    A[0] = curr
                }
            }

            index += 1
        }

        return A
    }

}
