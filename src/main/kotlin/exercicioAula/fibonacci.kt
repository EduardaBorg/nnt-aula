package exercicioAula

fun main() {
    print("Digite o número de termos da sequência de Fibonacci que deseja calcular: ")
    val n = readLine()?.toIntOrNull()

    if (n != null) {
        val fib = fibonacci(n)
        println("O $n termo da sequência de Fibonacci é: $fib")
    } else {
        println("Entrada inválida.")
    }
}
fun fibonacci(n: Int): Int {
    if (n <= 1) {
        return n
    }
    return fibonacci(n - 1) + fibonacci(n - 2)
}