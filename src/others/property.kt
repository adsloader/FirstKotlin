package others

/**
 * Created by park on 2017-12-31.
 */
var 이름 : String = "박모씨"
    get(){
        if(field.length > 5) {
            field =  "외우기 힘듬"
        }
        return field
    }
    set(s : String ){
        println ("\"${s}\"이 입력됨.")
        field = s
    }

fun main(args : Array<String> ){
    이름 = "동작구 에미넴 #2"
    println (이름)
}
