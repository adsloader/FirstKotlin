package javaimport

import java.util.*

/**
 * Created by snake on 17. 5. 23.
 */
fun main(args : Array<String>){
    // 자바패키지 가져오기
    var obj : Scanner
    obj = Scanner(System.`in`)
    println("${Date().toString()}: 숫자를 입력하세요. ")
    var num = obj.nextInt()
    println("$num 입니다.")

    // 같은 패키지 내의 TestJava.java를 가져오기
    var 테스트자바 : TestJava
    테스트자바 = TestJava()
    println( 테스트자바.name )

}