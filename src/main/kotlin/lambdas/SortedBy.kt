package lambdas

fun main() {
    val nomes = arrayListOf("Matheus", "Mury", "Carmem", "Geny")
    val ordenados = nomes.sortedBy { it.reversed() }

    println(ordenados)
}