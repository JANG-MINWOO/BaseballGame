package BaseballGame.InputOutput;

import java.util.*;

public class RandomNum {
    static Random random = new Random();
    static Set<Integer> newAnswer = new LinkedHashSet<>();//랜덤숫자(중복안되게 생성)를 넣을 Set 컬렉션
    static int[] usingAnswer;

    public static int[] generateAnswer(int digits) {
        newAnswer.clear(); // 답안 초기화 하고 시작
        usingAnswer = new int[digits];

        while (true) {
            int ranNum = random.nextInt(9) + 1;//1 ~ 9 사이의 랜덤한 숫자 얻어내기
            newAnswer.add(ranNum);//얻어낸 숫자를 Set 에 저장하기
            if (newAnswer.size() == digits) {//만일 lottoSet 의 size 가 3 이면 반복문 탈출
                break;//Set 이라 똑같은게들어가면 사이즈 안늘어나고 다른거 3개가 들어가면 break;
            }
        }
        int index = 0;
        for(int i:newAnswer){
            usingAnswer[index++]=i;
        }
        //System.out.println(Arrays.toString(usingAnswer)); //테스트를 위해 랜덤숫자를 미리 보여주는 부분
        return usingAnswer;
    }

    public static int[] getUsingAnswer() {
        return usingAnswer;
    }
}