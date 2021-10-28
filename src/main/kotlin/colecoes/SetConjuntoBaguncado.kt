package colecoes

fun Any.print() = println(this)

fun main() {
    val conjunto = hashSetOf(3, 'a', "texto", true, 3.14)

    //conjunto.get(1)
    conjunto.add(3).print() //false, no set vc nao consegue repitir valor, apenas no list
    conjunto.add(10).print()

    conjunto.size.print()

    conjunto.remove("a").print() // false a está como caracterie
    conjunto.remove('a')

    conjunto.contains('a').print()
    conjunto.contains("texto").print()

    val nums = setOf(1, 2, 3) // somente leitura
    // nums.add(4)

    (conjunto + nums).print()
    (conjunto - nums).print()

    conjunto.intersect(nums).print() //não muda o conjunto
    conjunto.retainAll(nums) //muda o conjunto
    conjunto.print()

    conjunto.clear()
    conjunto.isEmpty().print()
}