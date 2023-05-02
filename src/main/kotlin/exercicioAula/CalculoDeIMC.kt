package exercicioAula

import kotlin.system.exitProcess

fun main() {
    while (true) {
        print("Digite o seu peso em kg (para sair do programa digite 0): ")
        val peso = readln().toDouble()

        if (peso == 0.0){
            break
        }

        print("Digite a sua altura em metros: ")
        val altura = readln().toDouble()

        val imc = CalcIMC(peso, altura)
        println("Seu IMC é: %.2f".format(imc))

        val status = Resposta(imc)
        println("Você está $status.")
    }
}

fun CalcIMC(peso: Double, altura: Double): Double{
    val imc = peso / (altura * altura)
    return imc
}

fun Resposta(imc: Double): String{

    val status: String = when {
        imc < 18.5 -> "abaixo do peso"
        imc < 25 -> "com peso normal"
        imc < 30 -> "com sobrepeso"
        imc < 35 -> "com obesidade grau 1"
        imc < 40 -> "com obesidade grau 2"
        else -> "com obesidade grau 3"
    }

    return status
}