package usingexample

/**
 * Created by home on 2017-06-01.
 */
fun main(args : Array<String>){
    ani{
        crying();
        eat();
    }
    ani2 {
        넘겨진숫자값 ->
        crying();
        eat();
        println(넘겨진숫자값)
    }

    ani2{ number ->  println(number)}
}


// closure 활용
// 넘겨질 객체 Animal.() 와 같이 확장함수를 파라메터로 넘긴다
fun ani(확장함수: Animal.() -> Unit) : Animal{
    var ani = Animal();

    // 확장함수가 실행되어야 한다.
    ani.확장함수();
    return ani;
}

// 넘겨질 객체 Animal.() 와 같이 확장함수를 파라메터로 넘긴다. 1개의 숫자를 넘긴다.
fun ani2(확장함수: Animal.(Int) -> Unit) : Animal{
    var ani = Animal();

    // 확장함수가 실행되어야 한다. 숫자를 넘겼다.
    ani.확장함수(3);
    return ani;
}

class Animal{
    fun crying() = println("$this>> 아흥");
    fun eat()    = println("$this>> 우걱우걱");
}