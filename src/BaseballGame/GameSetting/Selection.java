package BaseballGame.GameSetting;

import java.util.Scanner;

public class Selection {
    private Game game;
    History history = new History(); //history 인스턴스 생성
    Scanner sc = new Scanner(System.in);
    private int gameNumber=0;

    public Selection() {
    //this.game = new Game(history); //이제 게임은 유저가 1번을 선택할때 생성됨
    }//생성자


    public void userSelect() { //이 메서드에서 유저 입력에 따라 다음 메서드가 정해짐
        System.out.println("환영합니다! 원하시는 번호를 입력해주세요");
        int difficulty = 3; //기본은 난이도 3으로 설정
        while (true) {
            System.out.println("0. 난이도 선택 1. 게임 시작하기 2. 게임 기록보기 3. 종료하기");
            int userSelection = sc.nextInt();
            if(userSelection == 0) {
                System.out.println("난이도를 선택해 주세요(3,4,5 자리수)");
                difficulty=sc.nextInt();
                if(difficulty < 3||difficulty > 5) {
                    System.out.println("잘못된 난이도 입니다. 3,4,5 중에서 선택해주세요.");
                    difficulty=3; //기본난이도로 재설정
                }
                //난이도 설정후 게임 자동으로 시작
                game=new Game(history, difficulty); //매개변수로 난이도를 넣음
                game.setGameNumber(gameNumber++);
                game.start();
            }
            else if(userSelection == 1) {
                game=new Game(history, difficulty); //매개변수로 난이도를 넣음
                game.setGameNumber(gameNumber++);
                game.start();
            }else if(userSelection == 2) {
                if(history.getGameHistory().isEmpty()) {
                    System.out.println("저장된 기록이 없습니다");
                }else {
                    history.displayHistory();
                }
            }else if(userSelection == 3) {
                System.out.println("<숫자 야구 게임을 종료합니다>");
                break;
            }else{
                System.out.println("0~3의 숫자에서 입력해주세요");
            }
        }
    }
}
