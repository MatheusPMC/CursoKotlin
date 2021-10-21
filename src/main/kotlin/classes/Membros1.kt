package classes

class Data(var dia: Int, var mes: Int, var ano: Int) {
    fun formatar() : String {
        return "$dia/$mes/$ano"
    }
}

fun main() {
    var nascimento: Data = Data(7,6,1991)

    println("${nascimento.dia}/${nascimento.mes}/${nascimento.ano}")
    with(nascimento) { println("${dia}/${mes}/${ano}")}
    println(nascimento.formatar())
}