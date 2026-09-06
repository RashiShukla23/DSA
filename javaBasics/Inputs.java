import java.util.Scanner;

public class Inputs {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.err.print("Please enter something ");
        int rollno = input.nextInt();
        System.out.println("Your roll no is" + rollno);
    }
}