package firstChapter

class RotateMatrix {

    fun rotateMatrix90Degrees(matrix: Array<Array<Int>>): Array<Array<Int>> {
        val n = matrix.size

        for (i in 0 until n/2) { // represents the matrix's rings
            var invIndex = n-1-i

            for (j in i until n-1-i) {
                val top = matrix[i][j]
                matrix[i][j] = matrix[invIndex][i] // left to top
                matrix[invIndex][i] = matrix[n-1-i][invIndex] // bottom to left
                matrix[n-1-i][invIndex] = matrix[j][n-1-i] // right to bottom
                matrix[j][n-1-i] = top // top to right

                invIndex -= 1
            }
        }

        return matrix
    }

}
