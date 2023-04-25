package exercicioAula

import kotlin.math.sqrt
import kotlin.math.pow

/* Grupo 7 - Segue o Bicho
* Eduarda Borges, Julia Giacomelli e Nathalia Macedo*/
fun main() {
    var opcao: Int
    var n1: Int
    var r: Double

    do {
        println("CALCULADORA")
        println("Selecione uma opção:")
        println("1. Soma")
        println("2. Subtração")
        println("3. Multiplicação")
        println("4. Divisão")
        println("5. Potência")
        println("6. Raiz")
        println("0. Sair")
        opcao = readln().toInt()

        when (opcao) {
            1 -> {
                val (n1, n2) = lerNumeros()
                r = somar(n1, n2)
                resultado(r)
            }
            2 -> {
                val (n1, n2) = lerNumeros()
                r = subtrair(n1, n2)
                resultado(r)
            }
            3 -> {
                val (n1, n2) = lerNumeros()
                r = multiplicar(n1, n2)
                resultado(r)
            }
            4 -> {
                val (n1, n2) = lerNumeros()
                r = dividir(n1, n2)
                resultado(r)
            }
            5 -> {
                val (n1, n2) = lerNumeros()
                r = potencia(n1.toDouble(), n2.toDouble())
                resultado(r)
            }
            6 -> {
                n1 = lerNumero()
                r = raiz(n1)
                resultado(r)
            }
            0 -> println("Saindo...")
            else -> println("Opção inválida!")
        }
    } while (opcao != 0)
}

fun lerNumero(): Int {
    println("Digite o número para a raiz: ")
    return readln().toInt()
}

fun lerNumeros(): Pair<Int, Int> {
    println("Digite os dois números separados por espaço: ")
    val (n1, n2) = readln().split(" ").map { it.toInt() }
    return Pair(n1, n2)
}

fun somar(num1: Int, num2: Int): Double {
    return (num1 + num2).toDouble()
}

fun subtrair(num1: Int, num2: Int): Double {
    return (num1 - num2).toDouble()
}

fun multiplicar(num1: Int, num2: Int): Double {
    return (num1 * num2).toDouble()
}

fun dividir(num1: Int, num2: Int): Double {
    return (num1.toDouble() / num2.toDouble())
}

fun potencia(num1: Double, num2: Double): Double {
    return num1.pow(num2)
}

fun raiz(num1: Int): Double {
    return sqrt(num1.toDouble())
}

fun resultado(r: Double) {
    println("O resultado é: $r")
}

