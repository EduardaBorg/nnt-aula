package aula_3

fun main() {
    // Criando o Map de cores
    val mapCores = criarMapCores()
    println("Map de cores: $mapCores")

    // Verificando se um elemento existe no Map
    print("Digite uma cor para verificar se está no Map: ")
    val cor = readlnOrNull() ?: ""
    val existe = verificarElementoNoMap(mapCores, cor)
    if (existe) {
        println("$cor está no Map!")
    } else {
        println("$cor não está no Map.")
    }

    // Removendo um elemento específico do Map
    print("Digite uma cor para remover do Map: ")
    val corParaRemover = readlnOrNull() ?: ""
    removerElementoDoMap(mapCores.toMutableMap(), corParaRemover)
    println("Map de cores com a cor removida: $mapCores")
}

fun criarMapCores(): Map<String, String> {
    return mapOf(
        "vermelho" to "#FF0000",
        "verde" to "#00FF00",
        "azul" to "#0000FF",
        "amarelo" to "#FFFF00",
        "roxo" to "#800080"
    )
}

fun verificarElementoNoMap(map: Map<String, String>, elemento: String): Boolean {
    return map.containsKey(elemento)
}

fun removerElementoDoMap(map: MutableMap<String, String>, elemento: String) {
    map.remove(elemento)
}