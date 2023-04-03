package aula_1

class exercicio2 {
    fun main() {
        var x: Int = 10
        val y: Int = 5

        x = 20
        // y = 10 // tentativa de atribuir novo valor a uma constante (gera um erro de compilação)

        println("x = $x") 
        println("y = $y")

        /*A diferença fundamental entre variáveis e constantes é que uma variável pode ter seu valor alterado durante a
        execução do programa, enquanto uma constante mantém o mesmo valor durante toda a vida útil do programa. */
    }

}