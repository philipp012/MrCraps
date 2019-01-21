public class Craps {
    private Dice dice;

    Craps(Dice dice) {
        this.dice = dice;
    }

    public static void main(String[] args) {
        Dice myDice = new Dice();
        Craps myCraps = new Craps(myDice);
        if (myCraps.play()) {
            System.out.println("Gewonnen");
        } else {
            System.out.println("verloren");
        }
    }

    boolean play() {
        int sum;
        int oldSum;

        // first round
        sum = dice.roll();
        sum = sum + dice.roll();

        switch (sum) {
            case 7:
                return true;

            case 2:
            case 12:
                return false;

            default:
                break;
        }

        // second round
        oldSum = sum;
        sum = dice.roll();
        sum = sum + dice.roll();

        if (sum == oldSum) {
            return true;
        } else if (sum == 7) {
            return false;
        }

        return false;
    }
}