package others

/*************************************************************
 * * App 개발자가 신경쓰면 되는 영역
 * */
class YourApp : App, ActivityFake() {
    override fun OnCreate() {
        button.setOnClickListner {
            text.setText("button을 눌렀습니다.")
        }
        text.setText("생성되었습니다")
    }

    override fun OnClose() {
        text.setText("종료되었습니다")
    }
}