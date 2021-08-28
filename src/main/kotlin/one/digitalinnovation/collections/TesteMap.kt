package one.digitalinnovation.collections

fun main() {
    val pair: Pair<String, Double> = Pair("Ragnar", 2000.0)
    val map1 = mapOf(pair)

    map1.forEach {
            (k, v) -> println("Chave: $k - Valor: $v")
    }


    println("\n -------------------- \n")


    val map2 = mapOf(
        "Lagertha" to 2500.0,
        "Björn" to 4000.0
    )


    map2.forEach {
            (k, v) -> println("Chave: $k - Valor: $v")
    }

}