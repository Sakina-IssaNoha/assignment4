fun main(){
   names()
    towns(arrayOf("dodoma","makerere","nairobi"))
numbers(arrayOf(32,17,4,213,78,43,90,31,3,73,11,158,62))
detail(arrayOf("Misky","Isa","Tanyasis"))
}

fun names(){
    var x = arrayOf("Sakina","Saint","Sam","Serah")
    println(x.contentToString())
}

fun towns(names: Array<String>){
    names.forEach { names ->
        println(names.capitalize())
    }
}

fun numbers(number:Array<Int>){
    var sum = number[5]+number[2]
    println(sum)

var num = number.indexOf(158)
    println(num)

    var sortedNumber =number.sortedArray()
    println(sortedNumber.contentToString())
}
fun detail(names:Array<String>):Array<String>{
var name= names
    println(name.contentToString())
    return names

}