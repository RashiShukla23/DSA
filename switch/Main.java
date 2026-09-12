import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        String fruit = in.next();

        switch (fruit) {
            case "Mango":
                System.out.println("king of fruits");
                break;
            
            case "apple":
                System.out.println("Red sweet apple");
                break;
            
            case "orange":
                System.out.println("Round fruit");
                break;
            
            case "grapes":
                System.out.println("small fruits");
                break;

            default:
                System.out.println("idk");
        }

    }
}