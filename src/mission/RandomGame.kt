package mission

/**
 * Created by snake on 17. 11. 6.
 */

import java.util.*

/**
 * Created by snake on 17. 11. 6.
 */

fun main (args : Array<String>){
    랜덤게임()
}

// IntelliJ에서 해보기
fun 랜덤게임(){
    val sc = Scanner(System.`in`)


    // 랜덤 숫자만들기
    // 구글링: java 랜덤함수
    val rnd = Random()
    val 숨긴번호 = rnd.nextInt(100)

    var num = -1
    do {
        println("숫자는?")
        num = sc.nextInt()

        if (num > 숨긴번호) {
            println(">>큽니다.")

        } else if (num < 숨긴번호) {
            println(">>적어요.")
        }

    } while (num != 숨긴번호)

    println("정답입니다.")
}