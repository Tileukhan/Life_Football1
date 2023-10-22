public class BootAdapter implements Product {
    private Boot boot;

    public BootAdapter(Boot boot) {
        this.boot = boot;
    }

    @Override
    public String getDescription() {
        return "Football Boot - " + boot.getSoleType();
    }

    @Override
    public double getPrice() {
        return boot.getPrice();
    }


}
