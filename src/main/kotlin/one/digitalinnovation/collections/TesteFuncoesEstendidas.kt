package one.digitalinnovation.collections

fun main() {

    val salarios = arrayOf(
        "2000".toBigDecimal(),
        "1500".toBigDecimal(),
        "4000".toBigDecimal()
    )



    println("\n -------------------- \n")

    println(salarios.somatoria())

    println("\n -------------------- \n")

    println(salarios.media())
}