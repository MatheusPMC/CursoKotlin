package colecoes

fun main() {
    val numeros = arrayListOf(1,2,3,4,5)
    val strings = arrayListOf("Matheus", "Mury", "Prado", "Marques")
    val  uniao = numeros + strings // sobrecarga de operadores

    for (item in uniao) {
        println(item)
    }
}