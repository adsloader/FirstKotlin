package basic

/**
 * Created by snake on 17. 5. 21.
 */

// 개발자에게는 너무나 당연한 내용이지만,
// 처음 프로그래밍을 배우는 사람들은 반드시 실수하는 것.
// 변수를 인식하는 범위: Scope

// ** 변수를 사용하려면 이전(주로 이전 Line)에 선언되어 있어야 한다.   **
// 변수를 이해할 수 있는 경우...
// 1. {} 안에서 이전 Line에 선언되어 있다.
// 2. 전역변수(함수 밖{}의 변수)로 이전에 선언되어 있다.
// 3. 클래스 멤버필드로 선언되어 있다.


var gName : String = "전역처리"

fun main(args : Array<String>){
    println(gName);

    // {}안의 변수는 {} 밖에서 접근못함.
    if(true){
        var lName = "지역처리"
        println(lName)
        println(gName)
    }

    // 모르는 변수라 에러발생.
    //println(lName)
}

