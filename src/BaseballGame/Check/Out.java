package BaseballGame.Check;

public class Out { // 아웃 클래스는 3개의 카운트중에서 나머지 두개가 확인되면 이것도 정해짐
    private int outCount;

    public void checkOut(int strikeCount, int ballCount){
        outCount = 3 - (strikeCount + ballCount);
    }
    public int getOutCount(){
        return outCount;
    }
}
