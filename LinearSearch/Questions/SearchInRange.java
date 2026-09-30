public class SearchInRange{
    public static void main(String[] args){
        int[] arr = {12,13,14,90,1,13,23};
        int target = 90;
        //int start = 1;
        //int end = 6;

        int result = Search(arr,target,1,6);
        System.out.println(result);

    }
    static int Search(int[] arr, int target, int start , int end){
        if(arr.length==0){
            return -1;
        }
        for(int i = start; i < end ; i++){
            if(arr[i]==target){
                return i;

            }
        }return -1;

    }
}