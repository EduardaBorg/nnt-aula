package aula_1

class exercicio4 {
    fun questãoa() {
        val x: Int = 10
        print("Insira um valor para y: ")
        val y: Int = readLine()?.toInt() ?: 0
        val soma: Int = x + y

        println("A soma de $x e $y é igual a $soma")
    }

    fun questaob() {
        val resultado: Boolean = 5 > 3 && 2 < 4
        println("O resultado é $resultado")
        //O resultado imprimido é 'true'
    }

    fun questaoc() {
        val resultado: Boolean = !(10 > 5 || 3 < 1)
        println("O resultado é $resultado")
        //O resultado imprimido é 'false'
    }


}