class InvalidOrderException extends Exception {
    public InvalidOrderException(String message) {
        super(message);
    }
}

public class OrderValidator {
    public static void validateOrder(String contactNumber, int pizzaQty, int pastaQty) throws InvalidOrderException {
        StringBuilder errors = new StringBuilder();

        if (contactNumber.trim().isEmpty()) {
            errors.append("Error: Invalid Contact Number. Please provide a valid phone number.\n");
        }

        if (pizzaQty <= 0) {
            errors.append("Error: Invalid Quantity for Pizza. Quantity must be greater than 0.\n");
        }

        if (errors.length() > 0) {
            throw new InvalidOrderException(errors.toString());
        }

        System.out.println("Order placed successfully!");
    }

    public static void main(String[] args) {
        String contactNumber = ""; // Missing contact number
        int pizzaQty = -1; // Invalid quantity
        int pastaQty = 1; // Valid quantity

        try {
            validateOrder(contactNumber, pizzaQty, pastaQty);
        } catch (InvalidOrderException e) {
            System.out.println(e.getMessage());
        }
    }
}
