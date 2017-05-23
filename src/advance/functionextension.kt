package advance

import java.util.*

/**
 * Created by snake on 17. 5. 23.
 */
fun main(args : Array<String>){
    var 문자열 : String  = "일반 문자열";
    println ( 문자열.추가함수("추가함수") );

}

// 이미 만들어진 객체에 함수를 추가할 수 있다.
fun String?.추가함수(s : String ) : String{
    return "나는 $this 너는 $s";
}

