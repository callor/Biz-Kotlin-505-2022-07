/*
다양한 type 의 return 을 수행하는 함수
 */
fun anyFun() : Any?{
    return null
}

fun main() {

    // 일반적으로 선언한 변수는 절대 null 값을 가질수 없다
    // null 을 저장하면 오류가 난다
    var str1:String = "Korea"
    // str1 = null

    // 변수에 ? 를 부착하면
    // 개발자가 null값 저장, 할당을 허락 하겟다는 의미
    // 이변수에 null 값이 저장되어서 문제를 일으키더라도
    // 개발자가 책임지겠다라는
    var str2 : String? = "Korea"
    str2 = null

    /*
    일반적인 변수는 초기화를 하면 고유한 type 의 데이터만
    저장할 수 있다
    Any type 을 지정하면
    여러가지 type 의 데이터를 저장 할수 있다
    java 의 Object 와 같은 type
     */
    var anyVar : Any = 0
    anyVar = "Korea"



}