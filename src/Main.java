import BaseballGame.InputOutput.RandomNum;
import BaseballGame.Verification;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); //입력받을 스캐너 선언
        Verification verification = new Verification(); //유효한 숫자입력했는지 확인 인스턴스 생성

        RandomNum answer = new RandomNum();
        answer.Answer();

        System.out.println("3자리수 입력해주세요: ");
        int userInput=sc.nextInt();

        System.out.println(verification.findZero(userInput));
        System.out.println(verification.getSizeCheck(userInput));

    }
}