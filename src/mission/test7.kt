package mission

fun main (args : Array<String>){

    // 반복문 for: in과 (시작..끝)으로 반복가능
    for (i in (0..10)  ){
        println ("i -> " + i);
    }

    // 반복문 while: while(조건){}
    var i : Int = 0;
    while(i < 10){ i++; println ("$i 입니다."); }

}

// 미션 1: 6~8 코드 중 한군데를 고쳐 0부터 20까지 출력
// 미션 2: 12번 라인을 수정하여 짝수만 출력
