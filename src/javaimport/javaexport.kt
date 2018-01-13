package javaimport

/**
 * Created by park on 2017-12-30.
 */

class JavaExport{
    companion object {
        // 반드시 const로 선언
        const val name = "class msg"

        @JvmField var age = 32
        @JvmStatic fun test(){
            println("나이는 $age 입니다.")
        }


    }

    // java에서는 메소드처럼 사용됨
    // @JvmField var normal_variable로 하면 java에서도 멤버변수처럼 사용가능
    var normal_variable = "밖에서 액세스가능"

    fun test2(){
        println("일반메소드")
    }
}

// Kotlin 일반함수와 변수
var name = "msg"
fun MyTest(){}