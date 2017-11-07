package misson

fun main(args: Array<String>) {
    val i = 5
    val j = 3

    // 형변환은 변수의 크기를 바꾸는 연산자.
    // 모든 형이 변경가능한 것이 아니다.
    // 프로그래밍을 하다보면 어쩔 수 없이 먼저 선언된
    // 변수의 크기를 변경해서 값 처리를 해야 할 경우가
    // 자주 생긴다.
    // 18번 라인은 i와 j를 float형으로 바꾼 후, 연산했다.
    val f = i.toFloat() / j.toFloat()
    print(f)
}

// 힌트:
// 미션 1:
// 13번라인 val f = i.toFloat() / j.toFloat() 에서 f를 double로 바꾸고 실행해본다.
// 즉 val f를 val f: Double로 바꾸면 나머지는 어떻게 바꾸어야하는가?

