package aula_2

data class Pessoa(val nome: String, val idade: Int)

fun main() {
    val pessoas = mutableListOf<Pessoa>()

    while (true) {
        println("\nDigite a opção desejada:")
        println("1 - Adicionar pessoa")
        println("2 - Exibir lista de pessoas")
        println("3 - Exibir média de idade")
        println("4 - Buscar pessoa")
        println("5 - Remover pessoa")
        println("6 - Sair")

        when (readlnOrNull()?.toIntOrNull()) {
            1 -> addPerson(pessoas)
            2 -> displayListPeople(pessoas)
            3 -> displayAverageAge(pessoas)
            4 -> searchPersonByName(pessoas)
            5 -> removePersonByName(pessoas)
            6 -> return
            else -> println("Opção inválida!")
        }
    }
}

fun addPerson(pessoas: MutableList<Pessoa>) {
    print("Digite o nome da pessoa: ")
    val nome = readlnOrNull() ?: return
    print("Digite a idade da pessoa: ")
    val idade = readlnOrNull()?.toIntOrNull() ?: return

    pessoas.add(Pessoa(nome, idade))
    println("Pessoa adicionada com sucesso!")
}

fun displayListPeople(pessoas: List<Pessoa>) {
    if (pessoas.isEmpty()) {
        println("Nenhuma pessoa adicionada.")
        return
    }

    println("\nLista de pessoas:")
    pessoas.forEach { println("${it.nome} - ${it.idade} anos") }
}

fun displayAverageAge(pessoas: List<Pessoa>) {
    if (pessoas.isEmpty()) {
        println("Nenhuma pessoa adicionada!")
        return
    }

    val mediaIdade = pessoas.map { it.idade }.average()
    println("Média de idade das pessoas: $mediaIdade anos")
}

fun searchPersonByName(pessoas: List<Pessoa>) {
    print("Digite o nome da pessoa que deseja buscar: ")
    val nome = readLine() ?: return

    val pessoaEncontrada = pessoas.find { it.nome.split(" ")[0].equals(nome, ignoreCase = true) }
    if (pessoaEncontrada == null) {
        println("Pessoa não encontrada.")
    } else {
        println("${pessoaEncontrada.nome} - ${pessoaEncontrada.idade} anos")
    }
}

fun removePersonByName(pessoas: MutableList<Pessoa>) {
    print("Digite o nome da pessoa que deseja remover: ")
    val nome = readlnOrNull() ?: return

    val pessoaRemovida = pessoas.removeAll { it.nome.split(" ")[0].equals(nome, ignoreCase = true) }
    if (pessoaRemovida) {
        println("Pessoa removida com sucesso!")
    } else {
        println("Pessoa não encontrada!")
    }
}
