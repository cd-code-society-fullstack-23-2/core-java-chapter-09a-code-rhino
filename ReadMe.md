## Part A - **Phone Number Styler at Code Differently** ☎️🎨📊

**Description**:  
Hello, Number Wizards! 🌟 Code Differently is back with a fresh challenge. Ever noticed how phone numbers are not just plain sequences of numbers? They're often styled for better readability. Your task is to make those sequences stylish! Convert an array of integer digits into a snazzy phone number format.

**Format**:  
`(XXX) XXX-XXXX`

*Hint*: Your number array will always have 10 digits.

## **Example 1**:

**Provided Array**: [1, 2, 3, 4, 5, 6, 7, 8, 9, 0]

**Styled Number**: (123) 456-7890

**Decoding the Array**:
```
[1, 2, 3] -> (123)
[4, 5, 6] -> 456
[7, 8, 9, 0] -> 7890
```
Piecing together the decoded arrays, we get the stylish phone number (123) 456-7890.

## **Submission**:
Once you've styled those numbers, don't forget to showcase your masterpiece on GitHub. Keep crafting at Code Differently and make every number count! 🌟🚀📞

# Part B - Pair Coding Lab Exercise:
## Exception Handling for "Baron Air" Reservation System

### Objective:
This pair coding exercise is designed to immerse students in the collaborative development process, where one student focuses on writing tests (Test Driver) and the other on writing the implementation (Implementer). The focus will be on the Baron Air reservation system, handling overlapping reservations and dealing with payment failures or invalid booking dates.

### Requirements:
- Java SDK
- IDE with unit testing capabilities (e.g., IntelliJ IDEA, Eclipse)
- Basic knowledge of Java programming, exception handling, and unit testing (JUnit)

### Scenario:
Baron Air operates domestic and international flights. The system should prevent passengers from booking a seat already reserved, confirm valid payment before confirming a seat, and prevent reservations for past dates or dates when a flight isn't available.

### Instructions:

**Setup**:
- Pair up into teams of two.
- Decide who will start as the Test Driver and who will be the Implementer.
- The Test Driver will write a test for a specific functionality, and the Implementer will then write the code to pass that test.

### Task 1: Overlapping Reservations

1. **Test Driver**: 
   - Write a test to simulate a reservation being made for a seat that is already booked. 
   - Your test should expect an `OverlappingReservationException`.

2. **Implementer**: 
   - Create the classes `Reservation` and `ReservationSystem`.
   - Write the `OverlappingReservationException` custom exception.
   - Implement the logic in the `ReservationSystem` to throw the exception if an overlapping reservation is detected.

3. **Switch roles** for the next task.

### Task 2: Payment Failures and Invalid Booking Dates

1. **Test Driver**:
   - Write a test simulating a failed payment during reservation. The test should expect a `PaymentFailureException`.
   - Write another test simulating a reservation attempt for an invalid date (past date or a day without flights). This test should expect an `InvalidBookingDateException`.

2. **Implementer**:
   - In the `Reservation` class, implement the fields `amountPaid` and `paymentStatus`.
   - Create the `Payment` class to simulate the payment process.
   - Implement the `PaymentFailureException` and `InvalidBookingDateException` custom exceptions.
   - Develop the logic in the `ReservationSystem` to handle these exceptions accordingly.

3. **Switch roles** for further refinement and additional functionalities.

### Rotation:
After each major task, roles should be switched to ensure both students get experience as both a Test Driver and an Implementer.

### Evaluation:

1. **Functionality (40 points)**:
   - Can the system correctly identify overlapping reservations?
   - Are payment failures and invalid booking dates detected and managed?

2. **Testing Quality (30 points)**:
   - Are the written tests comprehensive and cover edge cases?
   - Do the tests appropriately expect the right exceptions or results?

3. **Code Implementation (30 points)**:
   - Is the implemented code efficient and does it pass the tests?
   - Is the code organized, and are best practices followed?

### Conclusion:
This pair coding exercise will teach students not only the technical aspects of coding and testing but also the soft skills of communication, collaboration, and code review. By switching roles, students get a holistic view of the development process, from testing to implementation.