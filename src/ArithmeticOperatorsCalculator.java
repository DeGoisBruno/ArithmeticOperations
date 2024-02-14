import java.util.Scanner;

public class ArithmeticOperatorsCalculator {
    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);

        while (true) {
            System.out.println("Choose an operator: \n1 - Addition\n2 - Subtraction\n3 - Multiplication\n4 - Division \n5 - Quit");
            String operator = userInput.nextLine();
            if (operator.equals("5")) {
                System.out.println("Goodbye!");
                break;
            }

            System.out.println("Enter the first number: ");
            int firstNumber = userInput.nextInt();
            System.out.println("Enter the second number: ");
            int secondNumber = userInput.nextInt();

            switch(operator) {
                case "1":
                    System.out.println(firstNumber + secondNumber);
                    break;
                case "2":
                    System.out.println(firstNumber - secondNumber);
                    break;
                case "3":
                    System.out.println(firstNumber * secondNumber);
                    break;
                case "4":
                    if (secondNumber == 0) {
                        System.out.println("Cannot divide by zero");
                    } else {
                        System.out.println(firstNumber / secondNumber);
                    }
                    break;
                default:
                    System.out.println("Invalid operator");
            }
            userInput.nextLine();
        }
        userInput.close();
    }
}