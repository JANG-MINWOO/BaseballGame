import BaseballGame.GameSetting.Selection;

public class Main {
    public static void main(String[] args) {
        Selection selection = new Selection();//유저가 선택할 수 있는 인터페이스를 생성
        selection.userSelect(); //유저 선택 메서드 호출
    }
}