package colecoes

fun main() {
    val alunos =arrayListOf("Matheus", "Mury","Prado","Marques")

    for(aluno in alunos) {
        println(aluno)
    }

    for ((indice, alunos)in alunos.withIndex()) {
        println("${indice + 1} - $alunos")
    }
}