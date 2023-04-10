package aula_2

fun main(){
    qs1()
    qs2()
    qs3()
}

fun qs1() {
    val numeros = IntArray(10) { (0..100).random() }
    var maior = numeros[0]

    for (i in 1 until numeros.size) {
        if (numeros[i] > maior) {
            maior = numeros[i]
        }
    }

    println("O maior número é: $maior")
}

fun qs2() {
    val numeros = IntArray(10)
    var soma = 0.0

    for (i in 0 until numeros.size) {
        print("Digite o ${i + 1}º número: ")
        numeros[i] = readLine()!!.toInt()
        soma += numeros[i]
    }

    val media = soma / numeros.size

    println("A média dos números é: $media")
}

fun qs3() {
    val frutas = arrayOf("abacaxi", "banana", "caju", "damasco", "uva", "laranja", "ameixa", "acerola", "abacate", "goiaba")
    var frutasComA = ""

    for (fruta in frutas) {
        if (fruta.startsWith("a")) {
            frutasComA += "$fruta, "
        }
    }

    println("As frutas que começam com a letra A são: $frutasComA")
}
