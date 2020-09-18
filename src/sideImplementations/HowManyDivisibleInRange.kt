package sideImplementations

import kotlin.system.measureTimeMillis

class HowManyDivisibleInRange {

    companion object {

        fun solution(a: Int, b: Int, k: Int): Int {
            var manyDivisible = 0

            val time = measureTimeMillis {
                for (i in a until b + 1) {
                    if (i % k == 0) {
                        manyDivisible++
                    }
                }
            }

            if(b == 2000000000) {
                print("time: $time\n")
            }

            return manyDivisible
        }
    }
}
