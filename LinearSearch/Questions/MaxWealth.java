//https://leetcode.com/problems/richest-customer-wealth/description/

public class MaxWealth{
    public static void main(String[] args){
        int[][] accounts = {
            {8,9,12},
            {9,10,8},
            {10,10,14}
        };
        
        int maximum = 0;

        for(int i=0; i<accounts.length;i++){

            int wealth = 0;

            for(int j=0; j<accounts[i].length; j++){
                
                wealth += accounts[i][j];

            }
            if(wealth>maximum){
                maximum = wealth;
            }
        }
        System.out.println(maximum);
   

    }
}