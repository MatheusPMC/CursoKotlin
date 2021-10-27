package colecoes

data class Frutas ( var nome: String, var preco: Double)

fun main() {
    var frutas = arrayListOf(Frutas("Banana",1.50), Frutas("Morango",3.20, ), Frutas("Abacaxi",3.20))

    for (fruta in frutas) {
        println("${fruta.nome} - R$ ${fruta.preco}")
    }

    //size tamanho da lista
    //get pega o elemento pelo index
    //add adiciona o elemento pelo index
    //clone pra clonar

    println(frutas.contains(Frutas("Banana",1.50)))

    println(frutas.distinctBy { it.preco })

    frutas.add(Frutas("",1.0))
    println(frutas)
}