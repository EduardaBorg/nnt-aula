package aula_3

fun main() {
    // Criando um Set com os números de 1 a 5
    val setNumerosDe1a5 = criarSetNumerosDe1a5()
    println("Set original: $setNumerosDe1a5")

    // Verificando se um elemento existe no Set
    print("Digite um elemento para verificar se está presente no Set: ")
    val elementoParaVerificar = readlnOrNull()?.toIntOrNull()
    if (elementoParaVerificar != null) {
        val elementoExiste = verificarElementoNoSet(setNumerosDe1a5, elementoParaVerificar)
        if (elementoExiste) {
            println("O elemento $elementoParaVerificar existe no Set.")
        } else {
            println("O elemento $elementoParaVerificar não existe no Set.")
        }
    } else {
        println("Valor inválido para elemento.")
    }

    // Removendo um elemento do Set
    print("Digite um elemento para remover do Set: ")
    val elementoParaRemover = readlnOrNull()?.toIntOrNull()
    if (elementoParaRemover != null) {
        removerElementoDoSet(setNumerosDe1a5.toMutableSet(), elementoParaRemover)
        println("Set com o elemento $elementoParaRemover removido: $setNumerosDe1a5")
    } else {
        println("Valor inválido para elemento.")
    }
}

fun criarSetNumerosDe1a5(): Set<Int> {
    return setOf(1, 2, 3, 4, 5)
}

fun verificarElementoNoSet(set: Set<Any>, elemento: Any): Boolean {
    return set.contains(elemento)
}

fun removerElementoDoSet(set: MutableSet<Any>, elemento: Any) {
    set.remove(elemento)
}