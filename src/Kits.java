public class Kits implements Product{
    private String category;
    private double initialPrice;

    public Kits(String category, double initialPrice) {
        this.category=category;
        this.initialPrice=initialPrice;
    }
    @Override
    public String getDescription() {
        return category + " Kit";
    }

    @Override
    public double getPrice() {
        return initialPrice;
    }

}
