fun main(args:Array <String>) {
    println(" Hey there would you like to tell me your name (sorry i keep forgetting )" )
    var name = readLine()
    println(" hey " + name + " Enter your Current weight : ")
    var weight : Int = readLine()!!.toInt()
    println("Hey " + name + " I have information for the following planets: ")
    println("1)..Venus  2).. Mars   3)..Jupiter")
    println("4).. Saturn  5). Uranus  6).. Neptune")

    println(" which planet are visiting ?  ")
    var number : Int = readLine()!!.toInt()
    if(number == 1){
        var result = weight * 0.78
        println( " hey " + name + " your weight is going to be " + result + " in Venus")
    }else if(number == 2){
        var result = weight * 0.39
        println(" hey " + name + " Your weight is going to be " + result + " In Mar ")
    }else if( number == 3) {
        var result = weight * 2.65
        println(" hey " + name + " Your weight is going to be " + result + " In Jupiter ")
    }else if(number == 4){
        var result = weight * 1.17
        println(" hey " + name + " Your weight is going to be   " + result + "In Saturn")
    }else if(number == 5){
        var result = weight * 1.05
        println(" hey " + name + " your weight is goint to be " + result + " in Uranus")
    }else if(number == 6){
        var result = weight * 1.23
        println(" Hey " + name + " Your weihgt is going to be " + result + " in Neptune ")
    }else {
        println(" sorry " + name + " this is out of your option ")
    }

}