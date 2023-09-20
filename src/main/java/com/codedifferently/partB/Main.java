package com.codedifferently.partB;

import com.codedifferently.partB.exceptions.OverlappingReservationException;
import com.codedifferently.partB.exceptions.PaymentFailureException;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static final Scanner scanner = new Scanner(System.in);
    private static final List<Plane> planes = new ArrayList<>();

    public Main(){
        // Initializing planes
        planes.add(new Plane("Paris", "10:00 AM", 500.0, 10));
        planes.add(new Plane("London", "2:00 PM", 450.0, 8));
        planes.add(new Plane("New York", "4:00 PM", 600.0, 12));
    }

    public void run(){
        System.out.println("Welcome to Baron Air Reservation System!");

        while (true) {
            System.out.println("\nWould you like to make a reservation? (yes/no)");
            String choice = scanner.nextLine().trim().toLowerCase();
            if (!choice.equals("yes")) {
                System.out.println("Thank you for choosing Baron Air. Goodbye!");
                break;
            }

            displayAvailableFlights();
            Plane selectedPlane = selectFlight();

            if (selectedPlane == null) {
                System.out.println("Invalid choice. Returning to main menu.");
                continue;
            }
            purchaseSeat(selectedPlane);


        }

        scanner.close();
    }

    private void purchaseSeat(Plane selectedPlane){
        while (true) {
            try {
                System.out.print("Enter payment amount ($): ");
                Double payment = Double.parseDouble(scanner.nextLine());

                System.out.print("Select a seat number (0-" + (selectedPlane.getNumberOfSeats() - 1) + "): ");
                Integer seatRequest = Integer.parseInt(scanner.nextLine());

                selectedPlane.makeReservation(payment, seatRequest);
                System.out.println("Reservation successful for seat " + seatRequest);
                break;

            } catch (PaymentFailureException e) {
                System.out.println(e.getMessage());
                System.out.println("Please provide enough money for the reservation.");
            } catch (OverlappingReservationException e) {
                System.out.println(e.getMessage());
                System.out.println("Please choose a different seat.");
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid number.");
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Invalid seat number. Please choose between 0 and " + (selectedPlane.getNumberOfSeats() - 1));
            }
        }
    }
    private void displayAvailableFlights() {
        System.out.println("\nAvailable Flights:");
        for (int i = 0; i < planes.size(); i++) {
            Plane plane = planes.get(i);
            System.out.println((i + 1) + ". Destination: " + plane.getDestination() + " | Departure: " + plane.getDepartureTime());
        }
    }

    private Plane selectFlight() {
        System.out.print("\nSelect a flight by entering its number: ");
        try {
            int choice = Integer.parseInt(scanner.nextLine()) - 1; // Subtracting 1 to convert to 0-based index
            return planes.get(choice);
        } catch (NumberFormatException | IndexOutOfBoundsException e) {
            return null;
        }
    }

    public static void main(String[] args) {
        Main main = new Main();
        main.run();
    }

}
