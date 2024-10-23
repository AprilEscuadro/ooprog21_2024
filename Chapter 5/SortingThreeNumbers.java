import java.util.Scanner;

public class SortingThreeNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("\n- - - - - - - - - - - - - - - - - - - - - ");
        System.out.println(" - - - - - SORTING THREE NUMBERS - - - - -");
        System.out.println("- - - - - - - - - - - - - - - - - - - - - ");
        System.out.print("\nEnter First Number: ");
        int num1 = input.nextInt();
        System.out.print("Enter Second Number: ");
        int num2 = input.nextInt();
        System.out.print("Enter Third Number: ");
        int num3 = input.nextInt();
        
        if (num1 <= num2 && num2 <= num3) {
            System.out.println("\nAscending order: " + num1 + " " + num2 + " " + num3);
        } 
        else if (num1 >= num2 && num1 >= num3 && num2 >= num3) {
            System.out.println("\nDescending order: " + num1 + " " + num2 + " " + num3);
        }
        else if (num1 >= num2 && num1 >= num3 && num3 >= num2) {
            System.out.println("\nDescending order: " + num1 + " " + num3 + " " + num2);
        }
        else if (num2 >= num1 && num2 >= num3 && num1 >= num3) {
            System.out.println("\nDescending order: " + num2 + " " + num1 + " " + num3);
        }
        else if (num2 >= num1 && num2 >= num3 && num3 >= num1) {
            System.out.println("\nDescending order: " + num2 + " " + num3 + " " + num1);
        }
        else if (num3 >= num1 && num3 >= num2 && num1 >= num2) {
            System.out.println("\nDescending order: " + num3 + " " + num1 + " " + num2);
        }
        else {
            System.out.println("\nDescending order: " + num3 + " " + num2 + " " + num1);
        }
        input.close();
    }
}