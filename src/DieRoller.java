import java.util.Random;
import java.util.Scanner;

public class DieRoller {
    public static void main(String[] args) {

        Random random = new Random();
        int roll = 1;
        boolean playAgain = true;
        Scanner scanner = new Scanner(System.in);

        while (playAgain) {
            boolean triple= false;

            System.out.print("roll\tdie1\tdie2\tdie3\tsum\n");

            System.out.println("--------------------------------------");

            for (roll = 1; !triple; roll++) {

                int die1 = random.nextInt(6) + 1;
                int die2 = random.nextInt(6) + 1;
                int die3 = random.nextInt(6) + 1;
                int sum = die1 + die2 + die3;

                System.out.printf("%-7d %-7d %-7d %-7d %-7d\n", roll, die1, die2, die3, sum);

                if (die1 == die2 && die2 == die3) {
                    triple = true;
                }
            }
            System.out.print("So you want to play again[Y/N]:");
            String answer = scanner.nextLine();

            if (answer.equals("N")) {
                playAgain = false;
            }
        }

        System.out.println("Have a nice day!");
        scanner.close();
    }
}
