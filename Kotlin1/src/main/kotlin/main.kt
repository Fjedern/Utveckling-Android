fun main(args: Array<String>) {
    //1
    var stringTest = "ananas"
    var intTest = 4
    var boolTest = false
    //2
    val notChangable = false
    //3
    var variagleWithName: String ="apa"
    //4
    var five = 5.0
    var ten = 10.0
    var answer = five / ten
    println(answer)
    //5
    println("Hello World! $intTest")

    //6
    val numberOne: Int = 5
    val numberTwo: Int = 10
    val biggestNumber = if(numberOne < numberTwo) "wow" else "no"
    println(biggestNumber)

    //7
    //val number1: Int? = null
    //print(number1);

    //10
    var anArray = arrayOf("this", "is", "a", "test")
    println(anArray.size)

    //11
    var anotherArray = mutableListOf(1, 2, 3, 4, 5, 6, 7)
    anotherArray.add(8)

    //12
    /*var counter = 0
    lateinit var longString: String
    while(counter < anotherArray.size){
        longString += anArray
        counter++
    }*/

    //13
    var tmp: Int = 0
    for(i in anotherArray){
        if(i > tmp) tmp = i
    }
    println("Största numret i listan är $tmp")

    //14
    var boolArray = mutableListOf(false, true, false, false, true, true, true)
    var trueCount: Int = 0
    var falseCount: Int = 0

    boolArray.forEach{ i ->
        if(i.equals(false)) {
            falseCount++
        } else {
            trueCount++
        }
    }
    println("Det finns $falseCount false och $trueCount true")

    //15
    anotherArray.forEach { println(it) }

    anotherArray.forEachIndexed { index, i ->
        anotherArray[(anotherArray.size - 1) - index] = i
    }
    //funkar inte
    println("detta är den vända listan: ")
    anotherArray.forEach { println(it) }

    //16


}