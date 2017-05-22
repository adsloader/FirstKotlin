package oop

/**
 * Created by snake on 17. 5. 22.
 */

fun main(args : Array<String>){
    var 오브젝트1 = 클래스1();
    var 오브젝트2 = 클래스1("파라메터 받음.");

    var 오브젝트3 = 선조클래스();
    println( 오브젝트3.getMyName() );

    var 오브젝트4 = 상속클래스();
    println( 오브젝트4.getMyName() );
}

// class 이름(변수명: 데이터형, ..){} 으로 생성자를 만들어쓰기도 한다.
class 클래스1{
    var name : String = "";

    // 기본 생성자
    constructor(){
        println("기본생성자");
    }
    // 오버로딩된 생성자
    constructor(name : String ){
        this.name = name;
        println("$name 을 입력받은 생성자");
    }
}

// kotlin에서는 기본적으로 상속이 거부되어 있다. 그래서 선조클래스를 open으로 지정해야 한다.
open class 선조클래스 {
    var name : String = this.toString();
    fun getMyName() : String = name;
}

//  상속받을 떄는 선조클래스를 "class 이름 : 선조클래스명(생성자인자){}" 형식으로 해야 한다.
class 상속클래스 : 선조클래스(){

}

