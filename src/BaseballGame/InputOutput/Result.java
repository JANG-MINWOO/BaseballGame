package BaseballGame.InputOutput;

import BaseballGame.Check.Strike;

import java.util.Set;

public class Result {
    //여기서 strike count, ball count, out count 모아서 한번에 보냄
    public void CountCheck(Set<Integer> answer, int userInput){
        Strike strike= new Strike();
        strike.checkStrike(answer,userInput);

    }




}
