import java.util.Scanner;

public class TrainTicketBookingSystem {
    // initialize the available seats and the price per seat
    private static int availableSeats = 100;
    private static final int PRICE_PER_SEAT = 50;
    
    public static void main(String[] args) {
        // create a scanner to read input from the user
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            // display the available seats and prompt the user to enter the number of seats they want to book
            System.out.println("Available seats: " + availableSeats);
            System.out.print("Enter number of seats to book (0 to exit): ");
            int numSeats = scanner.nextInt();
            
            if (numSeats == 0) {
                // if the user enters 0, exit the program
                break;
            } else if (numSeats > availableSeats) {
                // if the user tries to book more seats than are available, display an error message and continue
                System.out.println("Error: Not enough seats available");
                continue;
            } else {
                // if there are enough seats available, book the seats and calculate the total cost
                availableSeats -= numSeats;
                int totalCost = numSeats * PRICE_PER_SEAT;
                
                // display a confirmation message with the number of seats booked and the total cost
                System.out.println("Successfully booked " + numSeats + " seat(s) for a total cost of $" + totalCost);
            }
        }
        
        // close the scanner
        scanner.close();
    }
}
