package aula_2

fun main() {
    println("Imprimindo todos os números de 1 a 10:")
    questao1()

    println("Imprimindo todos os números pares de 0 a 20:")
    questao2()

    println("Imprimindo todos os números ímpares de 10 a 0:")
    questao3()
}

fun questao1() {
    var num = 1
    while (num <= 10) {
        println(num)
        num++
    }
}

fun questao2() {
    var num = 0
    while (num <= 20) {
        println(num)
        num += 2
    }
}

fun questao3() {
    var num = 9
    while (num >= 1) {
        println(num)
        num -= 2
    }
}
