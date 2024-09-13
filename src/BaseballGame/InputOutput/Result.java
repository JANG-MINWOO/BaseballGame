package BaseballGame.InputOutput;

public class Result {
    //여기서 strike count, ball count, out count 모아서 한번에 보냄
    private int strikeCount;
    private int ballCount;
    private int outCount;

    public void updateResult(int strikeCount, int ballCount, int outCount) {
        this.strikeCount = strikeCount;
        this.ballCount = ballCount;
        this.outCount = outCount;
    }

    @Override
    public String toString() {
        return strikeCount + "Strike(s)  " + ballCount + "Ball(s)  " + outCount+"Out(s)";
    }
}
