import java.util.Scanner;

public class TimerStopwatch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to Timer/Stopwatch Program!");

        while (true) {
            System.out.println("\nSelect an option:");
            System.out.println("1. Timer");
            System.out.println("2. Stopwatch");
            System.out.println("3. Exit");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    timer();
                    break;
                case 2:
                    stopwatch();
                    break;
                case 3:
                    System.out.println("Exiting the program...");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice! Try again.");
                    break;
            }
        }
    }

    public static void timer() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("\nEnter the duration in seconds: ");
        int duration = scanner.nextInt();

        System.out.println("Timer started for " + duration + " seconds.");

        try {
            Thread.sleep(duration * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Timer expired!");
    }

    public static void stopwatch() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\nStopwatch started. Press enter to stop.");

        long startTime = System.currentTimeMillis();

        scanner.nextLine(); // Wait for user to press enter

        long endTime = System.currentTimeMillis();
        long elapsedTime = endTime - startTime;

        System.out.println("Stopwatch stopped. Elapsed time: " + elapsedTime / 1000.0 + " seconds.");
    }
}