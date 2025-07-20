import java.util.Scanner;

public class ScientificCalculator {
    public static void main(String[] args) {
       boolean isContinued = true;
        while(isContinued) {
            double result;
            int userChoice= menuDisplay();
            switch (userChoice){
                case 1:
                    result= add();
                    System.out.print("The result is: " + result + "\n");
                    break;
                case 2:
                    result= subtract();
                    System.out.print("The result is: " + result + "\n");
                    break;
                case 3:
                    result= multiply();
                    System.out.print("The result is: " + result + "\n");
                    break;
                case 4:
                    result= divide();
                    System.out.print("The result is: " + result + "\n");
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

    public static double add(){
        Scanner numbersReader = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        double num1= numbersReader.nextDouble();
        System.out.print("Enter the second number: ");
        double num2= numbersReader.nextDouble();
        return num1+num2;
    }

     public static double subtract() {
         Scanner numbersReader = new Scanner(System.in);
         System.out.print("Enter the first number: ");
         double num1= numbersReader.nextDouble();
         System.out.print("Enter the second number: ");
         double num2= numbersReader.nextDouble();
         return num1-num2;
     }

    public static double multiply() {
        Scanner numbersReader = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        double num1= numbersReader.nextDouble();
        System.out.print("Enter the second number: ");
        double num2= numbersReader.nextDouble();
        return num1*num2;
    }

    public static double divide() {
        Scanner numbersReader = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        double num1= numbersReader.nextDouble();
        System.out.print("Enter the second number: ");
        double num2= numbersReader.nextDouble();
        return num1/num2;
    }
}
