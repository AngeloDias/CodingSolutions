package firstChapter

class ZeroCrusadeMatrix {

    fun crusade(matrix: Array<Array<Int>>): Array<Array<Int>> {
        val n = matrix.size
        var hasZero = false
        var zeroPreviousColumn = false
        var entered = false
        var zeroPreviousLine = false
        var gotLine = false

        for (i in 0 until n) {
            var j = 0

            while (j < n) {
                if(matrix[i][j] == 0) {
                    hasZero = true

                    if(j > 0 && !zeroPreviousColumn) {
                        zeroPreviousColumn = true
                    }

                    if(i > 0 && !zeroPreviousLine) {
                        zeroPreviousLine = true
                    }
                }

                if (hasZero) {
                    matrix[i][j] = 0
                }

                if(!entered && zeroPreviousColumn) {
                    for(k in 0 until j) {
                        matrix[i][k] = 0
                    }

                    entered = true
                }

                if(!gotLine && zeroPreviousLine) {
                    for(line in 0 until i) {
                        matrix[line][j] = 0
                    }

                    gotLine = true
                }

                j += 1
            }

            hasZero = false
            zeroPreviousColumn = false
        }

        return matrix
    }
}
