package mission

fun main(args : Array<String>){

    println("문자를 입력하세요:")
    var a : String?  = readLine()
    var nCount = a!!.indexOf("abc", 0, false)

    println ("입력하신 내용 중, $nCount 번째에 abc 문자가 들어있습니다.")

}
// 미션 1: 찾는 문자가 없으면 "못찾았습니다"로 출력할 것.

// 미션 2: a!!는 도대체 무엇을 뜻하는가? 6번 라인다음에 엔터입력후, 다음라인에
//  a = null
// 를 넣고 실행해본다. 그리고 ...
// 에러핸들링이 무엇인지 찾아본다.

// 미션 3: 미션2와 똑같이하고 a!!.indexOf를 a?.indexOf로 바꾸어본다.
// 미션2와 차이점이 무엇인지 설명한다.

// 미션 4: 미션2와 똑같이하고 a!!.indexOf를 a.indexOf로 바꾸어본다.
// 어떻게하면 에러를 없에고 컴파일이 가능할 수 있을까?
// 힌트 4: 변수명뒤에 !!, ?를 처리하는 것은 null처리 관련된 것이다.
// 변수를 사용하기 전에 null인지 채크를 하는 코드가 있으면 컴파일에러가 나지 않는다.
