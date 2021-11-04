package colecoes

fun main() {
    val listaMix = arrayListOf("Matheus", true, 30, 3.20, "p")

    for (item in listaMix) {
        if(item is String) {
            println(item.toUpperCase())
        } else {
            println(item)
        }
    }
}