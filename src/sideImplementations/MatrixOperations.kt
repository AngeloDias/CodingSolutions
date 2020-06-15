package sideImplementations

class MatrixOperations {

    fun multiplyMatrices(a: Array<Array<Int>>, b: Array<Array<Int>>):
            Array<Array<Int>> {
        if(a.isEmpty() || b.isEmpty() || a[0].size != b.size) {
            return arrayOf()
        }

        var resultingMatrix = arrayOf<Array<Int>>()

        for(i in a.indices) {
            var column = arrayOf<Int>()
            var rowValue = 0

            for (j in a[i].indices) {
                for(k in b.indices) {
                    rowValue += a[i][k] * b[k][j]
                }

                column += rowValue
                rowValue = 0
            }

            resultingMatrix += column
        }

        return resultingMatrix
    }

    fun scalarMultiplication(matrix: Array<Array<Int>>, scalar: Int): Array<Array<Int>> {
        if(matrix.isEmpty()) {
            return arrayOf()
        }

        var resultingMatrix = arrayOf<Array<Int>>()

        for(i in matrix.indices) {
            var column = arrayOf<Int>()

            for (j in matrix[i].indices) {
                column += matrix[i][j] * scalar
            }

            resultingMatrix += column
        }

        return resultingMatrix
    }

    fun addOrSubtractTwoMatrices(a: Array<Array<Int>>, b: Array<Array<Int>>, isToSubtract: Boolean):
            Array<Array<Int>> {
        if(a.isEmpty() || b.isEmpty() || a.size != b.size || a[0].size != b[0].size) {
            return arrayOf()
        }

        var resultingMatrix = arrayOf<Array<Int>>()
        var factor = 1

        if(isToSubtract) {
            factor = -1
        }

        for(i in a.indices) {
            var column = arrayOf<Int>()

            for (j in a[i].indices) {
                column += a[i][j] + (b[i][j] * factor)
            }

            resultingMatrix += column
        }

        return resultingMatrix
    }

}
