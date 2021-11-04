package colecoes

fun main() {
    val map = hashMapOf(1 to "Mat", 2 to "Mury", 3 to "Marques")

    for ((id, nome) in map) {
        println("$id) $nome")
    }
}