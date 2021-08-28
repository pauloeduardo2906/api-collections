package one.digitalinnovation.collections

fun main() {
    val ragnar = Funcionario("Ragnar Lodbrok", 9000.0, "PJ")
    val lagertha = Funcionario("Lagertha", 2000.0, "CLT")
    val bjorn = Funcionario("Björn Lothbrok", 6000.0, "PJ")

    val funcionarios1 = setOf(ragnar, lagertha)
    val funcionarios2 = setOf(bjorn)

    val resultUnion = funcionarios1.union(funcionarios2)

    resultUnion.forEach {
        println(it)
    }

    println("\n -------------------- \n")

    val funcionarios3 = setOf(ragnar, lagertha, bjorn)
    val resultSubtract = funcionarios3.subtract(funcionarios2)

    resultSubtract.forEach {
        println(it)
    }

    println("\n -------------------- \n")

    val resultIntersect = funcionarios3.intersect(funcionarios2)

    resultIntersect.forEach {
        println(it)
    }

}