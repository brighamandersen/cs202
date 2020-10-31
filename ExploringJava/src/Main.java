import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int numberOfDice;
        int numberOfSides;

        Scanner scanner = new Scanner(System.in);

        System.out.println("How many dice would you like to roll?");
        numberOfDice = scanner.nextInt();

        System.out.println("How many sides does each die have?");
        numberOfSides = scanner.nextInt();

        rollDice(numberOfDice, numberOfSides);
    }

    private static void rollDice(int numberOfDice, int numberOfSides) {
        int totalValue = 0;

        for (int i = 0; i < numberOfDice; i++) {
            Dice dice = new Dice(numberOfSides);
            int randomNumber = dice.roll();

            totalValue += randomNumber;

            System.out.print("Rolled a ");
            System.out.println(randomNumber);
        }
        System.out.print("Total Value: ");
        System.out.println(totalValue);
    }
}
