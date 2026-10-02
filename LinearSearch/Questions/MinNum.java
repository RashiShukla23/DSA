public class MinNum{
    public static void main(String[] args){
        int[] arr = {1,2,3,5,0};
        
        System.out.println(Min(arr));


    }

    static int Min(int[] arr){
        int min = arr[0];
        for(int i =0;i<arr.length;i++){
            if(arr[i]<min){
                min = arr[i];
            }

        }
        return min;
    }
}