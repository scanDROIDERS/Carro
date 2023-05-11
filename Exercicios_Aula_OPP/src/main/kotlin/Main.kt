/*1 - Crie uma classe chamada *Carro* que tenha os seguintes atributos: modelo, marca, ano e preço.

2 - Crie um objeto chamado *meuCarro* a partir da classe Carro e defina os valores dos seus atributos:

3 - Qual é a diferença entre uma variável e um objeto em Kotlin?
    R: Uma variável é um dado no qual se armazena uma informação de forma unica e direta;
        ex: var Cidade = "Campinas"
    Um objeto é um modelo oriundo de uma classe, com variáveis que sáo denominadas 'Atributos'
    e funções 'Metodos' que o objeto pode ser exercer.
        ex: var Campinas = Cidade([NOME]'Campinas', [PIB] '60000000', [POPULACAO], '1280000') -> Atributos
            Campinas.rendaMedia() -> Metodos
            Campinas.outputInfos() -> Metodos
*/
fun main() {

    val meuCarro = Carro()

    println("Cadastre seu carro!")

    print("Modelo: ")
    meuCarro.modelo = readln()
    print("Marca: ")
    meuCarro.marca = readln()
    print("Ano: ")
    meuCarro.ano = readln().toInt()
    print("Preço: ")
    meuCarro.preco = readln().toFloat()

    meuCarro.mostraCarro()

    println("Carro ligado!")
    meuCarro.ligaDesliga()
    do {
        println("Quer dar uma volta? Sim - Nao")
        val opcao = readlnOrNull()
        when (opcao?.lowercase()) {
            "sim" -> {
                var acelerar = "a"
                while(acelerar == "a") {
                    meuCarro.acelerar()
                    println("Velocidade: ${meuCarro.velocidade}km/h")
                    println("Aperte [A] para acelerar e [F] para freiar")
                    acelerar = readln().lowercase()
                    if (acelerar == "f") break
                }
            }
            "nao" -> println("Saindo")
            else -> println("Opcao Invalida")
        }
    } while (opcao != "nao")
    meuCarro.ligaDesliga()
    println("Carro desligado!")
}