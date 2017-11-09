package others
import java.util.Scanner

/**
 * Android와 App간의 이해를 위해서 간단히 만든 코드임.
 * Framework이 엄청고생하기에
 * App 개발쪽이 편하게 앱을 만들 수 있는 것임.
 */

/*************************************************************
 * * App 개발자는 신경쓸 필요없는 영역
 * */
// 시작함수
fun main(args: Array<String>) {
    val a = 안드로이드OS()
    a.runningAndroid()
}

// 안드로이드와  App 개발자간의 약속이 되는 클래스
interface App {
    fun OnCreate() {}
    fun OnClose() {}
}

// click handler용 함수형변수
var onClick  : ( () -> Unit ) = {}

// Android System을 아주간단히 흉내내기
class 안드로이드OS {

    // 문자로 이벤트를 받는다.
    private val event: String
        get() {
            val sc = Scanner(System.`in`)
            return sc.next()
        }

    fun runningAndroid() {

        // Interface 선언
        val app: App

        /**
         * 당신의 앱이 선택되었을 때...
         */
        app = YourApp()

        while (true) {
            ShowMessage("\n[c]는 create\n[e]는 close\n[b]는 button click\n[t]는 시스템종료\n한 문자 입력 후, 엔터!\n")
            val sMessage = event

            when (sMessage) {
                "c" ->
                    // 생성
                    app.OnCreate()

                "e" ->
                    // 종료
                    app.OnClose()

                "b" ->
                    // click
                    onClick()


                "t" ->
                    // 시스템을 종료
                    System.exit(0)

                else -> ShowMessage("알 수없는 메시지!!")
            }
        }
    }

    private fun ShowMessage(str: String) {
        println("Android System:" + str)
    }
}

// Android Activity 아주간단히 흉내내기
open class ActivityFake{
    // XML에서 가져온 변수라고 가정함.
    var text   : String      = ""
    var button : String      = ""

    fun String?.setText(sText : String){
        var s = this
        s     = sText
        var name = ActivityFake::class.toString()
        println( "$name: " + s)
    }

    fun String?.getText() : String? {
        var s = this
        return s
    }

    // callback을 함수를 저장한다.
    // kotlin에서는 이름없는 함수로 {}안의 코드 덩어리 주소가 넘어온다.
    fun String?.setOnClickListner( pFunc  : () -> Unit ){
        onClick = pFunc
    }
}

