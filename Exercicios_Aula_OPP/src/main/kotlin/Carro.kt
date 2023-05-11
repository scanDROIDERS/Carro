class Carro {
    var modelo: String = ""
    var marca: String = ""
    var ano: Int = -1
    var preco: Float = -1f
    var velocidade: Int = 0
    var ligado: Boolean = false

    fun mostraCarro() {
        println("*-------------------------*")
        println("Modelo: $modelo")
        println("Marca: $marca")
        println("Ano: $ano")
        println("Preço: $preco")
        println("*-------------------------*")
    }

    fun ligaDesliga() {
        ligado = !ligado
        velocidade = 0
    }

    fun acelerar() {
        if(ligado)
            velocidade++
        else
            println("Ligue o carro antes de acelerar!")
    }
}