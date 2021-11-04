package oo.encapsulamento

private val dentroDoArquivo = 1
//protected val protegidoNaoSuportadoAqui = 1
internal val dentroDoProjeto = 1
val publico = 1

private fun dentroDoArquivo() = 1
//protected fun protegidoNaoSuportadoAqui() = 1 -- só pode ser colocado dentro deu uma classe
internal fun dentroDoProjeto() = 1
fun publico() = 1

//ela só é aberto para ser herdada se ouver o open
open class Capsula {
    private val dentroDoObjeto = 1
    protected val vaiPorHeranca = 1
    internal val dentroDoProjeto = 1
    val publico = 1

    private fun dentroDoObjeto() = 1
    protected fun vaiPorHeranca() = 1
    internal fun dentroDoProjeto() = 1
    fun publico() = 1
}

class  capsulaFilha : Capsula() {
    fun verificarAcesso() {
        println(dentroDoProjeto())
//        println(Capsula().vaiPorHerança)
        println(vaiPorHeranca)
        println(dentroDoArquivo)
        println(publico)
    }
}

fun verificarAcesso () {
    println(Capsula().dentroDoProjeto())
//    println(Capsula().vaiPorHeranca())
    println(Capsula().dentroDoProjeto())
    println(Capsula().publico())
}