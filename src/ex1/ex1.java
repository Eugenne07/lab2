package ex1;
import java.util.Scanner;
public class ex1 {

    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        String string;

        // Enter username and press Enter
        System.out.println("Enter string");
        string = myObj.nextLine();

        if(string.length()%2==0){
            System.out.println(string.charAt(string.length()/2-1) + "" + string.charAt(string.length()/2 ));
        }
        else{
            System.out.println(string.charAt(string.length()/2));
        }
    }
}
