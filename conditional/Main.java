public class Main{
    
    public static void main(String[] args) {
        /*
        Syntax of if statements:
        if (boolean expression T or F){
        
         */

        int x = 1000;
        if (x > 100){
            x = x + 200;
        }else {
            x = x + 100;
        }

        //multiple if else
        if (x > 100){
            x += 2000; // x = x + 2000

        }else if ( x > 150){
            x -=200;
        } else{
            x *= 10;
        }

        System.out.println(x);


        
    }

}