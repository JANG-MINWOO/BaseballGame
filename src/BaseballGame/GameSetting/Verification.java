package BaseballGame.GameSetting;

import java.util.HashSet;
import java.util.Set;

public class Verification { //입력받은 숫자 우선 검증
    //입력받은수가 3자리수인가? OKAY
    //입력받은수가 1~9만 들어있는가? OKAY
    //입력받은수가 중복은 없는가?
    public Verification() {
    } //일단 아무것도 없는 생성자

    public boolean findDuplication(int[] checkDupli) { //중복수 확인메서드
        Set<Integer> dupli = new HashSet<>(); //Set 컬렉션 선언
        for (int i = 0; i < checkDupli.length; i++) { //문자열 인덱스 0부터 2까지 한 인덱스씩 잘라서
            dupli.add(checkDupli[i]); //Set 컬렉션에 넣음
        }
        if (dupli.size() == 3) {// 그렇게 넣은 컬렉션 크기가 3이면 중복없이 3자리가 들어갔다는 뜻
            return true;
        } else return false; //3이 아니면 중복되었다는 뜻이고 false return

    }

    public boolean sizeCheck(int[] checkSize) {
        boolean flag;
        if (checkSize.length == 3) {
            flag = true;
        } else flag = false;//3자리수인지확인
        return flag;
    }
    //3자리수면 true 반환

    public boolean findZero(int[] checkZero) {
        boolean flag = false;
        StringBuilder stringBuilder = new StringBuilder();
        for(int i=0;i<checkZero.length;i++) {
            stringBuilder.append(checkZero[i]);
        }
        String str=stringBuilder.toString();
        for(String s: str.split("")) {
            if(s.equals("0")) {
                flag = false;
                break;
            }else flag=true;
        }
        return flag;
    }

    public String verifyNumber(int[] number) {
        if (!sizeCheck(number)) {
            return "3자리 숫자가 아닙니다.";
        } else if (!findZero(number)) {
            return "숫자에 0이 포함되어 있습니다.";
        } else if (!findDuplication(number)) {
            return "중복된 숫자가 있습니다.";
        } else {
            return "유효한 숫자입니다.";
        }
    }

    public boolean isValid(int[] userInput) {
        boolean flag = false;
        if (findDuplication(userInput) && sizeCheck(userInput) && findZero(userInput)) {
            flag = true;
        }
        return flag;
    }
}
