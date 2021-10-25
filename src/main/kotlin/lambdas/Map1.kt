package lambdas

fun main() {
    val alunos = arrayListOf("Matheus", "Mury", "Carmem", "Geny")
    alunos.map { it.toUpperCase() }.apply { println(this) }
}