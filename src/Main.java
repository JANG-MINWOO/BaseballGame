import BaseballGame.GameSetting.Game;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Game game = new Game();

        System.out.println("환영합니다! 원하시는 번호를 입력해주세요");
        System.out.println("1. 게임 시작하기 2. 게임 기록보기 3. 종료하기");
        int userSelection = sc.nextInt();
        if(userSelection == 1) {
            System.out.println("<게임을 시작합니다>");
            game.start();
        }else if(userSelection == 3) {
            System.out.println("종료합니다");
        }
    }
}