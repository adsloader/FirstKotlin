package oop

/**
 * Created by park on 2018-01-13.
 */

object 싱글톤 {
    var 메시지출력 = { msg : String -> println(msg) }
}

class 일반클래스{
    var msg: String = "일반객체로 생성하면 이 변수를 액세스 가능함"
    // companion object Factory {} 안에서 구현해야 static 가능
    companion object Factory {
        var 스태틱변수 = "스태틱변수";
        fun 이거스태틱임()= println("이거스태틱 함수임");
    }
}

abstract class fake클릭핸들러{
    var msg : String = "abstract 클래스입니다"
    abstract fun onClick()
}

// object 사용예
fun main(args: Array<String>) {

    // 1. 클래스 전체를 싱글톤으로 사용할 때, 마치 java의 static class
    //var 싱글톤변수 = 싱글톤()
    싱글톤.메시지출력("싱글톤입니다.!")

    val 객체 = 일반클래스()
    println(객체.msg)
    // 아래는 객체이므로 접근하지 못하는 에러코드임
    // 객체.스태틱변수

    // 2. 자바의 static method를 사용하듯...
    println( 일반클래스.스태틱변수 )
    일반클래스.이거스태틱임()

    // 3.이름없는 클래스 객체를 만들고 사용할 때...
    // 주로 상속받고 필요한 함수만 오버라이드
    var 객체2 = object : fake클릭핸들러(){
        fun 그냥만든함수() = "눌렀다"
        override fun onClick() {
            println(그냥만든함수())
        }
    }

    객체2.onClick()
}