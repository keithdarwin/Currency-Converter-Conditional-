import java.util.Scanner;
import java.text.DecimalFormat;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.##");

        System.out.println("Welcome to Money Changer");
        System.out.println("----------------------------------------------------");
        System.out.println("Select which currency you would like to convert PHP into:");
        System.out.println("[1] US Dollar (USD) — Rate: 56.00 PHP per 1 USD ");
        System.out.println("[2] Euro (EUR) — Rate: 60.00 PHP per 1 EUR ");
        System.out.println("[3] Japanese Yen (JPY) — Rate: 0.38 PHP per 1 JPY ");
        System.out.println("----------------------------------------------------");

        System.out.print("Enter Currency: ");
        int choice = input.nextInt();

        if (choice == 1) {
            System.out.println("----------------------------------------------------");
            System.out.print("Enter Amount in PHP: ");
            double amt = input.nextDouble();
            double usd = (amt / 56.00);
            System.out.println("----------------------------------------------------");
            System.out.println("PHP to USD: " + df.format(usd));
        } 
        else if (choice == 2) {
            System.out.println("----------------------------------------------------");
            System.out.print("Enter Amount in PHP: ");
            double amt = input.nextDouble();
            double eur = (amt / 60.00);
            System.out.println("----------------------------------------------------");
            System.out.println("PHP to EUR: " + df.format(eur));
        } 
        else if (choice == 3) {
            System.out.println("----------------------------------------------------");
            System.out.print("Enter Amount in PHP: ");
            double amt = input.nextDouble();
            double jpy = (amt / 0.38);
            System.out.println("----------------------------------------------------");
            System.out.println("PHP to JPY: " + df.format(jpy));
        } 
        else {
            System.out.println("INVALID CHOICE!");
        }

        input.close(); // Good practice to close your scanner!
    }
}
