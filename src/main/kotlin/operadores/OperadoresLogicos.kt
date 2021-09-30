package operadores

fun main() {
    val executouTrabalho1 = true
    val executouTrabalho2 = true

    val comprouSorvete = executouTrabalho1 || executouTrabalho2
    val comprouTv50 = executouTrabalho1 && executouTrabalho2
    val comprouTv32 = executouTrabalho1 xor executouTrabalho2

    println(comprouSorvete)
    println(comprouTv50)
    println(comprouTv32)

    // Operador Unário
    if (!comprouSorvete) {
        println("A saúde agradece")
    }
}