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

    fun matricesAreEquals(a: Array<Array<Int>>, b: Array<Array<Int>>): Boolean {
        if((a.isNotEmpty() && b.isNotEmpty() && (a.size != b.size || a[0].size != b[0].size)) ||
            (a.isEmpty() || b.isEmpty())) {
            return false
        }

        for (i in a.indices) {
            for (j in a[i].indices) {
                if(a[i][j] != b[i][j]) {
                    return false
                }
            }
        }

        return true
    }

    fun diagonalSum(a: Array<Array<Int>>, isMainDiagonal: Boolean): Int {
        var sum = 0

        for (i in a.indices) {
            for (j in a[i].indices) {
                if(isMainDiagonal && i == j) {
                    sum += a[i][j]
                } else if(!isMainDiagonal && i+j == a.size-1) {
                    sum += a[i][j]
                }
            }
        }

        return sum
    }

    fun sumRowsAndColumnsValues(matrix: Array<Array<Int>>): HashMap<String, Array<Int>> {
        val sum = HashMap<String, Array<Int>>()
        var rowsSum = arrayOf<Int>()
        var columnsSum = arrayOf<Int>()

        for(i in matrix.indices) {
            var r = 0

            for(j in matrix[i].indices) {
                r += matrix[i][j]

                if(columnsSum.size < matrix.size) {
                    columnsSum += matrix[i][j]
                } else {
                    columnsSum[j] += matrix[i][j]
                }
            }

            rowsSum += r
        }

        sum["rowsSum"] = rowsSum
        sum["columnsSum"] = columnsSum

        return sum
    }

    fun interchangeDiagonals(matrix: Array<Array<Int>>): Array<Array<Int>> {

        for(i in matrix.indices) {
            val mainDiagonalElement = matrix[i][i]
            matrix[i][i] = matrix[i][matrix.size - 1 - i]
            matrix[i][matrix.size - 1 - i] = mainDiagonalElement
        }

        return matrix
    }

    fun isUpperTriangular(matrix: Array<Array<Int>>): Boolean {
        for(i in matrix.indices) {
            for(j in matrix[i].indices) {
                if(i > j && matrix[i][j] != 0) {
                    return false
                }
            }
        }

        return true
    }

    fun isUpperTriangularReducedIterations(matrix: Array<Array<Int>>): Boolean {
        for(i in matrix.indices) {

            for(j in 0 until i) {
                if(i > j && matrix[i][j] != 0) {
                    return false
                }
            }

        }

        return true
    }

    fun isLowerTriangular(matrix: Array<Array<Int>>): Boolean {
        for(i in matrix.indices) {

            for(j in (i + 1) until matrix[i].size) {
                if(matrix[i][j] != 0) {
                    return false
                }
            }

        }

        return true
    }

    fun upperTriangularSum(matrix: Array<Array<Int>>): Int {
        var sum = 0

        for(i in matrix.indices) {
            for(j in (i + 1) until matrix[i].size) {
                sum += matrix[i][j]
            }
        }

        return sum
    }

    fun lowerTriangularSum(matrix: Array<Array<Int>>): Int {
        var sum = 0

        for(i in matrix.indices) {
            for(j in 0 until i) {
                sum += matrix[i][j]
            }
        }

        return sum
    }

    fun transpose(matrix: Array<Array<Int>>): Array<Array<Int>> {
        for(i in matrix.indices) {
            for (j in i until matrix[i].size) {
                val currentVal = matrix[i][j]
                matrix[i][j] = matrix[j][i]
                matrix[j][i] = currentVal
            }
        }

        return matrix
    }

    fun determinantOf(matrix: Array<Array<Int>>): Int {
        var mainDiagonal = 1
        var minorDiagonal = 1

        if(matrix.size % 2 == 1) {
            val mid = matrix.size/2
            minorDiagonal *= matrix[mid][mid]
        }

        for (i in matrix.indices) {
            for (j in matrix[i].indices) {
                if(i == j) {
                    mainDiagonal *= matrix[i][j]
                } else if(i+j == matrix.size-1) {
                    minorDiagonal *= matrix[i][j]
                }
            }
        }

        return mainDiagonal - minorDiagonal
    }

}
