
fun main(args: Array<String>) {

    val PI = 3.14
    var idade = 30

    if (idade >= 18) {
        println("Maior de idade")
    } else {
        println("Menor de idade")
    }

    when (idade) {
        18 -> println("Tem 18 anos")
        30 -> println("Tem 30 anos")
        else -> println("Não sei a idade")
    }

    println("Ola Mundo" = ${idade})
}