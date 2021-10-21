package funcoes

// modifica a funcionalidade do List do kotlin, para pegar o segundo valor da list
fun <E> List<E>.secondOrNull(): E? = if (this.size >= 2) this.get(1) else null

fun main() {
    val list = listOf("João", "Maria", "Pedro")
    println(list.secondOrNull())
}