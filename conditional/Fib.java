import java.util.Scanner;

public class Fib{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        int previous_no = 0;
        int current_no = 1;
        int count = 2;

        while(count<=n){
            int temp = current_no;
            current_no = current_no + previous_no; // eg curent = 2 prev = 1 henc cureent = 2+1 
            previous_no = temp;
            count++;



        }System.out.println(current_no);
    }
}
