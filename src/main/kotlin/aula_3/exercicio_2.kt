package aula_3

fun main() {
    // soma
    println("digite os valores a serem somados separados por espaço:")
    val numerosParaSomar = readlnOrNull()?.split(" ")?.mapNotNull { it.toIntOrNull() } ?: emptyList()
    val resultadoDaSoma = soma(*numerosParaSomar.toIntArray())
    println("Resultado da soma: $resultadoDaSoma")

    // filtrarMaioresQue
    println("Digite os números separados por espaço para o array:")
    val arrayParaFiltrar = readlnOrNull()?.split(" ")?.mapNotNull { it.toIntOrNull() }?.toIntArray() ?: intArrayOf()
    println("Digite o número para filtrar os elementos maiores:")
    val numeroParaFiltrar = readlnOrNull()?.toIntOrNull() ?: 0
    val resultadoDoFiltro = filtrarMaioresQue(arrayParaFiltrar, numeroParaFiltrar)
    println("Resultado do filtro: $resultadoDoFiltro")

    // transformar
    println("Digite os números separados por espaço para o array:")
    val arrayParaTransformar = readlnOrNull()?.split(" ")?.mapNotNull { it.toIntOrNull() }?.toIntArray() ?: intArrayOf()
    val resultadoDaTransformacao = transformar(arrayParaTransformar) { it * it }
    println("Resultado da transformação: $resultadoDaTransformacao")

    // filtrarPorCaractere
    println("Digite as palavras separadas por espaço para o array:")
    val arrayParaFiltrarPorCaractere = readlnOrNull()?.split(" ")?.toTypedArray() ?: arrayOf()
    println("Digite o caractere para filtrar as palavras que começam com ele:")
    val caractereParaFiltrar = readlnOrNull()?.firstOrNull() ?: ' '
    val resultadoDoFiltroPorCaractere = filtrarPorCaractere(arrayParaFiltrarPorCaractere, caractereParaFiltrar)
    println("Resultado do filtro por caractere: $resultadoDoFiltroPorCaractere")

    // filtrarPorMultiplos
    println("Digite os números separados por espaço para o array:")
    val arrayParaFiltrarPorMultiplos = readlnOrNull()?.split(" ")?.mapNotNull { it.toIntOrNull() }?.toIntArray() ?: intArrayOf()
    println("Digite o número para filtrar os múltiplos:")
    val numeroParaFiltrarMultiplos = readlnOrNull()?.toIntOrNull() ?: 1
    val resultadoDoFiltroPorMultiplos = filtrarPorMultiplos(arrayParaFiltrarPorMultiplos, numeroParaFiltrarMultiplos)
    println("Resultado do filtro por múltiplos: $resultadoDoFiltroPorMultiplos")
}

fun soma(vararg numeros: Int) = numeros.sum()

fun filtrarMaioresQue(array: IntArray, n: Int) = array.filter { it > n }

fun transformar(array: IntArray, funcao: (Int) -> Int) = array.map(funcao)

fun filtrarPorCaractere(array: Array<String>, caractere: Char) = array.filter { it.startsWith(caractere) }

fun filtrarPorMultiplos(array: IntArray, n: Int) = array.filterIndexed { index, _ -> (index + 1) % n == 0 }
