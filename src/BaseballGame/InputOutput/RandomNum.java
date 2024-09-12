package BaseballGame.InputOutput;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;

public class RandomNum {
    static Random random = new Random();
    static Set<Integer> newAnswer = new HashSet<>();//랜덤숫자(중복안되게 생성)를 넣을 Set 컬렉션

    public static int Answer() {
        while (true) {
            int ranNum = random.nextInt(8) + 1;//1 ~ 9 사이의 랜덤한 숫자 얻어내기
            newAnswer.add(ranNum);//얻어낸 숫자를 Set 에 저장하기
            if (newAnswer.size() == 3) {//만일 lottoSet 의 size 가 3 이면 반복문 탈출
                break;//Set 이라 똑같은게들어가면 사이즈 안늘어나고 다른거 3개가 들어가면
            }//break;
        }
        Iterator<Integer> it=newAnswer.iterator();
        for(int i:newAnswer){
            System.out.println(i);
        }
        return 0;
    }
}
