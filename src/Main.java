import BaseballGame.GameSetting.Game;
import BaseballGame.InputOutput.RandomNum;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); //입력받을 스캐너 선언
        Game game = new Game(sc.nextInt());

        while (true) {
            System.out.print("3자리수 입력해주세요: ");
            boolean start=game.verification(sc.nextInt());
            if(start){
                RandomNum.generateAnswer();//시작하면서 새로운 정답 생성
                break;
            }
        }
        while(true){
            System.out.print("3자리수 입력해주세요: ");
            boolean start=game.verification(sc.nextInt());
        }

    }
}