package aula_1

class desafioSemanal {

    fun main() {
        println("Qual tipo de unidade você deseja converter? (temperatura, distância ou tempo)")
        val tipoUnidade = readlnOrNull()

        if (tipoUnidade == "temperatura") {
            println("Qual a unidade de origem? (Celsius ou Fahrenheit)")
            val unidadeOrigem = readlnOrNull()
            println("Qual a unidade de destino? (Celsius ou Fahrenheit)")
            val unidadeDestino = readlnOrNull()

            when {
                unidadeOrigem == "Celsius" && unidadeDestino == "Fahrenheit" -> {
                    println("Digite a temperatura em Celsius:")
                    val temperatura = readln().toDouble()
                    val resultado = (temperatura * 9 / 5) + 32
                    println("$temperatura graus Celsius equivalem a $resultado graus Fahrenheit.")
                }

                unidadeOrigem == "Fahrenheit" && unidadeDestino == "Celsius" -> {
                    println("Digite a temperatura em Fahrenheit:")
                    val temperatura = readln().toDouble()
                    val resultado = (temperatura - 32) * 5 / 9
                    println("$temperatura graus Fahrenheit equivalem a $resultado graus Celsius.")
                }

                else -> println("Unidades de origem e/ou destino inválidas.")
            }
        } else if (tipoUnidade == "distância") {
            println("Qual a unidade de origem? (metros ou quilômetros)")
            val unidadeOrigem = readlnOrNull()
            println("Qual a unidade de destino? (metros ou quilômetros)")
            val unidadeDestino = readLine()

            when {
                unidadeOrigem == "metros" && unidadeDestino == "quilômetros" -> {
                    println("Digite a distância em metros:")
                    val distancia = readln().toDouble()
                    val resultado = distancia / 1000
                    println("$distancia metros equivalem a $resultado quilômetros.")
                }

                unidadeOrigem == "quilômetros" && unidadeDestino == "metros" -> {
                    println("Digite a distância em quilômetros:")
                    val distancia = readln().toDouble()
                    val resultado = distancia * 1000
                    println("$distancia quilômetros equivalem a $resultado metros.")
                }

                else -> println("Unidades de origem e/ou destino inválidas.")
            }
        } else if (tipoUnidade == "tempo") {
            // perguntando as unidades de origem e destino
            println("Qual a unidade de origem? (horas ou minutos)")
            val unidadeOrigem = readlnOrNull()
            println("Qual a unidade de destino? (horas ou minutos)")
            val unidadeDestino = readLine()

            when {
                unidadeOrigem == "horas" && unidadeDestino == "minutos" -> {
                    println("Digite a quantidade de horas:")
                    val valorOrigem = readln().toDouble()
                    val minutos = valorOrigem * 60
                    println("$valorOrigem horas equivalem a $minutos minutos.")
                }

                unidadeOrigem == "minutos" && unidadeDestino == "horas" -> {
                    println("Digite a quantidade de minutos:")
                    val valorOrigem = readln().toDouble()
                    val horas = valorOrigem / 60
                    println("$valorOrigem minutos equivalem a $horas horas.")
                }

                else -> println("Unidades de origem e/ou destino inválidas.")
            }
        } else {
            println("Tipo de unidade inválido!")
        }
    }
}