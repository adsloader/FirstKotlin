package mission

fun main(args : Array<String>){
    // list. 데이터형을 마구 섞어도 된다.
    var 리스트 = listOf(1, "헉", 3.00f, true);
    for (i in 1 .. 리스트.size - 1){
        println ( 리스트.get(i).toString() ) ;
    }

    // 수정가능 - List. 데이터형을 미리 정해야 하는 듯.
    var 수정가능리스트 = mutableListOf<String>();

    // add 메소드로 추가
    수정가능리스트.add("나는야");
    수정가능리스트.add("이박사");

    for(s in 수정가능리스트){
        println(s)
    }


    // Map: java보다 불편한 듯.
    var 맵 = hashMapOf("고양이" to 1, "강아지" to 2);
    //맵.remove( "고양이" )
    //맵["고양이"] = 3
    println(맵);

}

// 미션 1: 리스트 변수를 출력하는 곳에 논리적 버그가 있다 수정한다.
// 미션 2: 수정가능리스트에서 이박사를 삭제한다.
// 미션 3: 맵에서 강아지를 삭제하고 고등어를 3으로 지정하고 맵에 추가한다.