package firstChapter

class RotateMatrix {

    fun rotateMatrix90Degrees(matrix: Array<Array<Int>>): Array<Array<Int>> {
        val n = matrix.size
        var top = arrayOf<Int>()
        var right = arrayOf<Int>()
        var left = arrayOf<Int>()
        var bottom = arrayOf<Int>()

        for (i in 0 until n-2) {
            for (j in 0 until n-1-i) {
                var invIndex = n-1

                top += matrix[i][j]
                right += matrix[j][n-1-i]
                bottom += matrix[n-1-i][invIndex]
                left += matrix[invIndex][i]
                
                invIndex -= 1
            }
        }

        return matrix
    }

}
