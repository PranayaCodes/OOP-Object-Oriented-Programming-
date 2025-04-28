import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        int age = 21;

        // Simple if-else
        if (age >= 18) {
            System.out.println("You can vote");
        } else {
            System.out.println("You cannot vote");
        }

        // if-else if
        if (age >= 21) {
            System.out.println("You are 21 or over");
        } else if (age >= 18) {
            System.out.println("You are 18 or over but not 21");
        } else {
            System.out.println("You are smaller than 18");
        }

        // Nested if with hardcoded values
        int a = 5;
        int b = 10;
        int c = 3;

        if (a > b) {
            if (a > c) {
                System.out.println(a + " is the highest number");
            } else {
                System.out.println(c + " is the highest number");
            }
        } else {
            if (b > c) {
                System.out.println(b + " is the highest number");
            } else {
                System.out.println(c + " is the highest number");
            }
        }

        // Taking input from user
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int x = sc.nextInt();
        System.out.print("Enter the second number: ");
        int y = sc.nextInt();
        System.out.print("Enter the third number: ");
        int z = sc.nextInt();
        sc.nextLine(); // to consume the newline character
        System.out.print("Enter your name: ");
        String name = sc.nextLine();
        sc.close();

        System.out.println("Hello, " + name + "!");

        // Nested if using user input
        if (x > y) {
            if (x > z) {
                System.out.println(x + " is the highest number");
            } else {
                System.out.println(z + " is the highest number");
            }
        } else {
            if (y > z) {
                System.out.println(y + " is the highest number");
            } else {
                System.out.println(z + " is the highest number");
            }
        }

        // Ternary operator version to find highest
        int max = (x > y) ? ((x > z) ? x : z) : ((y > z) ? y : z);
        System.out.println("Using ternary: " + max + " is the highest number");

        // Switch statement for day
        String day = "Saturday";
        switch (day) {
            case "Sunday":
                System.out.println("First day of the week");
                break;
            case "Monday":
                System.out.println("Second day of the week");
                break;
            default:
                System.out.println("Some other day of the week");
                break;
        }
    }
}
