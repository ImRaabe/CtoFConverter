import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String trash = ""; //Bad inputs (Strings)
        // Create a do while loop to test for valid number
        while (true) {
            //Prompt for input of temperature in Celsius
            System.out.print("Enter Temperature in Celsius: ");
            //Determine if input is valid
            if (in.hasNextDouble()) {
                double celsius = in.nextDouble();
                if (celsius < -273.15) {
                    System.out.println("The temperature you entered is below absolute zero, please enter a valid temperature.");
                } else {
                    //Formula C to F
                    double F = (celsius * 9 / 5) + 32;
                    System.out.println("Your temperature in Celsius, " + celsius + ", is equal to " + F + " degrees Fahrenheit");
                    break;
                }
            } else {
                trash = in.nextLine();
                System.out.println("\nYour entered: " + trash);
                System.out.println("Please enter a valid temperature.");
                in.next();
            }
        }
        in.close();
    }
}



