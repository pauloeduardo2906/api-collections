package one.digitalinnovation.collections

fun main() {
    val kyle = Funcionario("Kyle Ren", 3000.0, "CLT")
    val anakin = Funcionario("Anakin Skywalker", 7000.0, "PJ")
    val obiwan = Funcionario("Obi-Wan Kenobi", 1500.0, "PJ")

    val funcionarios = listOf(kyle, anakin, obiwan)

    println("\n -------------------- \n")

    funcionarios.forEach {
        println(it)
    }

    println("\n -------------------- \n")

    println(funcionarios.find {it.nome == "Kyle Ren"})


    println("\n -------------------- \n")

    funcionarios
        .sortedBy { it.salario }
        .forEach { println(it) }


    println("\n -------------------- \n")

    funcionarios
        .groupBy { it.tipoContratacao }
        .forEach { println(it) }
}

data class Funcionario(
    val nome: String,
    val salario: Double,
    val tipoContratacao: String
){
    override fun toString(): String =
        """
            Nome:    $nome
            Salário: $salario
            
        """.trimIndent()

}