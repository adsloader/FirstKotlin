package basic

/**
 * Created by snake on 17. 5. 23.
 */
fun main(args : Array<String>){
    // java와 흡사하다.
    try{
        13 / 0;
    } catch(e: Exception){
        println(e);
    } finally {
        println("마지막 수행.")
    }
}