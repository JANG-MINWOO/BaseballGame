package BaseballGame;

import java.util.HashSet;
import java.util.Set;

public class Verification { //입력받은 숫자 우선 검증
    //입력받은수가 3자리수인가? OKAY
    //입력받은수가 1~9만 들어있는가? OKAY
    //입력받은수가 중복은 없는가?
    public Verification() {

    } //일단 아무것도 없는 생성자

    public boolean findDuplication(int checkDupli){ //중복수 확인메서드
        Set<String> dupli = new HashSet<>(); //Set 컬렉션 선언
        String check=""+checkDupli;  //정수를 문자열로 전환, 이녀석의 인덱스는 0,1,2까지 있음(길이는 3)
        for(int i=0;i<check.length();i++){ //문자열 인덱스 0부터 2까지 한 인덱스씩 잘라서
            dupli.add(check.substring(i,i+1)); //Set 컬렉션에 넣음
        }
        if(dupli.size()==3){// 그렇게 넣은 컬렉션 크기가 3이면 중복없이 3자리가 들어갔다는 뜻
            return true;
        }else return false; //3이 아니면 중복되었다는 뜻이고 false return

    }

    public boolean sizeCheck(int checkSize) {
        return checkSize >= 100 && checkSize <= 999; //3자리수인지확인
    }//3자리수면 true 반환

    public boolean findZero(int checkZero){
        String check=""+checkZero;//정수를 문자열로 바꾸고
        int check1=check.indexOf("0"); //문자열에 0이 있는지 찾고 있으면 0~2숫자를 대입, 없으면 -1대입
        if(check1==-1){
            return true;
        }else{
            return false;
        }
    }

    public String verifyNumber(int number) {
        if (!sizeCheck(number)) {
            return "3자리 숫자가 아닙니다.";
        } else if (!findZero(number)) {
            return "숫자에 0이 포함되어 있습니다.";
        } else if (!findDuplication(number)) {
            return "중복된 숫자가 있습니다.";
        } else {
            return "유효한 숫자입니다. 게임을 시작합니다.";
        }
    }
}
