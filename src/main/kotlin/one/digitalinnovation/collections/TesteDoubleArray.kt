package one.digitalinnovation.collections

fun main() {
    val salarios = DoubleArray(3)
    salarios[0] = 1000.0
    salarios[1] = 6000.0
    salarios[2] = 3000.0

    println("\n ---------- 1ª FORMA ---------- \n")

    salarios.forEach {
        println("R$ "+String.format("%.2f", it))
    }

    println("\n ---------- 2ª FORMA ---------- \n")

    salarios.forEachIndexed { index, salario ->
        salarios[index] = salario * 1.1
    }

    salarios.forEach{
        println("R$ "+String.format("%.2f", it))
    }

    println("\n ---------- 3ª FORMA ---------- \n")

    val salarios2 = doubleArrayOf(2000.0, 1500.0, 6300.0)

    salarios2.sort()

    salarios2.forEach(){
        println("R$ "+String.format("%.2f", it))
    }
}