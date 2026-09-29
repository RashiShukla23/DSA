import java.util.Scanner;
import java.util.ArrayList;

public class Dynamic{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        //syntax
        ArrayList<Integer> list = new ArrayList<>();
        
        System.out.print("Enter the elements ");
        int n = in.nextInt();

        for(int i=0 ; i < n; i++){
            list.add(in.nextInt());
        }
        System.out.println("Your list is "+list);

    }
}