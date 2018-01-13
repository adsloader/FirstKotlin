package mission

import java.util.*
import kotlin.concurrent.scheduleAtFixedRate

fun main(args : Array<String> ){

    // 타이머생성
    val timer = Timer("Timer입니다.", true);

    var 카운트 = 0

    // 타이머 기간 정하기
    timer.scheduleAtFixedRate(1000, 1000) {
        카운트++
        println("카운트 -> ${카운트}")
    }

    // 종료하지 않고 대기하기위함
    readLine()


}
