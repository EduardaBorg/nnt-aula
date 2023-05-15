package estudandoClasses

class Carro(val modelo: String, val marca: String, val ano: Int, val preco: Double) {
    override fun toString(): String {
        return "Carro: modelo= $modelo, marca= $marca, ano= $ano, preco= $preco"
    }
}

fun main() {
    val meuCarro = Carro("Fiesta", "Ford", 2022, 50000.0)

    println("Meu carro:")
    println(meuCarro)
}
