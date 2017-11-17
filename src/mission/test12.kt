package mission

fun main(args : Array<String>){

    println("문자를 입력하세요:")
    var a : String?  = readLine()
    var nCount = a!!.indexOf("abc", 0, false)

    println ("입력하신 내용 중, $nCount 번째에 abc 문자가 들어있습니다.")

}
// 미션 1: 찾는 문자가 없으면 "못찾았습니다"로 출력할 것.
// 미션 2: a!!는 도대체 무엇을 뜻하는가? 6번 라인다음에
//  a = null
// 를 넣고 실행해본다. 그리고 ...
// 에러핸들링이란?
