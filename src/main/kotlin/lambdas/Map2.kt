package lambdas

class Produto(val nome: String, val preco: Double)

val materialEscolar = listOf(
    Produto("Fichario escolar", 21.90),
    Produto("Lapis de cor", 11.90),
    Produto("Borracha bicolor", 0.90),
    Produto("Apontador com deposito", 1.90),
)
fun main() {
    val totalizar = { total: Double, atual: Double -> total + atual }
    val precoTotal = materialEscolar.map { it.preco }.reduce(totalizar)

    println("O preço total é R$ $precoTotal")
    println("O preço médio é R$ ${precoTotal / materialEscolar.size}.")
}