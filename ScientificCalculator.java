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
                case 8:
                    performCosine();
                    break;
                case 9:
                    performTanget();
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
            System.out.print("Choose the type of Operation by entering the number: \n 1. Add \n 2. Subtract \n 3. Multiply \n 4. Divide \n 5. Calculate Square Root \n 6. Calculate Power \n 7. Calculate Sine \n 8. Calculate Cosine \n 9. Calculate Tanget  \n enter 0 to exit \n ");
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
        double result;
        try {
            Scanner numbersReader = new Scanner(System.in);
            System.out.print("Enter the first number: ");
            double num1= numbersReader.nextDouble();
            System.out.print("Enter the second number: ");
            double num2= numbersReader.nextDouble();
            result= add(num1, num2);
        } catch (Exception e) {
            System.out.println("Valid numbers should be entered!");
            result = 0;
            performAddition();
        }
        return result;
    }

    public static double subtract(double num1, double num2){
        double result = num1 - num2;
        System.out.print("The result is: " + result + "\n");
        return result;
    }

    private static double performSubtract() {
        double result;
        try {
            Scanner numbersReader = new Scanner(System.in);
            System.out.print("Enter the first number: ");
            double num1 = numbersReader.nextDouble();
            System.out.print("Enter the second number: ");
            double num2 = numbersReader.nextDouble();
            result = subtract(num1, num2);
        } catch (Exception e) {
            System.out.println("Valid numbers should be entered!");
            result = 0;
            performSubtract();
        }
        return result;
    }

    public static double multiply(double num1, double num2){
        double result = num1 * num2;
        System.out.print("The result is: " + result + "\n");
        return result;
    }

    private static double performMultiply(){
        double result;
        try {
            Scanner numbersReader = new Scanner(System.in);
            System.out.print("Enter the first number: ");
            double num1 = numbersReader.nextDouble();
            System.out.print("Enter the second number: ");
            double num2 = numbersReader.nextDouble();
            result = multiply(num1, num2);
        } catch (Exception e) {
            System.out.println("Valid numbers should be entered!");
            result = 0;
            performMultiply();
        }
        return result;
    }

    public static double divide(double num1, double num2){
        double result = num1 / num2;
        System.out.print("The result is: " + result + "\n");
        return result;
    }

    private static double performDivide(){
        double result;
        try {
            Scanner numbersReader = new Scanner(System.in);
            System.out.print("Enter the first number: ");
            double num1 = numbersReader.nextDouble();
            System.out.print("Enter the second number: ");
            double num2 = numbersReader.nextDouble();
            result = divide(num1, num2);
        } catch (Exception e) {
            System.out.println("Valid numbers should be entered!");
            result = 0;
            performDivide();
        }
        return result;
    }

     public static double squareRoot(double num) {
         double result = Math.sqrt(num);
         System.out.print("The result is: " + result + "\n");
         return result;
     }

    private static double performSquareRoot(){
        double result;
        try {
            Scanner numbersReader = new Scanner(System.in);
            System.out.print("Enter the number: ");
            double num = numbersReader.nextDouble();
            result= squareRoot(num);
        } catch (Exception e) {
            System.out.println("Valid numbers should be entered!");
            result = 0;
            performSquareRoot();
        }
        return result;
    }

    public static double power(double base, double exponent){
        double result = Math.pow(base, exponent);
        System.out.print("The result is: " + result + "\n");
        return result;
    }

    private static double performPower(){
        double result;
        try {
            Scanner numbersReader = new Scanner(System.in);
            System.out.print("Enter the base number: ");
            double base= numbersReader.nextDouble();
            System.out.print("Enter the exponent number: ");
            double exponent= numbersReader.nextDouble();
            result = power(base, exponent);
        } catch (Exception e) {
            System.out.println("Valid numbers should be entered!");
            result = 0;
            performPower();
        }
        return result;
    }

    public static double sine(double degree) {
        double result = Math.sin(Math.toRadians(degree));
        System.out.print("The result is: " + result + "\n");
        return result;
    }

    private static double performSine(){
        double result;
        try {
            Scanner numbersReader = new Scanner(System.in);
            System.out.print("Enter the number in degrees: ");
            double degree= numbersReader.nextDouble();
            result= sine(degree);
        } catch (Exception e) {
            System.out.println("Valid numbers should be entered!");
            result = 0;
            performSine();
        }
        return result;
    }

    public static double cosine(double degree) {
        double result = Math.cos(Math.toRadians(degree));
        System.out.print("The result is: " + result + "\n");
        return result;
    }

    private static double performCosine(){
        double result;
        try {
            Scanner numbersReader = new Scanner(System.in);
            System.out.print("Enter the number in degrees: ");
            double degree= numbersReader.nextDouble();
            result= cosine(degree);
        } catch (Exception e) {
            System.out.println("Valid numbers should be entered!");
            result = 0;
            performCosine();
        }
        return result;
    }

    public static double tanget(double degree) {
        double result = Math.tan(Math.toRadians(degree));
        System.out.print("The result is: " + result + "\n");
        return result;
    }

    private static double performTanget(){
        double result;
        try {
            Scanner numbersReader = new Scanner(System.in);
            System.out.print("Enter the number in degrees: ");
            double degree= numbersReader.nextDouble();
            result= tanget(degree);
        } catch (Exception e) {
            System.out.println("Valid numbers should be entered!");
            result = 0;
            performTanget();
        }
        return result;
    }
}
