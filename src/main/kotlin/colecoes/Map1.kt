package colecoes

fun main() {
    var map = HashMap<Long, String>()

    map.put(12312342344563, "Matheus")
    map.put(12312342341231, "Mury")
    map.put(12312342376576, "Prado")
    map.put(12312345436442, "Marques")

    for (par in map.entries) {
        println(par)
    }

    for (nome in map.values) {
        println(nome)
    }

    for (cpf in map.keys) {
        println(cpf)
    }

    for ((cpf, nome) in map) {
        println("$nome (CPF: $cpf)")
    }

    map.size.print()
    map.get(12312342341231)?.print()
    map[12312342341231]?.print()
    map.contains(12312342341231).print()
    map.remove(12312342341231)?.print()
    map.clear()
    map.isEmpty().print()
}