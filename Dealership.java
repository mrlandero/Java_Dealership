import java.util.Scanner;

public class Dealership {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("\nWelcome to the Java Dealership!");
        System.out.println(" - Select option 'a' to buy a car.");
        System.out.println(" - Select option 'b' to sell a car.");
        String option = scan.nextLine();
        switch (option) {
            case "a": 
                System.out.println("\nWhat is your budget?"); 
                int budget = scan.nextInt();
                if (budget >= 10000) {
                    System.out.println("\nGreat! A Nissan Altima is available.");
                    System.out.println("\nDo you have insurance? Type 'yes' or 'no'");
                    scan.nextLine();
                    String insurance = scan.nextLine();
                    System.out.println("\nDo you have a valid license? Type 'yes' or 'no'");
                    String license = scan.nextLine();
                    System.out.println("\nWhat is your credit score?");
                    int creditScore = scan.nextInt();
                    if (insurance.equals("yes") && license.equals("yes") && creditScore >= 660) {
                        System.out.println("\nSold! Pleasure doing business with you.");
                    } else {
                        System.out.println("\nWe're sorry! You don't qualify to buy this car.");
                    }
                } else {
                    System.out.println("\nWe don't sell cars under $10,000. Sorry!");
                }
                break;
            case "b": 
                System.out.println("\nWhat is the value of your car?");
                int value = scan.nextInt();
                System.out.println("\nWhat is your selling price?");
                int sellingPrice = scan.nextInt();
                if (value > sellingPrice && sellingPrice < 30000) {
                    System.out.println("\nWe will buy your car. Pleasure doing business with you.");
                } else {
                    System.out.println("\nSorry! We're not interested in buying your car.");
                }
                break;
            default: System.out.println("\nThat's an invalid option.");
        }
        scan.close();
    }
}
