package aula_3

fun main() {
    // Criando uma lista com os números de 1 a 10
    val listaNumerosDe1a10 = criarListaNumerosDe1a10()
    println("Lista original: $listaNumerosDe1a10")

    // Adicionando um elemento na posição 2 da lista
    println("Digite um elemento para adicionar na posição 2 da lista:")
    val elementoParaAdicionar = readlnOrNull()?.toIntOrNull() ?: 0
    adicionarElementoNaPosicao2(listaNumerosDe1a10.toMutableList(), elementoParaAdicionar)
    println("Lista com elemento adicionado na posição 2: $listaNumerosDe1a10")

    // Removendo o último elemento da lista
    println("Deseja remover o último elemento da lista? (S/N)")
    val opcaoRemoverUltimo = readlnOrNull()?.uppercase() ?: "N"
    if (opcaoRemoverUltimo == "S") {
        removerUltimoElemento(listaNumerosDe1a10.toMutableList())
        println("Lista com último elemento removido: $listaNumerosDe1a10")
    } else {
        println("Operação cancelada. Lista não foi alterada.")
    }
}

fun criarListaNumerosDe1a10(): List<Int> {
    return (1..10).toList()
}

fun adicionarElementoNaPosicao2(lista: MutableList<Any>, elemento: Any) {
    lista.add(1, elemento)
}

fun removerUltimoElemento(lista: MutableList<Any>) {
    lista.removeLast()
}
