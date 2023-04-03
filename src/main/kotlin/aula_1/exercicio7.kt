package aula_1

import java.util.*

class exercicio7 {

    fun questa1() {
        print("Digite um número de 1 a 7: ")

        when(readLine()?.toInt()) {
            1 -> println("Domingo")
            2 -> println("Segunda-feira")
            3 -> println("Terça-feira")
            4 -> println("Quarta-feira")
            5 -> println("Quinta-feira")
            6 -> println("Sexta-feira")
            7 -> println("Sábado")
            else -> println("Número inválido")
        }
    }

    fun questa2() {
        print("Digite o nome do animal: ")

        when(readlnOrNull()) {
            "cachorro", "gato", "vaca", "boi" -> println("Mamífero")
            "pato", "pomba", "galinha", "águia" -> println("Ave")
            "cobra", "jacaré", "iguana", "tartaruga" -> println("Réptil")
            else -> println("Animal não identificado")
        }
    }

    fun questa3() {
        print("Digite uma letra: ")

        when(readlnOrNull()?.lowercase(Locale.getDefault())?.trim()) {
            "a", "e", "i", "o", "u" -> println("A letra é uma vogal")
            else -> println("A letra é uma consoante")
        }
    }

    fun questa4() {
        print("Digite um número de 1 a 12: ")

        when(readlnOrNull()?.toInt()) {
            1 -> println("Janeiro")
            2 -> println("Fevereiro")
            3 -> println("Março")
            4 -> println("Abril")
            5 -> println("Maio")
            6 -> println("Junho")
            7 -> println("Julho")
            8 -> println("Agosto")
            9 -> println("Setembro")
            10 -> println("Outubro")
            11 -> println("Novembro")
            12 -> println("Dezembro")
            else -> println("Número inválido")
        }
    }

}