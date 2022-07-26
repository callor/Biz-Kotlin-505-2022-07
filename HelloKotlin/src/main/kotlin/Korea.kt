/*
public, private, protected 를 붙이지 않아도
기본값이 public
 */
class Korea {
    fun name() : String = "대한민국"
}

fun main() {
    // Korea 클래스 타입의 name 객체를 선언하고
    // Korea() 생성자를 호출하여 객체 생성하기
    val korea : Korea = Korea()
    println(korea.name())

    // 생성자 만 호출하여 객체 선언과 생성하기기
   var korea1 = Korea()
    println(korea1.name())
}