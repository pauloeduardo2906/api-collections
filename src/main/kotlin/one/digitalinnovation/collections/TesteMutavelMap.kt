package one.digitalinnovation.collections

fun main() {
    val ragnar = Funcionario("Ragnar Lodbrok", 9000.0, "PJ")
    val lagertha = Funcionario("Lagertha", 2000.0, "CLT")
    val bjorn = Funcionario("Björn Lothbrok", 6000.0, "PJ")

    val repositorio = Repositorio<Funcionario>()

    repositorio.create(ragnar.nome, ragnar)
    repositorio.create(bjorn.nome, bjorn)
    repositorio.create(lagertha.nome, lagertha)

    println(repositorio.findById(ragnar.nome))
}