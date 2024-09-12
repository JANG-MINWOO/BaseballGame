package BaseballGame;

public class Verification { //입력받은 숫자 우선 검증
    //입력받은수가 3자리수인가?
    //입력받은수가 1~9만 들어있는가?
    //입력받은수가 중복은 없는가?
    public Verification() {} //일단 아무것도 없는 생성자

    public boolean findZero(int checkZero){
        String check=""+checkZero;//정수를 문자열로 바꾸고
        int check1=check.indexOf("0"); //문자열에 0이 있는지 찾고 있으면 0~2숫자를 대입, 없으면 -1대입
        if(check1==-1){
            return true;
        }else{
            return false;
        }
    }

    public boolean getSizeCheck(int checkSize) {
        return checkSize >= 100 && checkSize <= 999; //3자리수인지확인
    }//3자리수면 true 반환
}
