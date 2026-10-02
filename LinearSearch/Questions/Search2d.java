import java.util.Arrays;

public class Search2d{
    public static void main(String[] args){
        int[][] arr = {
            {1,2,3,4,5},
            {13,23},
            {3,10}
        };
        int target = 23;
        System.out.println(Arrays.toString(Search(arr,target)));
    }

    static int[] Search(int[][] arr, int target){
        for(int i =0; i<arr.length;i++){
            for(int j=0; j<arr[i].length; j++){
                if(arr[i][j] == target){
                    return new int[]{i,j};
                    
                }
            }
        }
        return new int[]{-1,-1};
    }
}