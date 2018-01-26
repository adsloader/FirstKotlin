package advance

/**
 * Created by snake on 17. 5. 23.
 */

// 람다를 기반으로 한 코딩 줄이기
// let(), apply(), run()

fun main(args : Array<String> ){

    // let()
    // 결과를 { -> } 안으로 넘긴다. 그 안에서 이미 선언한 변수처럼 사용한다.
    // ->를 삭제하면 기본변수인 it로 인식한다.
    숫자값리턴().let { 넘겨준값 -> println (넘겨준값) }
    숫자값리턴().let {  println ( it ) }

    // apply()
    // 파스칼의 with문과 유사함. [객체이름.뭐뭐머] 코딩하는 고생이 덜었음.
    var 나는객체 = 테스트클래스().apply { sName = "동작구 스눕독"; nAge = 39; }
    나는객체.나를말한다()

    // run()
    // 순서대로 실행. 결과가 적용됨. apply와 차이점은 모르겠음.
    // apply는 생성되는 경우에도 가능하고 run은 이미 생성된 것에만
    // 가능한다는 글을 읽었음.
    나는객체.run { sName = "동작구 에미넴"; 나이를한살더먹다(); }
    나는객체.나를말한다()

}

fun 숫자값리턴() = 10

class 테스트클래스{
    var sName   : String = ""
    var nAge    : Int    = 49
    fun 나를말한다() = println("이름은 \"$sName\"이고 나이는 $nAge 입니다. ")
    fun 나이를한살더먹다() = nAge++
}