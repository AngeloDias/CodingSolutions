package firstChapter

class RotateMatrix {

    fun rotateMatrix90Degrees(matrix: Array<Array<Int>>): Array<Array<Int>> {
        val n = matrix.size
        val jumpsToDo = n-1

        for (i in 0..n) {
            for (j in 0..n) {
                var currVal = matrix[i][j]
            }
        }

        return matrix
    }

    fun generateMatrix(n: Int): Array<Array<Int>> {
        var matrix = arrayOf<Array<Int>>()

        for(i in 0..n) {
            var array = arrayOf<Int>()

            for(j in 0..n) {
                array += (0..100).random()
            }

            matrix += array
        }

        return matrix
    }

}
