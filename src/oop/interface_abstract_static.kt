package oop

/**
 * Created by snake on 17. 5. 23.
 */
fun main(args : Array<String>){

    // 인터페이스
    인터페이스구현().반드시구현해야하는함수();
    var obj : 인터페이스;

    // 추상화
    // 아래 코드는 다음과 같이도 가능함
    // 추상화클래스구현().apply { 그냥함수();  상속받으면구현하세요(); }
    var 객체 = 추상화클래스구현();
    객체.그냥함수();
    객체.상속받으면구현하세요();

    // static
    println( 추상화클래스구현.스태틱변수);
    추상화클래스구현.이거스태틱임() ;
}

interface 인터페이스{
    fun 반드시구현해야하는함수();
}

class 인터페이스구현 : 인터페이스{
    override fun 반드시구현해야하는함수() = println ("구현했음");
}

abstract class 추상화클래스{
    fun 그냥함수() = println("그냥함수");
    abstract fun 상속받으면구현하세요();
}

class 추상화클래스구현 : 추상화클래스(){
    override fun 상속받으면구현하세요() = println("상속구현했음");

    // companion object Factory {} 안에서 구현해야 static 가능
    companion object Factory {
        var 스태틱변수 = "스태틱변수";
        fun 이거스태틱임()= println("이거스태틱 함수임");
    }
}


