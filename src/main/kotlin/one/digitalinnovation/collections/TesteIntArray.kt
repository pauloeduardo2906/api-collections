package one.digitalinnovation.collections

fun main() {
    val values = IntArray(5)

    values[0] = 20
    values[1] = 5
    values[2] = 80
    values[3] = 15
    values[4] = 9

    println("\n ---------- 1ª FORMA ---------- \n")

    for(valor in values){
        println(valor)
    }

    println("\n ---------- 2ª FORMA ---------- \n")

    values.forEach {
        println(it)
    }

    println("\n ---------- 3ª FORMA ---------- \n")

    values.forEach { i ->
        println(i)
    }

    println("\n ---------- 4ª FORMA ---------- \n")

    for(index in values.indices){
        println(values[index])
    }

    println("\n ---------- 5ª FORMA ---------- \n")

    values.sort()
    for(valor in values){
        println(valor)
    }
}