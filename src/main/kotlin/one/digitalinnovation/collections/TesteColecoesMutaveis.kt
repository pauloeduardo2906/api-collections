package one.digitalinnovation.collections

fun main() {
    val kyle = Funcionario("Kyle Ren", 3000.0, "CLT")
    val anakin = Funcionario("Anakin Skywalker", 7000.0, "PJ")
    val obiwan = Funcionario("Obi-Wan Kenobi", 1500.0, "PJ")


    println("\n --------- LIST --------- \n")


    val funcionarios = mutableListOf(kyle, obiwan)
    funcionarios.forEach {
        println(it)
    }

    println("\n -------------------- \n")

    funcionarios.add(anakin)
    funcionarios.forEach {
        println(it)
    }

    println("\n -------------------- \n")

    funcionarios.remove(obiwan)
    funcionarios.forEach {
        println(it)
    }

    println("\n --------- SET --------- \n")

    val funcionarioSet = mutableListOf(anakin)

    funcionarioSet.forEach {
        println(it)
    }

    println("\n -------------------- \n")

    funcionarioSet.add(kyle)
    funcionarioSet.add(obiwan)

    funcionarioSet.forEach {
        println(it)
    }

    println("\n -------------------- \n")

    funcionarioSet.remove(anakin)

    funcionarioSet.forEach {
        println(it)
    }

}