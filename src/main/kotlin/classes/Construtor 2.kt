package classes

class Filme2(val nome: String, val anoLancamento: Int, val genero: String)

fun main() {
    val filme = Filme2(
        "O Poderoso Chefão",
        1972,
        "Drama")

    println("${filme.nome} foi lançado em ${filme.anoLancamento}.")
}