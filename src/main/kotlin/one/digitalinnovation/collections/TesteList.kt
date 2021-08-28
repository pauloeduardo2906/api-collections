package one.digitalinnovation.collections

fun main() {
    val kyle = Funcionario("Kyle Ren", 2000.0)
    val anakin = Funcionario("Anakin Skywalker", 5000.0)
    val obiwan = Funcionario("Obi-Wan Kenobi", 9000.0)

    val funcionarios = listOf(kyle, anakin, obiwan)

    funcionarios.forEach {
        println(it)
    }

    println(funcionarios.find {it.nome == "Kyle Ren"})
}

data class Funcionario(
    val nome: String,
    val salario: Double
){
    override fun toString(): String =
        """
            Nome:    $nome
            Salário: $salario
            -----------------
        """.trimIndent()

}