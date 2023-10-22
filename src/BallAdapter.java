public class BallAdapter implements Product {
    private Ball ball;

    public BallAdapter(Ball ball) {
        this.ball = ball;
    }

    @Override
    public String getDescription() {
        return "Football Ball - " + ball.getPitchType();
    }

    @Override
    public double getPrice() {
        return ball.getPrice();
    }


}
