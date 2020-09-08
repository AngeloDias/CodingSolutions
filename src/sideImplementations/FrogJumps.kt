package sideImplementations

class FrogJumps {

    companion object {
        fun solution(x: Int, y: Int, d: Int): Int {
            var jumps = ((y - x) / d)

            if(x + (jumps * d) < y) {
                jumps++
            }

            return jumps
        }

        fun iterativeSolution(x: Int, y: Int, d: Int): Int {
            var jumps = 0

            while(x + (jumps * d) < y) {
                jumps++
            }

            return jumps
        }
    }

}
