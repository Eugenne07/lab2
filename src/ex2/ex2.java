package ex2;

import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        int number, sum = 0;

        // Enter username and press Enter
        System.out.println("Enter number");
        number = myObj.nextInt();
        String str = Integer.toString(number);
        for(int i = 0; i < str.length(); i++){
            sum = sum + number%10;
            number /= 10;
        }
        System.out.println(sum);
    }
}
