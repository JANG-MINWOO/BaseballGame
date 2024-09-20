package BaseballGame.GameSetting;

import java.util.Scanner;

public class Selection {
    private Game game;
    History history = new History(); //history 인스턴스 생성
    Scanner sc = new Scanner(System.in);

    public Selection() {
    this.game = new Game(history);
    }//생성자


    public void userSelect() { //이 메서드에서 유저 입력에 따라 다음 메서드가 정해짐
        System.out.println("환영합니다! 원하시는 번호를 입력해주세요");
        while (true) {
            System.out.println("1. 게임 시작하기 2. 게임 기록보기 3. 종료하기");
            int userSelection = sc.nextInt();
            if(userSelection == 1) {
                game.start();
            }else if(userSelection == 2) {
                if(history.getGameHistory().isEmpty()) {
                    System.out.println("저장된 기록이 없습니다");
                }else {
                    history.displayHistory();
                }
            }else if(userSelection == 3) {
                System.out.println("종료합니다");
                break;
            }else{
                System.out.println("1~3의 숫자에서 입력해주세요");
            }
        }
    }
}
