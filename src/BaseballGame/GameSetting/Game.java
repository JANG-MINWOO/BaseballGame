package BaseballGame.GameSetting;

public class Game {
    public Game(int i) {
    }//기본생성자

    public boolean verification(int userInput) {//검증메서드
        Verification verification = new Verification(); //유효한 숫자입력했는지 확인 인스턴스 생성
        String verifymessege = verification.verifyNumber(userInput);
        boolean start = false;
        System.out.println(verifymessege);//여기까지 유효숫자 확인 끝}
        if (verifymessege.equals("유효한 숫자입니다.")) {
            start = true;
        }
        return start;
    }

}

