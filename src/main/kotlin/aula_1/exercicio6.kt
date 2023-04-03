package aula_1

class exercicio6 {
    fun questao1(){

        print("Digite a primeira nota: ")
        val nota1 = readLine()?.toDouble() ?: 0.0

        print("Digite a segunda nota: ")
        val nota2 = readLine()?.toDouble() ?: 0.0

        val media = (nota1 + nota2) / 2

        if (media >= 7) {
            println("Aprovado")
        } else {
            println("Reprovado")
        }

    }

    fun questao2(){
        print("Digite um número inteiro: ")
        val num = readLine()?.toInt() ?: 0

        if (num % 2 == 0) {
            println("O número $num é par")
        } else {
            println("O número $num é ímpar")
        }
    }

    fun questao3(){
        print("Digite um número inteiro: ")
        val num = readLine()?.toInt() ?: 0

        if (num > 0) {
            println("O número $num é positivo")
        } else if (num < 0) {
            println("O número $num é negativo")
        } else {
            println("O número $num é zero")
        }
    }

    fun questao4(){
        print("Qual é a sua idade? ")
        val idade = readLine()?.toInt() ?: 0

        if (idade >= 18) {
            println("Você é maior de idade")
        } else {
            println("Você é menor de idade")
        }
    }
}