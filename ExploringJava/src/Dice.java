import java.util.Random;

public class Dice {
    private int numberOfSides;

    public Dice(int numberOfSides) {
        this.numberOfSides = numberOfSides;
    }

    public int roll() {
        Random random = new Random();
        int randomNumber;

        randomNumber = random.nextInt(numberOfSides) + 1;

        return randomNumber;
    }
}
