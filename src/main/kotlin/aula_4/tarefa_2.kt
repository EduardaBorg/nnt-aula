package aula_4

fun main() {
    println("Digite uma lista de números separados por vírgula:")
    val input = readlnOrNull()
    val lista = input?.split(",")?.mapNotNull { it.toIntOrNull() } ?: return

    val listaOrdenada = lista.sorted()
    println("Lista ordenada: $listaOrdenada")

    val listaTransformada = lista.map { it * 2 }
    println("Lista transformada: $listaTransformada")

    val maiorValor = lista.maxOrNull()
    println("Maior valor: $maiorValor")

    val soma = lista.reduce { acc, i -> acc + i }
    println("Soma: $soma")

    val resultadoSoma = soma(3, 5)
    println("Resultado da soma de 3 e 5: $resultadoSoma")

    println("Digite uma mensagem:")
    val mensagem = readLine() ?: return
    println("Digite o número de vezes que a mensagem deve ser impressa:")
    val n = readlnOrNull()?.toIntOrNull() ?: return
    imprimirMensagem(mensagem, n)
}

fun soma(a: Int, b: Int): Int = a + b

fun imprimirMensagem(mensagem: String, n: Int) {
    repeat(n) { println(mensagem) }
}
