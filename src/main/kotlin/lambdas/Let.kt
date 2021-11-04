package lambdas

fun main() {
    val listWithNull: List<String?> =listOf("A", null, "B", null, "C", null)

    for(item in listWithNull) {
        item?.let {
            println(it)
        }
    }
}