package LinearSearch;

public class MaxWealth {
    static void main() {
        int[][] accounts = {{2,8,7},{7,1,3},{1,9,5}};
        System.out.println(maximumWealth(accounts));
    }

    public static int maximumWealth(int[][] accounts){
        int max = Integer.MIN_VALUE;
        for(int row = 0; row < accounts.length; row++){
            int total = 0;
            for(int col = 0; col < accounts[row].length; col++){
                total += accounts[row][col];
            }
            if(total > max){
                max = total;
            }
        }
        return max;
    }
}
