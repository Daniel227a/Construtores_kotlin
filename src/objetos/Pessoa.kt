    package objetos


    class Pessoa(var nome: String) {
        constructor(idade: Int, nome: String) :this(nome) {


        }
    }

    fun main() {
        var x: Pessoa = Pessoa(10, "Daniel")
        println(x.nome)

    }