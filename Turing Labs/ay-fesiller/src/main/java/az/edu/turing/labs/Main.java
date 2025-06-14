package az.edu.turing.labs;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Aylar: \n" +
                "1.Yanvar\n" +
                "2.Fevral\n" +
                "3.Mart\n" +
                "4.Aprel\n" +
                "5.May\n" +
                "6.Iyun\n" +
                "7.Iyul\n" +
                "8.Avqust\n" +
                "9.Sentyabr\n" +
                "10.Oktyabr\n" +
                "11.Noyabr\n" +
                "12.Dekabr\n");
        System.out.println("Ayın Rəqəmini Daxil Et: ");
        int ay = sc.nextInt();

        System.out.println((ay<=5 && ay>=3) ? "Yaz"
                : (ay>= 4 && ay<=6) ? "Yay"
                : (ay>=7 && ay<=11) ? "Payız"
                : (ay == 12 || ay>=1 &&ay<=2) ? "Qis"
                : "Yanlis Ay");
    }
}