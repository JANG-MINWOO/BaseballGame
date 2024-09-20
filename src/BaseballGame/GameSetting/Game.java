package BaseballGame.GameSetting;
import BaseballGame.Check.Ball;
import BaseballGame.Check.Out;
import BaseballGame.Check.Strike;
import BaseballGame.InputOutput.RandomNum;
import BaseballGame.InputOutput.Result;
import java.util.Scanner;

public class Game {
    private Strike strike;
    private Ball ball;
    private Out out;
    private Result result;
    private Verification verification;
    private Scanner sc;
    private int[] randomNum;
    private History history;


    public Game(History history) {
        this.strike = new Strike();
        this.ball = new Ball();
        this.out = new Out();
        this.result = new Result();
        this.verification = new Verification();
        this.randomNum = RandomNum.generateAnswer();
        this.sc = new Scanner(System.in);
        this.history = history;
    }//생성자

    private int[] getUserInput() {
        int input = sc.nextInt();
        String str=""+input;//입력을 문자열로 전환
        int[] userInput = new int[str.length()];//userInput 배열을 str의 길이로 설정
        for(int i=0;i<str.length();i++){
            userInput[i]=str.charAt(i)-'0';
        }
        return userInput;
    } //여기까지 사용자의 입력을 string으로 변환하여 길이에 맞게 인덱스길이를 바꿔가며 대입

    private void displayResult(){
        System.out.println(result);
    }

    int gameNumber=0; //몇번째 게임인지 기록
    public void start() { //게임시작 메서드
        int attempts = 0; //시도횟수 초기화
        boolean gameWin = false;

        while (!gameWin) {
            System.out.print("3자리 수를 입력해 주세요: ");
            int[] userNum = getUserInput();
            attempts++;

            if (verification.isValid(userNum)) { //유저가 입력한 수가 유효한 숫자이면
                strike.checkStrike(randomNum,userNum); //Strike 에 정답랜덤수, 유저입력수 스트라이크수 비교후 카운트
                ball.checkBall(randomNum,userNum);
                out.checkOut(strike.getStrikeCount(), ball.getBallCount());
                result.updateResult(strike.getStrikeCount(), ball.getBallCount(), out.getOutCount());
                displayResult();
                if(strike.getStrikeCount()==3){
                    gameWin = true;
                    gameNumber++;
                    history.addGameHistory(attempts,gameNumber);
                    System.out.println(gameNumber+"번째 게임"+"정답입니다! "+attempts+" 번 시도하셨습니다.");
                }else{
                    System.out.println("틀렸습니다. 다시입력해 주세요");
                }
            }else System.out.println(verification.verifyNumber(userNum));
        }
    }
}

