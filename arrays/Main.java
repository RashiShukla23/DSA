import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        //taking input and printing
        Scanner in = new Scanner(System.in);

        //now i need to know what should be the size of thr array
        System.out.println("Enter the size of the array ");
        int n = in.nextInt();

        // now i know the size so i will create an array
        int[] arr = new int[n];

        //array has been initialesd now we hav eto fill the array
        System.out.println("Enter " + n + " elements");
        for(int i=0; i<n ; i++){
            arr[i] = in.nextInt();
        }

        //print the array
        for(int i=0 ; i<n ; i++){
            System.out.println(arr[i] + " ");
        }


    }

}