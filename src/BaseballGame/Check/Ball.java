package BaseballGame.Check;

import java.util.Set;

public class Ball {
    private int ballCount;

    public void checkBall(int[] answer,int[] userInput){
        ballCount=0;
        for(int i = 0; i<3;i++){ //i 가 0~2까지 돌때
            for(int j = 0; j<3;j++){ //j가 각각의 구간에서 0~2까지 도는데
                if(i!=j&& answer[i]==userInput[j]){ //i, j 의 인덱스가 같지않으면서 동시에 값이 같을때
                    ballCount++; //ball 카운트 증가
                }
            }
        }
    }
    public int getBallCount(){
        return ballCount;
    }
}
