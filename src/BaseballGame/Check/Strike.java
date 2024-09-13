package BaseballGame.Check;

import java.util.Set;

public class Strike {
    private int strikeCount;

    public void checkStrike(Set<Integer> answer, int[] userInput) {
        Integer[] answerArray = answer.toArray(new Integer[0]);
        strikeCount = 0;
        for(int i = 0; i < 3;i++){
            if(userInput[i] == answerArray[i]){ //인덱스 0부터 3까지 각각 비교
                strikeCount++; //같은게 있을때마다 strikeCount1증가
            }
        }
    }
    public int getStrikeCount() {
        return strikeCount;
    }
}
