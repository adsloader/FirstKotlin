package javaimport;

/**
 * Created by park on 2017-12-30.
 */
public class UsingKotlin {
    public static void main(String[] args) {

        // class가 아닌 변수와 함수는 자동으로 변환한다.
        // 파일명을 대소문자 변경 후, 뒤에 Kt를 붙인다.
        // 그리고 . 연산자 이후에 사용가능
        JavaexportKt.MyTest();
        JavaexportKt.getName();

        // 클래스명은 그대로 사용가능
        // 어노테이션으로 자바에서 사용할 것을 지정해주어야 함.
        System.out.println(JavaExport.name);
        JavaExport.age = 30;
        JavaExport.test();

        JavaExport je = new JavaExport();
        je.test2();

    }
}
