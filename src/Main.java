import BaseballGame.GameSetting.Game;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); //입력받을 스캐너 선언
        Game game = new Game();

        while (true) {
            System.out.print("3자리수 입력해주세요: ");
            boolean start=game.verification(sc.nextInt());
            if(start)
                break;
        }

    }
}