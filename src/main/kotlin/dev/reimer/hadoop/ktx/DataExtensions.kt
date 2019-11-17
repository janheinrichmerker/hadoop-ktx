package dev.reimer.hadoop.ktx

import java.io.DataInput
import java.io.DataOutput
import java.io.IOException

@Throws(IOException::class)
fun DataInput.readUTFArray(): Array<String> {
    return Array(readInt()) {
        readUTF()
    }
}

@Throws(IOException::class)
fun DataInput.readIntArray(): IntArray {
    return IntArray(readInt()) {
        readInt()
    }
}

@Throws(IOException::class)
fun DataInput.readDoubleArray(): DoubleArray {
    return DoubleArray(readInt()) {
        readDouble()
    }
}

@Throws(IOException::class)
fun DataOutput.writeUTFArray(array: Array<String>) {
    writeInt(array.size)
    array.forEach {
        writeUTF(it)
    }
}

@Throws(IOException::class)
fun DataOutput.writeIntArray(array: IntArray) {
    writeInt(array.size)
    array.forEach {
        writeInt(it)
    }
}

@Throws(IOException::class)
fun DataOutput.writeDoubleArray(array: DoubleArray) {
    writeInt(array.size)
    array.forEach {
        writeDouble(it)
    }
}
