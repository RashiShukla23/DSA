public class Max{
    public static void main(String[] args){
        //defiing an array
        int[] arr = {23,13,50,90};
        System.out.println(max(arr));
    }

    static int max(int[] arr){
        int maxValue = arr[0];
        for(int i =0;i<arr.length; i++){
            if(arr[i]>maxValue){
                maxValue = arr[i];
            }
        }
        return maxValue;
    }
}

