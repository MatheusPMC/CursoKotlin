package funcoes

fun ordenar(vararg numeros: Int): IntArray {
    return numeros.sortedArray()
}

fun main() {
    for (n in ordenar(48, 5, 432, 42, 1, 4, 9, 93)) {
        println("$n ")
    }
}