package aula_4

fun main() {
    var opcao = -1
    do {
        println("""
            Escolha uma opção:
            1 - Calcular o fatorial de um número inteiro positivo
            2 - Calcular o enésimo termo da sequência de Fibonacci
            3 - Calcular o MDC (Máximo Divisor Comum) entre dois números inteiros positivos
            4 - Verificar se uma string é palíndromo
            5 - Calcular a soma dos elementos de um array de inteiros
            0 - Sair
        """.trimIndent())
        opcao = readlnOrNull()?.toIntOrNull() ?: continue
        when (opcao) {
            1 -> {
                println("Digite um número inteiro positivo: ")
                val n = readlnOrNull()?.toIntOrNull() ?: continue
                println("O fatorial de $n é ${fatorial(n)}")
            }
            2 -> {
                println("Digite um número inteiro positivo: ")
                val n = readlnOrNull()?.toIntOrNull() ?: continue
                println("O enésimo termo da sequência de Fibonacci para n=$n é ${fibonacci(n)}")
            }
            3 -> {
                println("Digite dois números inteiros positivos, separados por espaço: ")
                val nums = readlnOrNull()?.split(' ')?.mapNotNull { it.toIntOrNull() } ?: continue
                if (nums.size != 2) {
                    println("Por favor, digite exatamente dois números inteiros positivos!")
                    continue
                }
                println("O MDC de ${nums[0]} e ${nums[1]} é ${mdc(nums[0], nums[1])}")
            }
            4 -> {
                println("Digite uma string: ")
                val str = readlnOrNull()?.trim() ?: continue
                if (isPalindromo(str)) {
                    println("A string $str é palíndromo!")
                } else {
                    println("A string $str não é palíndromo.")
                }
            }
            5 -> {
                println("Digite os elementos do array separados por espaço: ")
                val array = readln().split(" ").mapNotNull { it.toIntOrNull() }.toIntArray()
                println("A soma dos elementos do array é ${somaArray(array)}")
            }
            0 -> println("Saindo...")
            else -> println("Opção inválida!")
        }
    } while (opcao != 0)
}

fun fatorial(n: Int): Int = if (n == 0) 1 else n * fatorial(n - 1)

fun fibonacci(n: Int): Int = if (n <= 1) n else fibonacci(n - 1) + fibonacci(n - 2)

fun mdc(a: Int, b: Int): Int = if (b == 0) a else mdc(b, a % b)

fun isPalindromo(str: String): Boolean = if (str.length <= 1) true
else str.first() == str.last() && isPalindromo(str.substring(1, str.length - 1))
fun somaArray(array: IntArray) = array.fold(0) { acc, i -> acc + i }


