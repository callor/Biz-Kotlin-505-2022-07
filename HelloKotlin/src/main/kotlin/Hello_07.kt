
fun main() {

    // 정수형 배열 100개를 선언하고
    // 1 부터 1씩 증가하면서 배열 요소 채우기
    val list = IntArray(100,{i->i+1})
    // each 반복문
    // list 의 전체 요소를 반복하면서 각 요소를
    // item 변수에 담아 내부로 전달
    // item 변수 값을 console 에 출력
    list.map{ item->println(item) }

    // list 의 요소개수만큼 반복하면서
    // 각 요소가 %2 연산결과가 0 인 요소들만 간추려서
    // list 다시만든다음 map 에게 전달
    // map 은 요소들을 console 출력
    list.filter{item->item % 2 == 0}
        .map{item->println(item)}

    // lambda(람다), 간소화된 코드드

    // key, Value 가 쌍으로 된 자료형형
   val map = mapOf(
        "홍" to "홍길동",
        "이" to "이몽룡",
        "성" to "성춘향",
        "임" to "임꺽정"
    )
    // 홍 key 에 해당하는 value 값 출력
    println(map["홍"])

    // 임 key 에 해당하는 value 값 출력력
   println(map["임"])

    // map 에 담긴 전체 데이터를 key, value 로 분해하여
    // 출력하기
   for((key,value) in map) {
       println("$key = $value")
   }



}