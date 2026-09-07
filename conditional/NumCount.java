public class NumCount{
    public static void main(String[] args){
        int n = 567778;
        int count = 0;

        while(n>0){
            int rem = n % 10;
            if(rem == 7){
                count++;
            }
            n = n / 10;

        }System.out.println(count);
    }
}