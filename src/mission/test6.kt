package mission

fun main (args : Array <String> ){
    case문예제(null)
}

fun case문예제(obj : Any?) {

    when(obj){
        "aaaa"      -> {println ("문자:" + obj )}
        is Float    -> {println ("숫자:" +  obj)}
        in (0 .. 9) -> {println ("0-10까지 숫자")}
        else        -> {println ("???")}
    }
}

// 미션 1: case문예제()에 값을 넣어
// 문자:aaaa
// 를 출력한다.

// 미션 2: case문예제()에 값을 넣어
// 숫자:17.3
// 을 출력한다.

// 미션 3: case문예제()에 값을 넣어
// 0-10까지 숫자
// 를 출력한다.
