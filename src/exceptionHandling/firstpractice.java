package exceptionHandling;

// Custom Exception
class AgeInvalidException extends Exception {
    AgeInvalidException() {
        super("Age is Invalid !!");
    }

    AgeInvalidException(String message) {
        super(message);
    }
}

class FirstPractice {
    public static void main(String[] args) {
        System.out.println("Program Start...");

        try {
            int n1 = Integer.parseInt(args[0]);
            int n2 = Integer.parseInt(args[1]);

            System.out.println("We have got two numbers: ");

            int result = n1 / n2;

            if (n2 < 10) {
                throw new AgeInvalidException("My age is Invalid !!");
            }

            System.out.println("Division is " + result);
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Please provide two numbers as command-line arguments.");
        }
        catch (NumberFormatException e) {
            System.out.println("Please ensure both inputs are valid integers.");
        }
        catch (ArithmeticException e) {
            System.out.println("n2 cannot be 0!!!");
            System.out.println(e.getMessage());
        }
        catch (AgeInvalidException e) {
            System.out.println("AgeInvalidException: " + e.getMessage());
        }
        finally {
            System.out.println("I am in the finally block:");
            System.out.println("So please close all the resources...");
        }

        System.out.println("Program end...");
    }
}

// Dummy class for structure (not required for functionality)
class Tommy {
}
