package exercicioAula

fun mdc(a: Int, b: Int): Int {
    if (b == 0) {
        return a
    }
    return mdc(b, a % b)
}

fun main() {
    print("Digite o primeiro número inteiro positivo: ")
    val a = readLine()?.toIntOrNull()

    print("Digite o segundo número inteiro positivo: ")
    val b = readLine()?.toIntOrNull()

    if (a != null && b != null && a > 0 && b > 0) {
        val result = mdc(a, b)
        println("O MDC entre $a e $b é: $result")
    } else {
        println("Entrada inválida.")
    }
}
