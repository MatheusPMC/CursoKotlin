package operadores

fun obterResultado (nota: Double) : String = if (nota >= 7.0) "Aprovado" else "Reprovou"
fun main() {
    println(obterResultado(8.0))
}