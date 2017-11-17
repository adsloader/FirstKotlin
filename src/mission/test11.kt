package mission

/**
 * Created by snake on 17. 11. 17.
 */
fun main(args : Array<String>) {
    var 성적 = listOf<Int>   (100, 90, 30, 70, 80, 60)
    var 이름 = listOf<String>("박", "김", "성", "이", "문", "곽")

    for (i in 0 .. 성적.size - 1){
        var 시험성적 = 성적[i]
        var 학생이름 = 이름[i]

        if (시험성적 < 70) {
            println ("$학생이름 은 불합격입니다. $시험성적")

        } else {
            println ("$학생이름 은 합격입니다. $시험성적")

        }
    }

}

// 미션 1: 점수가 100인 사람은 "만점입니다. 축하합니다"로 출력할 것.
// 미션 2: 70이하 60이상은 "재시험 대상입니다"로 출력할 것
