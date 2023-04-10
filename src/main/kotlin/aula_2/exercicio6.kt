package aula_2

fun main(){
    amountOfCharacters()
    reverseSentence()
    justVowels()
}

fun amountOfCharacters(){
    print("Digite uma frase para saber seu tamanho: ")
    val frase = readLine()!!
    println("A frase digitada possui ${frase.length} caracteres.")
}

fun reverseSentence(){
    print("Digite uma frase para ver ela inversa: ")
    val frase = readLine()!!
    val tamanho = frase.length
    var fraseInversa = ""

    for (i in tamanho - 1 downTo 0) {
        fraseInversa += frase[i]
    }

    println("A frase digitada em ordem inversa é: $fraseInversa")
}

fun justVowels(){
    print("Digite uma frase para saber as vogais dela: ")
    val frase = readLine()!!.lowercase()
    val vogais = "aeiou"
    var vogaisFrase = ""

    for (letra in frase) {
        if (letra in vogais) {
            vogaisFrase += letra
        }
    }

    println("As vogais na frase digitada são: $vogaisFrase")
}