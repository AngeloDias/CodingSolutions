package firstChapter

class ZeroCrusadeMatrix {

    fun crusade(matrix: Array<Array<Int>>): Array<Array<Int>> {
        val n = matrix.size
        var hasZero = false
        var enteredCol = false
        var enteredLine = false
        val arrayRow = BooleanArray(n)
        val arrayColumn = BooleanArray(n)

        for (i in 0 until n) {
            var j = 0

            while (j < n) {
                if(matrix[i][j] == 0) {
                    hasZero = true
                    arrayRow[i] = true
                    arrayColumn[j] = true
                    enteredLine = false
                    enteredCol = false
                }

                if (hasZero || arrayRow[i] || arrayColumn[j]) {
                    matrix[i][j] = 0
                }

                if(!enteredCol && arrayColumn[j]) {
                    for(k in 0 until j) {
                        matrix[i][k] = 0
                    }

                    enteredCol = true
                }

                if(!enteredLine && arrayRow[i]) {
                    for(line in 0 until i) {
                        matrix[line][j] = 0
                    }

                    enteredLine = true
                }

                j += 1
            }

            hasZero = false
        }

        return matrix
    }
}
