package aula_2

fun main(){
    println("Imprimindo todos os números de 1 a 10:")
    print1To10InFor()

    println("Imprimindo todos os números pares de 0 a 20:")
    printEvenNums0To20()

    println("Imprimindo todos os números ímpares de 10 a 0:")
    printOddNums10To0()
}

fun print1To10InFor(){
    for (num in 1..10) {
        println(num)
    }
}

fun printEvenNums0To20(){
    for (num in 0..20 step 2) {
        println(num)
    }
}

fun printOddNums10To0(){
    for (num in 9 downTo 1 step 2) {
        println(num)
    }
}