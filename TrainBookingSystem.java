import java.util.Scanner;

public class TrainBookingSystem {
    static boolean[] seats = new boolean[10]; // 10 seats, all initially available

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;
        System.out.println("devops");
        System.out.println("Welcome to the Train Booking System!");

        do {
            System.out.println("\n1. View Available Seats");
            System.out.println("2. Book a Seat");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1 -> showSeats();
                case 2 -> bookSeat(scanner);
                case 3 -> System.out.println("Thank you for using the system. Goodbye!");
                default -> System.out.println("Invalid choice. Try again.");
            }

        } while (choice != 3);

        scanner.close();
    }

    static void showSeats() {
        System.out.println("\nSeat Status (0 = available, 1 = booked):");
        for (int i = 0; i < seats.length; i++) {
            System.out.print((i + 1) + "[" + (seats[i] ? "1" : "0") + "]  ");
        }
        System.out.println();
    }

    static void bookSeat(Scanner scanner) {
        System.out.print("Enter seat number to book (1-10): ");
        int seatNumber = scanner.nextInt();

        if (seatNumber < 1 || seatNumber > 10) {
            System.out.println("Invalid seat number.");
        } else if (seats[seatNumber - 1]) {
            System.out.println(" Seat already booked.");
        } else {
            seats[seatNumber - 1] = true;
            System.out.println("Seat" + seatNumber + " booked successfully!");
        }
    }
}
