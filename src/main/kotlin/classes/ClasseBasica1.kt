package classes

class Client {
    var nome : String = ""
}

fun main() {
    val client = Client()
    client.nome = "Matheus"
    println("O cliente é ${client.nome}")
}