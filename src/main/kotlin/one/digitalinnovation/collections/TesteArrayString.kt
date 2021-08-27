package one.digitalinnovation.collections

fun main() {
    val nomes = Array<String>(3){""}
    nomes[0] = "Paulo"
    nomes[1] = "Eduardo"
    nomes[2] = "Cruz"

    println("\n ---------- 1ª FORMA ---------- \n")

    for (nome in nomes){
        println(nome)
    }

    println("\n ---------- 2ª FORMA ---------- \n")

    nomes.sort()
    nomes.forEach {
        println(it)
    }

    println("\n ---------- 3ª FORMA ---------- \n")

    val nomes2 = arrayOf("Anakin", "Luke", "Leia", "Obi-Wan")

    nomes2.sort()
    nomes2.forEach {
        println(it)
    }
}