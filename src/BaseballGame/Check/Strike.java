package BaseballGame.Check;

import java.util.Set;

public class Strike {
    private int strikeCount;

    public void checkStrike(int[] answer, int[] userInput) {
        strikeCount = 0;
        for(int i = 0; i < answer.length;i++){
            if(userInput[i] == answer[i]){ //인덱스 0부터 3까지 각각 비교
                strikeCount++; //같은게 있을때마다 strikeCount1증가
            }
        }
    }
    public int getStrikeCount() {
        return strikeCount;
    }
}
