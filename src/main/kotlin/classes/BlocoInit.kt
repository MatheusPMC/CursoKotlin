package classes

class Filme3(
    nome: String,
    anoLancamento: Int,
    genero: String) {
    val nome: String
    val anoLancamento: Int
    val genero: String

    init {
        this.nome = nome
        this.anoLancamento = anoLancamento
        this.genero = genero
    }
}

fun main() {
    val filme = Filme3(
        "O Poderoso Chefão",
        1972,
        "Drama")

    println("${filme.nome} foi lançado em ${filme.anoLancamento}.")
}