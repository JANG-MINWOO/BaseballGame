package BaseballGame.GameSetting;

import java.util.ArrayList;

public class History {

    ArrayList<String> gameHistory = new ArrayList<>();

    public History() {
    }//생성자

    public void addGameHistory(int attempts, int gameNumber) {
        String result =  gameNumber+"번째 게임: 시도 횟수 - "+attempts;
        gameHistory.add(result);
    }

    public ArrayList<String> getGameHistory() {
        return gameHistory;
    }

    public void displayHistory(){
        for(String record: gameHistory){
            System.out.println(record);
        }
    }
}
