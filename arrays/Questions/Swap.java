public class Swap{
    public static void main(String[] args){
        int[] arr = {10,13,23,04,9};
        swap(arr,0,4);

    }

    static void swap(int arr[],int index1, int index2){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
        for(int i =0; i<arr.length;i++){
            System.out.println(arr[i]);
        }
        
    }
}