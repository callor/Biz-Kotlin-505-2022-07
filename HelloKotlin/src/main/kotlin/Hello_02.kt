var num1 = 100
var num2 = 200
fun main() {
    println("${num1 + num2}")

    var even = 0
    var odd = 0
    for(i in 0..100) {
        if(i % 2 == 0) {
            even++
        } else {
            odd++
        }
    }
    for(i in 0..100) {
        // if 문을 삼항연산자 처럼 사용하기
        even += if(i % 2 == 0) 1  else 0
        odd += if(i % 2 != 0) 1 else 0
    }
    var num3 = 0
    for(i in 0..100) {
        // 다중 if 을 대신하는 코드
        num3 = when(i % 3) {
            0-> 1
            1-> 2
            2-> 3
            else -> 0
        }
    }



}
