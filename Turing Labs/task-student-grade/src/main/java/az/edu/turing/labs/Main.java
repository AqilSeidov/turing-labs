package az.edu.turing.labs;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        //Task 1 --> Student Grade System

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Score1: ");
        int score1 = sc.nextInt();

        System.out.print("Enter the Score2: ");
        int score2 = sc.nextInt();

        System.out.print("Enter the Score3: ");
        int score3 = sc.nextInt();

        int avg = (score1 + score2 + score3)/3;

        if (score1<=40 || score2<=40 || score3<=40){
            System.out.printf("Scores: %d,%d,%d -> Failed - One or more exam scores are too low.",score1,score2,score3);
        }
        else if(avg>= 85){
            System.out.printf("Scores: %d,%d,%d -> Congratulations! You have earned a Certificate of Excellence.", score1, score2, score3 );
        }
        else if(avg>=70 && avg<85){
            System.out.printf("Scores: %d,%d,%d -> Well done! You have earned a Certificate of Achievement.", score1,score2,score3 );
        }
        else if(avg>=50 && avg<70) {
            System.out.printf("Scores: %d,%d,%d -> You passed", score1, score2, score3);
        }
        else{
            System.out.printf("Scores: %d,%d,%d -> Failed", score1, score2, score3 );
        }

        //____________________________________________________________________________________

    }
}