package az.edu.turing.labs;


import java.util.Scanner;

public class Main {
    public void VendingMachine() {
        String BLUE = "\u001B[34m";
        String RESET = "\u001B[0m";
        String RED = "\u001B[31m";
        System.out.println(
                        "\n1.Chocolate Bar - $2.00\n" +
                        "2.Soda - $1.50\n"+
                        "3.Chips - $1.20\n" +
                        "4.Sandwich - $3.00\n"+
                        "5.Water - $1.00\n" +
                        "6.Exit");

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your Choice: ");
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                System.out.println(BLUE +"Chocolate Bar - $2.00"+ RESET);
                break;
            case 2:
                System.out.println(BLUE + "Soda - $1.50"+ RESET);
                break;
            case 3:
                System.out.println(BLUE +"Chips - $1.20" + RESET);
                break;
            case 4:
                System.out.println(BLUE +"Sandwich - $3.00"+ RESET);
                break;
            case 5:
                System.out.println(BLUE+ "Water - $1.00" + RESET);
                break;
            case 6:
                System.out.println(RED+ "Exit" +RESET);
                sc.close();
                return;
            default:
                System.out.println(RED+ "Invalid selection. Please enter a number between 1 and 5" + RESET);
        }
        VendingMachine();
    }
    public static void main(String[] args) {
        Main vending = new Main();
        vending.VendingMachine();
    }
}