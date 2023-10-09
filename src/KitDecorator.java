public abstract class KitDecorator implements Product{
    private Product product;
    public KitDecorator(Product product)
    {
        this.product=product;
    }

    @Override
    public String getDescription() {
        return product.getDescription();
    }

    @Override
    public double getPrice() {
        return product.getPrice();
    }
}
