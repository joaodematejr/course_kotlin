
fun main() {
    /*
    when 
    */

    var options = 1
/*     when (options) {
        1 -> println("Suco de Laranja")
        2 -> println("Suco de Uva")
        3 -> println("Refrigerante")
        4 -> println("Salgado")
        5 -> println("Sorvete")
        else -> println("Opção inválida")
    } */

    var res = when (options) {
        1 -> "Suco de Laranja"
        2 -> "Suco de Uva"
        3 -> "Refrigerante"
        4 -> "Salgado"
        5 -> "Sorvete"
        else -> "Opção inválida"
    }
    println(res)
}