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

    }

}