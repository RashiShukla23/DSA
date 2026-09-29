import java.util.Scanner;

public class MultiDim{
    public static void main(String[] args){
        /*
        2 3 4
        6 7 8
        9 1 0    It has rows and coloumns

         */
        //int[][] arr = new int[3][];

        /*
        int[][] arr = {   
                        {1, 2 , 3},
                        {6, 7 , 8},
                        {9,23,13}

        }
        */
       Scanner in = new Scanner(System.in);

       //I want to know what should be the size of my array 
       //first lets ask number of rows
       System.out.print("Enter number of rows ");
       int rows = in.nextInt();

       //now take number of coloumns
       System.out.print("Enter number of coloumns ");
       int col = in.nextInt();

       //now i know the size so lets intialise an array
       int[][] arr = new int[rows][col];

       //now we knnow size so lets build the array
       System.out.println("Enter " +(rows*col)+  " elements ");

       //for first loop i signifies rows it will go to i'th row [0][0] now in i'th row it will fill its coloumns by using j loop {internal for loop}
       //[0][0]-->[0][1]-->[0][2]-->[0,3] intranl loop finesd now go to next row
       //[1][0]-->[1][1]-->[1][2]-->[1][3] and so on
       for(int i=0; i<arr.length ; i++){
        for(int j=0; j<arr[1].length ; j++){
            //enter the elements in the coloumns now
            arr[i][j] = in.nextInt();
        }
       }

       //now print the matrix
       System.out.println("Your matrix: ");
       for(int i=0;i<arr.length;i++){
        for(int j=0; j<arr[1].length; j++){
            System.out.print(arr[i][j] + " ");
        }
        System.out.println();
       }

    }
}