/*
Kotlin 의 vo 클래스 생성하기
 */
data class StudentVO(
    var st_num : String,
    var st_name : String,
    var st_dept : String,
    var st_tel : String,
    var st_addr : String
)

fun main() {
    val student = StudentVO(
        "S001",
        "홍길동",
        "컴공과",
        "010-111-111",
        "서울 특별시"
    )

    println(student.toString())
    println("이름 : ${student.st_name}")
    student.st_name = "이몽룡"

    println(student.toString())

}