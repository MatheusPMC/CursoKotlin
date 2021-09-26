package fundamentos.controles

fun main() {
    val alunos = arrayListOf("Matheus", "Mury", "Carmem")
    for ((indice, aluno) in alunos.withIndex()) {
        println("${indice +1} - $aluno")
    }
}