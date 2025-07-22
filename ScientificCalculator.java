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
                case 10:
                    performNaturalLogarithm();
                    break;
                case 11:
                    performLogarithmBase10();
                    break;
                case 12:
                    performAbslout();
                    break;
                case 13:
                    performRoundNumber();
                    break;
                case 14:
                    performCeilingNumber();
                    break;
                case 15:
                    performFloorNumber();
                    break;
                case 16:
                    performFindMin();
                    break;
                case 17:
                    performFindMax();
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
            System.out.print("Choose the type of Operation by entering the number: \n 1. Add \n 2. Subtract \n 3. Multiply \n 4. Divide \n 5. Calculate Square Root \n 6. Calculate Power \n 7. Calculate Sine \n 8. Calculate Cosine \n 9. Calculate Tanget \n 10. Calculate Natural Logarithm  \n 11. Calculate Logarithm Base 10 \n 12. Calculate Absloute Value \n 13. Find Nearest Round  \n 14. Find Ceiling  \n 15. Find Floor \n 16. Find Min \n 17.  Find Max  \n enter 0 to exit \n ");
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

    public static double calculateNaturalLogarithm(double num) {
        double result= Math.log(num);
        System.out.print("The result is: " + result + "\n");
        return result;
    }

    private static double performNaturalLogarithm(){
        double result;
        try {
            Scanner numbersReader = new Scanner(System.in);
            System.out.print("Enter the number: ");
            double num= numbersReader.nextDouble();
            if (num>0){
                result= calculateNaturalLogarithm(num);
            } else {
                System.out.println("Positive numbers should be entered!");
                result = 0;
                performNaturalLogarithm();
            }
        } catch (Exception e) {
            System.out.println("Valid numbers should be entered!");
            result = 0;
            performNaturalLogarithm();
        }
        return result;
    }

    public static double calculateLogarithmBase10(double num) {
        double result= Math.log(num);
        System.out.print("The result is: " + result + "\n");
        return result;
    }

    private static double performLogarithmBase10(){
        double result;
        try {
            Scanner numbersReader = new Scanner(System.in);
            System.out.print("Enter the number: ");
            double num= numbersReader.nextDouble();
            if (num>0){
                result= calculateLogarithmBase10(num);
            } else {
                System.out.println("Positive numbers should be entered!");
                result = 0;
                performLogarithmBase10();
            }
        } catch (Exception e) {
            System.out.println("Valid numbers should be entered!");
            result = 0;
            performLogarithmBase10();
        }
        return result;
    }

    public static double abslout(double num) {
        double result = Math.abs(num);
        System.out.print("The result is: " + result + "\n");
        return result;
    }

    private static double performAbslout(){
        double result;
        try {
            Scanner numbersReader = new Scanner(System.in);
            System.out.print("Enter the number: ");
            double num= numbersReader.nextDouble();
            result= abslout(num);
        } catch (Exception e) {
            System.out.println("Valid numbers should be entered!");
            result = 0;
            performAbslout();
        }
        return result;
    }

    public static double roundNumber(double num) {
        double result = Math.round(num);
        System.out.print("The result is: " + result + "\n");
        return result;
    }

    private static double performRoundNumber(){
        double result;
        try {
            Scanner numbersReader = new Scanner(System.in);
            System.out.print("Enter the number: ");
            double num= numbersReader.nextDouble();
            result= roundNumber(num);
        } catch (Exception e) {
            System.out.println("Valid numbers should be entered!");
            result = 0;
            performRoundNumber();
        }
        return result;
    }

    public static double ceilingNumber(double num) {
        double result = Math.ceil(num);
        System.out.print("The result is: " + result + "\n");
        return result;
    }

    private static double performCeilingNumber(){
        double result;
        try {
            Scanner numbersReader = new Scanner(System.in);
            System.out.print("Enter the number: ");
            double num= numbersReader.nextDouble();
            result= ceilingNumber(num);
        } catch (Exception e) {
            System.out.println("Valid numbers should be entered!");
            result = 0;
            performCeilingNumber();
        }
        return result;
    }

    public static double floorNumber(double num) {
        double result = Math.floor(num);
        System.out.print("The result is: " + result + "\n");
        return result;
    }

    private static double performFloorNumber(){
        double result;
        try {
            Scanner numbersReader = new Scanner(System.in);
            System.out.print("Enter the number: ");
            double num= numbersReader.nextDouble();
            result= floorNumber(num);
        } catch (Exception e) {
            System.out.println("Valid numbers should be entered!");
            result = 0;
            performFloorNumber();
        }
        return result;
    }

    public static double findMin(double num1, double num2) {
        double result = Math.min(num1, num2);
        System.out.print("The result is: " + result + "\n");
        return result;
    }

    private static double performFindMin(){
        double result;
        try {
            Scanner numbersReader = new Scanner(System.in);
            System.out.print("Enter the first number: ");
            double num1 = numbersReader.nextDouble();
            System.out.print("Enter the second number: ");
            double num2 = numbersReader.nextDouble();
            result= findMin(num1, num2);
        } catch (Exception e) {
            System.out.println("Valid numbers should be entered!");
            result = 0;
            performFindMin();
        }
        return result;
    }

    public static double findMax(double num1, double num2) {
        double result = Math.min(num1, num2);
        System.out.print("The result is: " + result + "\n");
        return result;
    }

    private static double performFindMax(){
        double result;
        try {
            Scanner numbersReader = new Scanner(System.in);
            System.out.print("Enter the first number: ");
            double num1 = numbersReader.nextDouble();
            System.out.print("Enter the second number: ");
            double num2 = numbersReader.nextDouble();
            result= findMax(num1, num2);
        } catch (Exception e) {
            System.out.println("Valid numbers should be entered!");
            result = 0;
            performFindMax();
        }
        return result;
    }
}
