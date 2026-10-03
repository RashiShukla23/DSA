public class EvenDigit{
    public static void main(String[] args){

        int[] nums = {12,345,2,6,7896,78,9090};

        int count = 0;

        for(int i =0;i<nums.length;i++){
            //taking single singlee number from the array and checking it
            int num = nums[i];

            int digitCount = 0;
            while(num>0){
                digitCount++;
                num = num/10;
            }
            if(digitCount % 2 ==0){
                count++;
            }
        }
        System.out.println(count);
    }
}