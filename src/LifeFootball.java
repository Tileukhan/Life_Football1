import java.util.Scanner;
public class LifeFootball {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello!Welcome to the 'LifeFootball'. Here you can find out the footbal kit to your taste and color. ");
        System.out.println("Hope you will find the dream kit.");
        System.out.println("Good luck!");
        System.out.println("Select a type of kit: ");
        System.out.println("1. EPL Kit");
        System.out.println("2. LaLiga Kit");
        System.out.println("3. Serie A Kit");
        System.out.println("4.National Team Kit");
        int kitChoice = scanner.nextInt();
        Product selectedKit = null;
        switch (kitChoice) {
                case 1:
                    selectedKit = new Kits("EPL", 9000);
                    break;
                case 2:
                    selectedKit = new Kits("LaLiga", 8000);
                    break;
                case 3:
                    selectedKit = new Kits("Serie A", 7000);
                    break;
            case 4:
                selectedKit = new Kits("National Team", 10000);
                break;
                default:
                    System.out.println("Invalid kit choice.");
            }

            if (selectedKit != null) {
                System.out.println("Select an option for the kit: ");
                System.out.println("1. Regular Kit");
                System.out.println("2. Retro Kit");
                System.out.println("3. Personalized Kit");
                int kitOptionChoice = scanner.nextInt();

                switch (kitOptionChoice) {
                    case 2:
                        selectedKit = new RetroKitDecorator(selectedKit);
                        break;
                    case 3:
                        selectedKit = new PersonalizedKitDecorator(selectedKit);
                        break;
                    default:
                        break;
                }

                System.out.println("Product: " + selectedKit.getDescription());
                System.out.println("Price: " + selectedKit.getPrice()+" kzt");
            }
    }
}