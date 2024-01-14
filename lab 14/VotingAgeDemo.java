// Custom exception class for handling invalid age for voting
class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}

// Class to demonstrate the usage of custom exception
public class VotingAgeDemo {
    // Method to check if the age is valid for voting
    public static void checkVotingAge(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("Age below 18 is invalid for voting.");
        } else {
            System.out.println("Congratulations! You are eligible to vote.");
        }
    }

    // Main program to demonstrate the usage
    public static void main(String[] args) {
        // Example 1: Valid age
        try {
            checkVotingAge(21);
        } catch (InvalidAgeException e) {
            System.out.println("Exception: " + e.getMessage());
        }

        // Example 2: Invalid age
        try {
            checkVotingAge(16);
        } catch (InvalidAgeException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}
