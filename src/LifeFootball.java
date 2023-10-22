import java.util.Scanner;
public class LifeFootball {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello! Welcome to 'LifeFootball'. Here you can find out the football kits,boots and balls to your taste and color.");
        System.out.println("Hope you will find the dream tool.");
        System.out.println("Good luck!");
        System.out.println("Select a type of product:");
        System.out.println("1. EPL Kit");
        System.out.println("2. LaLiga Kit");
        System.out.println("3. Serie A Kit");
        System.out.println("4. National Team Kit");
        System.out.println("5. Football Ball");
        System.out.println("6. Football Boot");

        int choice = scanner.nextInt();
        Product selectedProduct = null;

        switch (choice) {
            case 1:
                selectedProduct = new Kits("EPL", 9000);
                break;
            case 2:
                selectedProduct = new Kits("LaLiga", 8000);
                break;
            case 3:
                selectedProduct = new Kits("Serie A", 7000);
                break;
            case 4:
                selectedProduct = new Kits("National Team", 10000);
                break;
            case 5:
                System.out.println("You have chosen a Football Ball.");
                System.out.println("Select the pitch type for the ball:");
                System.out.println("1. Football");
                System.out.println("2. Futsal");
                int ballChoice = scanner.nextInt();

                String ballPitchType = (ballChoice == 1) ? "Football" : "Futsal";
                selectedProduct = new BallAdapter(new Ball(7000, ballPitchType));
                break;
            case 6:
                System.out.println("You have chosen a Football Boot.");
                System.out.println("Select the sole type for the boot:");
                System.out.println("1. With Spikes");
                System.out.println("2. Without Spikes");
                int bootChoice = scanner.nextInt();

                String bootSoleType = (bootChoice == 1) ? "With Spikes" : "Without Spikes";
                selectedProduct = new BootAdapter(new Boot(16000, bootSoleType));
                break;
            default:
                System.out.println("Invalid choice.");
        }

        if (selectedProduct != null) {
            int kitOptionChoice = -1;

            if (choice >= 1 && choice <= 4) {
                System.out.println("Select an option for the kit:");
                System.out.println("1. Regular Kit");
                System.out.println("2. Retro Kit");
                System.out.println("3. Personalized Kit");

                kitOptionChoice = scanner.nextInt();
            }

            switch (kitOptionChoice) {
                case 2:
                    selectedProduct = new RetroKitDecorator(selectedProduct);
                    break;
                case 3:
                    selectedProduct = new PersonalizedKitDecorator(selectedProduct);
                    break;
                default:
                    break;
            }

            System.out.println("Product: " + selectedProduct.getDescription());
            System.out.println("Price: " + selectedProduct.getPrice() + " kzt");

        }
    }
}