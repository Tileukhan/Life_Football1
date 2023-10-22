public class RetroKitDecorator extends KitDecorator {
    public RetroKitDecorator(Product product) {
        super(product);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " (Retro Kit)";
    }

    @Override
    public double getPrice() {
        return super.getPrice() + 2000.0;
    }


}
