package firstChapter

class ArrayList() {
    private val _defaultCapacity = 50
    private var currentCapacity = this._defaultCapacity
    var length = 0
    lateinit var arrayList: IntArray

    constructor(newCapacity: Int): this() {
        this.currentCapacity = newCapacity
        this.arrayList = IntArray(currentCapacity)
    }

    private fun initDefaultCapacity () {
        arrayList = IntArray(_defaultCapacity)
    }

    private fun resizeArray() {
        val newCapacity = currentCapacity * 2
        val auxArray = IntArray(newCapacity)

        for(i in 0 until currentCapacity) {
            auxArray[i] = arrayList[i]
        }

        arrayList = auxArray.clone()
    }

    private fun ensureCapacity() {
        if(arrayList.isEmpty()) {
            arrayList = IntArray(currentCapacity)
        } else if (currentCapacity == length) {
            this.resizeArray()
        }
    }

    fun add(value: Int) {
        this.ensureCapacity()
        arrayList[length] = value
        length++
    }

    fun remove(index: Int): Int {
        return if(length == 0 || index > length || index < 0) {
            -1
        } else {

            for(i in index until length) {
                arrayList[i] = arrayList[i+1]
            }

            length--
            index
        }
    }

}