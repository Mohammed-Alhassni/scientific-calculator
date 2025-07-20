import java.util.Scanner;

public class ScientificCalculator {
    public static void main(String[] args) {
        while(true) {
            int userChoice= menuDisplay();
            switch (userChoice){
                case 1:
                    double result= add();
                    System.out.print("The result is: " + result + "\n");
                    break;
                case 2:
                    System.out.print("Application terminated \n");
                    break;
                default:
                    System.out.println("Wrong choice");
            }
        }
    }

    public static int menuDisplay(){
        Scanner input = new Scanner(System.in);
        System.out.print("Choose the type of Operation by entering the number: \n 1. Add \n 2. exit \n ");
        int userChoice = input.nextInt();
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
}
