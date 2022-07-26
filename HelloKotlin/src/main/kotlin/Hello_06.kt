fun cases(obj : Any) {
    when(obj) {
        1->println("숫자 1")
        "Korea" -> println("대한민국")
        is Long -> println("$obj 는 Long type")
        !is String -> println("$obj 는 String type 아님")
        else -> println("잘 모르겠는데요")
    }
}
fun main() {
    cases(1)
    cases(1L)
    cases("Korea")
    cases(true)
}