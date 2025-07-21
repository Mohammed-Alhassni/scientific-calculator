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
                case 5:
                    performSquareRoot();
                    break;
                case 6:
                    performPower();
                    break;
                case 7:
                    performSine();
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
            System.out.print("Choose the type of Operation by entering the number: \n 1. Add \n 2. Subtract \n 3. Multiply \n 4. Divide \n 5. Calculate Square Root \n 6. Calculate Power \n 7. Calculate Sine \n enter 0 to exit \n ");
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

    private static double performAddition(){
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

    private static double performSubtract(){
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

    private static double performMultiply(){
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

    private static double performDivide(){
        Scanner numbersReader = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        double num1= numbersReader.nextDouble();
        System.out.print("Enter the second number: ");
        double num2= numbersReader.nextDouble();
        double result= divide(num1, num2);
        return result;
    }

     public static double squareRoot(double num) {
         double result = Math.sqrt(num);
         System.out.print("The result is: " + result + "\n");
         return result;
     }

    private static double performSquareRoot(){
        Scanner numbersReader = new Scanner(System.in);
        System.out.print("Enter the number: ");
        double num= numbersReader.nextDouble();
        double result= squareRoot(num);
        return result;
    }

    public static double power(double base, double exponent){
        double result = Math.pow(base, exponent);
        System.out.print("The result is: " + result + "\n");
        return result;
    }

    private static double performPower(){
        Scanner numbersReader = new Scanner(System.in);
        System.out.print("Enter the base number: ");
        double base= numbersReader.nextDouble();
        System.out.print("Enter the exponent number: ");
        double exponent= numbersReader.nextDouble();
        double result= power(base, exponent);
        return result;
    }

    public static double sine(double degree) {
        double result = Math.sin(degree);
        System.out.print("The result is: " + result + "\n");
        return result;
    }

    private static double performSine(){
        Scanner numbersReader = new Scanner(System.in);
        System.out.print("Enter the number in degrees: ");
        double degree= numbersReader.nextDouble();
        double result= sine(degree);
        return result;
    }
}
