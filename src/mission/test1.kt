package misson

fun main(args: Array<String>) {
    var i = 0
    i++
    i++
    println(i.toString() + " i is ++")

    i--
    i--
    println(i.toString() + " i is --")

}

// 힌트: 연산자가 앞에 있나 뒤에 있나의 차이.
// 미션 1:
// 12번 라인에 System.out.println(++i);을 코딩하고 실행한다.
// 그 다음 라인에 System.out.println(i++);을 코딩하고 실행한다.
// 2개의 차이점을 설명한다.