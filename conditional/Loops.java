import java.util.Scanner;

public class Loops{
    public static void main(String[] args){
        /*
        for loop
        syntax for (intialisation , condition , increment/ decrement){
        //body
        }
         */
        /*
        //Q = print numbers from 1 to 5
        for ( int num = 1 ; num <= 5 ; num +=2){
            System.out.println(num);
        }

        // print numbers from 1 to n
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        for (int num = 1 ; num <= n ; num +=1){
            System.out.println(num);
        }s */

        /*
        while loops
        while(condition){
            ///body
        }
         */
        int num = 1;
        while (num <=5){
            System.out.println(num);
            num++;
        }
    }
}