package operadores
data class Carro(val marca: String, val  modelo: String)
fun main() {
    val (a, b) = Carro("Ford", "Fusion")
    println("$a, $b")

    val (marido, mulher) = listOf("Joao", "Maria")
    println("$marido e $mulher")

    val (_,_,terceiroLugar) = listOf("Kimi", "Hamilton", "Alonso")
    println("$terceiroLugar terminou em terceiro lugar")
}