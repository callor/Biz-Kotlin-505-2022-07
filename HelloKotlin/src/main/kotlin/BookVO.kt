// data class 는 반드시 생성자에 한개 이상의 변수가 선언되어 있어야 한다
data class BookVO(var isb : String) {
    //  생성자가 아닌 곳에 선언된 일반 속성 변수
    var title : String = ""
    var publisher = ""
    var pubdate = ""
    var price = 0
}

/*
 default 값을 갖는 함수의 매개변수
 함수의 매개변수에 값을 미리 설정해 두면
 함수를 호출할때 해당하는 변수 값을 생략할 수 있따
 */
fun defaultValur(name:String, nation : String = "Korea") {
    println("$name 은 $nation 국가 사람입니다")
}



fun main() {
    defaultValur("홍길동")
    defaultValur("이몽룡","대한민국")
}
