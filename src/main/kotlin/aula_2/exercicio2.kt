package aula_2

fun main(){
    println("imprimindo numeros de 0 a 10:")
    printNumber1To10()

    negativeNumber()

    drawerUserInteraction()

}

fun printNumber1To10(){
    var n = 1
    do {
        println(n)
        n++
    } while (n <= 10)
}

fun negativeNumber(){
    var n: Int
    do {
        print("Digite um número: ")
        n = readlnOrNull()?.toIntOrNull() ?: 0
    } while (n >= 0)
}

fun drawerUserInteraction(){
    val numSorteado = (1..10).random()
    var num: Int
    println("-------Esse é um sorteador de numeros-------")
    do {
        print("Digite um número de 1 a 10: ")
        num = readlnOrNull()?.toIntOrNull() ?: 0
    } while (num != numSorteado)
    println("Você acertou o número sorteado!")
}
