import java.util.Scanner;

public class ScientificCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Boolean condition = true;
        while(condition) {
            System.out.print("Choose the type of Operation by entering the number: \n 1. Add \n 2. exit \n ");
            int userChoice = input.nextInt();
            double result;
            switch (userChoice){
                case 1:
                    System.out.print("Enter the first number: ");
                    double num1= input.nextDouble();
                    System.out.print("Enter the second number: ");
                    double num2= input.nextDouble();
                    result= add(num1, num2);
                    System.out.print("The result is: " + result + "\n");
                    break;
                case 2:
                    condition = false;
                    System.out.print("Application terminated");
                    break;
            }
        }
    }

    public static double add(double num1, double num2){
        return num1+num2;
    }
}
