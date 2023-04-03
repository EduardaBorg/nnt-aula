package aula_1

class exercicio5 {
    fun questao1() {
        print("Digite o primeiro número: ")
        val num1 = readLine()?.toInt() ?: 0

        print("Digite o segundo número: ")
        val num2 = readLine()?.toInt() ?: 0

        val soma = num1 + num2
        println("A soma de $num1 e $num2 é igual a $soma")
    }

    fun questao2() {
        print("Digite um número: ")
        val num = readLine()?.toDouble() ?: 0.0

        val quadrado = num * num
        println("O quadrado de $num é igual a $quadrado")
    }

    fun questao3() {
        print("Qual é o seu nome? ")
        val nome = readLine()

        print("Qual é a sua idade? ")
        val idade = readLine()?.toInt() ?: 0

        println("Olá, $nome! Bem-vindo(a)! Você tem $idade anos.")
    }
}