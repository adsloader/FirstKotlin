package advance

/**
 * Created by snake on 17. 5. 23.
 */

// 아직 람다식에 익숙하지 않다.
// 코딩을 짧게 해주는 인라인함수 정도로만 이해하고 사용한다.
fun main(args : Array<String> ){
    // 가장 심플한 람다식 표현
    var 그냥함수변수 = {a: Int, b: Int -> a + b};

    // 그냥함수변수는 그냥함수 : (Int, Int) -> Int 형으로 표현가능하다.
    // C/C++ 에서 함수형변수 정의하는 것과 유사하다.
    함수가인자라네( 그냥함수변수 );
}

// kotlin에서도 generic이 사용된다.
fun 함수가인자라네( func : (Int, Int) -> Int  ){
    func(10, 10).let { 결과값 ->  println("결과값은 $결과값 입니다") };
}

