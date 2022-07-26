fun Int.sum(num1 : Int)
= this + num1

fun String.sum(str : String)
    = this + str

fun main() {
    println(30.sum(10))
    println("대한".sum("민국"))
}