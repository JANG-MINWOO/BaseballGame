package BaseballGame.InputOutput;

import java.util.*;

public class RandomNum {
    static Random random = new Random();
    static Set<Integer> newAnswer = new LinkedHashSet<>();//랜덤숫자(중복안되게 생성)를 넣을 Set 컬렉션
    static int[] usingAnswer = new int[3];

    public static int[] generateAnswer() {
        while (true) {
            int ranNum = random.nextInt(9) + 1;//1 ~ 9 사이의 랜덤한 숫자 얻어내기
            newAnswer.add(ranNum);//얻어낸 숫자를 Set 에 저장하기
            if (newAnswer.size() == 3) {//만일 lottoSet 의 size 가 3 이면 반복문 탈출
                break;//Set 이라 똑같은게들어가면 사이즈 안늘어나고 다른거 3개가 들어가면 break;
            }
        }
        int index = 0;
        for(int i:newAnswer){
            usingAnswer[index++]=i;
        }
        return usingAnswer;
    }

    public static int[] getUsingAnswer() {
        return usingAnswer;
    }
}