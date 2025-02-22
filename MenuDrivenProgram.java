import java.util.Scanner;

public class MenuDrivenProgram {


    public static void greetUser() {
        System.out.println("Hello! Welcome!");
    }

   
    public static void checkEvenOdd() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();
        
        if (number % 2 == 0) {
            System.out.println(number + " is an Even number.");
        } else {
            System.out.println(number + " is an Odd number.");
        }
    }


    public static void displayMenu() {
        System.out.println("Menu:");
        System.out.println("1. Greet User");
        System.out.println("2. Check Even/Odd");
        System.out.println("3. Exit");
    }


    public static void handleMenuChoice(int choice) {
        switch (choice) {
            case 1:
                greetUser();
                break;
            case 2:
                checkEvenOdd();
                break;
            case 3:
                System.out.println("Exiting program. Goodbye!");
                break;
            default:
                System.out.println("Invalid choice. Please choose between 1 and 3.");
                break;
        }
    }

   
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;


        do {
            displayMenu();  // Display the menu options
            System.out.print("Enter your choice (1-3): ");
            choice = scanner.nextInt(); 
            handleMenuChoice(choice);   
        } while (choice != 3); 
chooses to exit
    }
}
