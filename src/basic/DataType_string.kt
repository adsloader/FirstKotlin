package basic

import java.util.*

/**
 * Created by snake on 17. 5. 21.
 */
fun main(args : Array<String>){

    var sName = "문자열 테스트입니다. ";

    // 1.문자열을 추가하는 것은 + 연산자로 가능함 <- Java와 동일
    println (sName + " : 문자열 붙이기");

    // 2. """ 이 안에 줄넘김 문자열이 들어갈 수 있다. """
    // Python에 이런 기능이 있다.
    var s줄넘김문자열 = """
    어떻게 출력 될지..
모르겠지만
    마치 HTML의 <pre>와 비슷할....
            듯
    """
    println(s줄넘김문자열);

    // 3. 문자열 내의 포멧팅 방법
    // linux의 bash와 비슷함.

    var s포멧문자열 = "sName의 값을 가져오는 것: $sName";
    println(s포멧문자열);

    // 4. linux bash와 비슷하니
    // ${}안에
    // 함수호출이나 수식처리도 가능함.
    var s포멧문자열2 = "sName의 값을 가져오는 것: ${sName + "움하하하" + java.util.Date()}"; // Java class도 가져욜 수 있음.
    println(s포멧문자열2);

}