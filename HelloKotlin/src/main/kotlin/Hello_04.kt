
// fun : Function 의 약자 함수를 선언하는 키워드
// java 에서는 method 를 Kotlin 에서는 함수로 지칭한다
//  2개의 정수형 매개변수를 갖고
//  결과를 정수로 return 하는 함수 선언
// JS 의 typeScript 문법과 매우 유사
fun sum(num1 : Int, num2:Int) : Int {
    var sum = num1 + num2
    return sum
}
/*
두개의 정수형 매개변수를 받고
두값의 마이너스 연산을 수행한 후 결과를 return

const response = await fetch()
const json = response.json()

const response = { return await fetch() }
const json = (response)=>( return reponse.json() }

 */
fun minus(num1:Int, num2 : Int) = num1 - num2

/*
두개의 정수값을 매개변수로 받아서
큰 수를 return
 */
fun max1(num1 : Int, num2 : Int) : Int {
    if(num1 > num2) return num1
    else return num2
}
fun max2(num1 : Int, num2 : Int)
    = if(num1 > num2) num1 else num2

/*
 변수선언은 어디에서나 가능
 실행하는 코드는 반드시 main() 내에서 작성
 */
fun main() {
    // type 을 강제지정하기
    var num1:Int = 0
    // 초기화되는 값에 따라 자동으로 type 이 지정
    var num2 = 0

    // var 로 선언된 변수는 값을 언제든지 할당, 변경할수 있다
    num1 = 100
    num2 = 200

    val num3 = 100
    // val 로 선언된 변수는 최초에 한번 값이 할당되면
    // 다시 값을 할당, 변경 할 수 없다
    // java 의 final, JS 의  const, C/C++ 의 const
   // num3 = 100;

    num1++
    ++num1
    
    // 기존의 num1 값에 10을 더하여 증가하기
    num1 += 10

    num1 = 100
    num2 = 200
    var sum = sum( num1, num2)
    println("$num1 + $num2 = $sum")
}

