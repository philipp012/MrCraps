import java.util.Random;

class Dice {
    private Random random;

    Dice() {
        random = new Random();
    }

    int roll() {
        return (random.nextInt(5) + 1);
    }
}