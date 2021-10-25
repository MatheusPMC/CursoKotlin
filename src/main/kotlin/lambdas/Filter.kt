package lambdas

data class Aluno(val nome: String, val nota: Double)

fun main() {
    val alunos = arrayListOf(
        Aluno("Matheus", 8.0),
        Aluno("Mury", 10.0),
        Aluno("Joao", 3.0),
        Aluno("Maria", 6.0),
    )

    val aprovador = alunos.filter { it.nota >= 6.0 }.sortedBy { it.nome }
    val aprovadorNota = alunos.filter { it.nota >= 6.0 }.sortedBy { -it.nota }

    println(aprovador)
    println(aprovadorNota)
}