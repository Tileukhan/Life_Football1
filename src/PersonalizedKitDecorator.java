public class PersonalizedKitDecorator extends KitDecorator{
    public PersonalizedKitDecorator(Product product) {
        super(product);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " (Personalized Kit(Name+Number))";
    }

    @Override
    public double getPrice() {
        return super.getPrice() + 1000.0;
    }


}
