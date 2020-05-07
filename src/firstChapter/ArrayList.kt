package firstChapter

class ArrayList() {
    private val _defaultCapacity = 50
    private var currentCapacity = this._defaultCapacity
    private var length = 0
    private var arrayList: IntArray

    init {
        this.arrayList = intArrayOf()
    }

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

    fun size(): Int {
        return length
    }

    fun isEmpty(): Boolean {
        return arrayList.isEmpty()
    }

    fun get(index: Int): Int {
        if(index in 0 until length) {
            return arrayList[index]
        }

        return -1
    }

    fun set(index: Int, elem: Int) {}

    // see section "Performance of ArrayList" in https://codenuclear.com/how-arraylist-works-internally-java/
    fun iterator() {
        // to implement a simple listing of the elements in list
        for(i in arrayList.indices) {
            print("Value ${i+1}: ${arrayList[i]}\n")
        }
    }

}