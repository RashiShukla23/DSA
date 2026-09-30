public class Reverse{
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5,6};
        
        //defining the indexes
        int start = 0;
        int end = arr.length - 1; //we did -1 becuase if length of array is 5 then max index would be 4

        while(end>start){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }

        for(int i=0 ; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }

    }

}