import java.util.Scanner;

public class ScientificCalculator {
    public static void main(String[] args) {
       boolean isContinued = true;
        while(isContinued) {
            double result;
            int userChoice= menuDisplay();
            switch (userChoice){
                case 1:
                    performAddition();
                    break;
                case 2:
                    performSubtract();
                    break;
                case 3:
                    performMultiply();
                    break;
                case 4:
                    performDivide();
                    break;
                case 0:
                    System.out.print("Application terminated \n");
                    isContinued= false;
                    break;
                default:
                    System.out.println("Wrong choice");
            }
        }
    }

    public static int menuDisplay(){
        Scanner input = new Scanner(System.in);
        int userChoice;
        try{
            System.out.print("Choose the type of Operation by entering the number: \n 1. Add \n 2. Subtract \n 3. Multiply \n 4. Divide \n enter 0 to exit \n ");
            userChoice = input.nextInt();
        } catch (Exception e) {
            userChoice = -1;
            System.out.println("Wrong choice");
            menuDisplay();
        }
        return userChoice;
    }

    public static double add(double num1, double num2){
        double result = num1 + num2;
        System.out.print("The result is: " + result + "\n");
        return result;
    }

    public static double performAddition(){
        Scanner numbersReader = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        double num1= numbersReader.nextDouble();
        System.out.print("Enter the second number: ");
        double num2= numbersReader.nextDouble();
        double result= add(num1, num2);
        return result;
    }

    public static double subtract(double num1, double num2){
        double result = num1 - num2;
        System.out.print("The result is: " + result + "\n");
        return result;
    }

    public static double performSubtract(){
        Scanner numbersReader = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        double num1= numbersReader.nextDouble();
        System.out.print("Enter the second number: ");
        double num2= numbersReader.nextDouble();
        double result= subtract(num1, num2);
        return result;
    }

    public static double multiply(double num1, double num2){
        double result = num1 * num2;
        System.out.print("The result is: " + result + "\n");
        return result;
    }

    public static double performMultiply(){
        Scanner numbersReader = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        double num1= numbersReader.nextDouble();
        System.out.print("Enter the second number: ");
        double num2= numbersReader.nextDouble();
        double result= multiply(num1, num2);
        return result;
    }

    public static double divide(double num1, double num2){
        double result = num1 / num2;
        System.out.print("The result is: " + result + "\n");
        return result;
    }

    public static double performDivide(){
        Scanner numbersReader = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        double num1= numbersReader.nextDouble();
        System.out.print("Enter the second number: ");
        double num2= numbersReader.nextDouble();
        double result= divide(num1, num2);
        return result;
    }
}
