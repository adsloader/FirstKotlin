package mission

// 비교연산자를 통하여 숫자비교한다. 결과적으로
// 코드를 수행하는 순서가
// 8, 9, 13, 14, 15 라인이 된다.

fun main(args: Array<String>) {
    val n = 3
    if (n > 3) {
        println("3보다 큽니다")

    } else {
        println("0보다 크고 3보다 작습니다")
    }
}

// 미션 1:
// 코드를 수정하여 0보다 크고 3보다 작습니다
// 를 출력한다