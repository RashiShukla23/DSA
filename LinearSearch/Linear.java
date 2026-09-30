public class Linear{
    public static void main(String[] args){
        int[] arr = {6,7,8,19,20,22 };
        int target = 19;

        int result = linearSearch(arr, target);
        System.out.print(result);
    }
    
    static int linearSearch(int[] arr,int target){
        if(arr.length == 0){
            System.out.print("Null");
        }
        for(int i=0; i<arr.length; i++){

            if(arr[i]==target){
                return i;
            }
            
        }return -1;
        
    }
}