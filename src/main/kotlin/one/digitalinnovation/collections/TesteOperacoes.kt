package one.digitalinnovation.collections

fun main() {
    val salarios = doubleArrayOf(8000.0, 4500.0, 2300.0)

    for(salario in salarios){
        println(salario)
    }

    println("\n -------------------- \n")


    println("Maior Salario: ${salarios.maxOrNull()}")
    println("Menor Salario: ${salarios.minOrNull()}")
    println("Media Salarial: ${salarios.average()}")

    println("\n -------------------- \n")

    val salariosMaiorQue2500 = salarios.filter { it > 2500.0 }

    salariosMaiorQue2500.forEach {
        println(it)
    }

    println("\n -------------------- \n")


    println(salarios.count {it in 2000.0..5000.0})


    println("\n -------------------- \n")


    println(salarios.find {it == 4500.0})

    println(salarios.find {it == 5400.0})


    println("\n -------------------- \n")

    println(salarios.any {it == 4500.0})

    println(salarios.any {it == 1000.0})
}