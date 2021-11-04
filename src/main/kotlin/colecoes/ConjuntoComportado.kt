package colecoes

fun main() {
    val aprovados = hashSetOf("Matheus", "Mury", "Prado", "Marques")
    //aprovados.add(1)

    println("Sem ordem...")
    for (aprovado in aprovados) {
        aprovado.print()
    }

    val aprovadosNaOrdem1 = linkedSetOf("Matheus", "Mury", "Prado", "Marques")

    println("\nLinked...")
    for (aprovado in aprovadosNaOrdem1) {
        aprovado.print()
    }

    val aprovadosNaOrdem2 = sortedSetOf("Matheus", "Mury", "Prado", "Marques")

    println("\nSorted...")
    for (aprovado in aprovadosNaOrdem2) {
        aprovado.print()
    }

    // Ordem maluca...
    aprovados.sortedBy { it.substring(1) }.print()
}