package aula_2

fun main(){
    println("imprimindo numeros de 1 a 10:")
    q1()

    println("imprimindo alfabeto:")
    q2()

    println("imprimindo numeros pares de 1 a 100:")
    q3()
}

fun q1(){
    val num = 1..10
    for (n in num) {
        println(n)
    }
}

fun q2(){
    val letras = 'a'..'z'
    for (l in letras) {
        println(l)
    }
}

fun q3(){
    val num = 1..100
    for (n in num) {
        if (n % 2 == 0) {
            println(n)
        }
    }
}