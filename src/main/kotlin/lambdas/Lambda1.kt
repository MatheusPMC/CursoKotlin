package lambdas

fun main() {
    val soma = { x: Int, y: Int ->
        x + y
        //1 + 3 Retorna 4, ela retorna a ultima sentencia
    }
    println(soma(4,6))
}