package classes

class Pessoa1(var nome: String)
class Pessoa2(val nome: String)
class Pessoa3(nomeInicial: String) {
    val nome: String = nomeInicial
}

fun main() {
    val p1 = Pessoa1("Matheus")
    p1.nome = "Mury"
    println(p1.nome)

    val p2 = Pessoa2("Matheus")
    //p2.nome = "Mury"
    println(p2.nome)

    val p3 = Pessoa3("Matheus")
    //p3.nomeInicial = "Mury"
    //p3.nome = "Mury"
    println(p3.nome)
}