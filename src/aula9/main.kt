
fun main() {
    /*
    Arrays are a collection of items that are stored in contiguous memory locations.
    */
    //array list product
    var arrayList = arrayOf("Arroz", "Feijão", "Açucar", "Leite", "Ovos", "Carne", "Manteiga", "Alface", "Tomate", "Cenoura", "Abacaxi", "Banana", "Abacate")
    //var listNumber = arrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20)
    
    //println(Arrays.toString(arrayList))
    //println(arrayList.size)

    var index = 0;

    //Estrutura de Repetição = While (enquanto)
    while(index <= 8){
        println(arrayList[index])
        index++
    }

    while(index <= arrayList.size - 1){
        println(arrayList[index])
        index++
    }

}