package aula_3

fun main() {
    println("Digite os dois números separados por espaço: ")
    val (a, b) = readlnOrNull()?.split(" ")?.map { it.toInt() } ?: listOf(0, 0)
    val result = somador(a, b)
    println("A soma de $a e $b é $result")

    println("Digite o número para verificar se é par: ")
    val num = readlnOrNull()?.toIntOrNull() ?: 0
    val ehPar = ehPar(num)
    println("O número $num é par? $ehPar")

    println("Digite a palavra para verificar se é palíndromo: ")
    val str = readlnOrNull() ?: ""
    val ehPalindromo = ehPalindromo(str)
    println("A string \"$str\" é um palíndromo? $ehPalindromo")

    println("Digite os valores numericos, separados por espaço: ")
    val array = readlnOrNull()?.split(" ")?.mapNotNull { it.toIntOrNull() }?.toIntArray() ?: intArrayOf()
    val maiorValor = encontrarMaiorValor(array)
    println("O maior valor presente no array é $maiorValor")

    println("Digite as palavras do array, separadas por espaço: ")
    val strArray = readlnOrNull()?.split(" ")?.toTypedArray() ?: arrayOf()
    val filtradas = filtrarStrings(strArray)
    println("As strings com mais de 5 caracteres são: $filtradas")
}

fun somador(a: Int, b: Int): Int {
    return a + b
}


fun ehPar(num: Int): String {
    return if (num % 2 == 0) "verdadeiro" else "falso"
}

fun ehPalindromo(str: String): String {
    val reversed = str.reversed()
    return if (str == reversed)  "verdadeiro" else "falso"
}

fun encontrarMaiorValor(array: IntArray): Int {
    var maiorValor = array[0]
    for (i in 1 until array.size) {
        if (array[i] > maiorValor) {
            maiorValor = array[i]
        }
    }
    return maiorValor
}

fun filtrarStrings(array: Array<String>): List<String> {
    return array.filter { it.length > 5 }
}


