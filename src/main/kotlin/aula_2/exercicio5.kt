package aula_2

fun main(){
    println("imprimindo numeros de 1 a 10 exceto o 5:")
    except5()

    println("para sair do loop digite um numero negativo!!")
    noNegativeNumber()

    pairExcept4()

}

fun except5(){
    for (n in 0..10) {
        if (n == 5) {
            continue
        }
        println(n)
    }
}

fun noNegativeNumber(){
    while (true) {
        print("Digite um número: ")
        val n = readln().toInt()
        if (n < 0) {
            break
        }
    }
}

fun pairExcept4(){
    print("Digite um número inteiro positivo: ")
    val num = readln().toInt()
    for (i in 0..num) {
        if (i == 4) {
            continue
        }
        if (i % 2 == 0) {
            println(i)
        }
        if (i == num) {
            break
        }
    }
}