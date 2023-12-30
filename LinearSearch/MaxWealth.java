public class MaxWealth {
    public static void main(String[] args) {
        int[][] accounts = {
            {1,2,3}, //here wealth = [1+2+3] = 6
            {3,2,5}  //here wealth = [3+2+5] = 10
        };
        System.out.println(maximumWealth(accounts));
    }

    static int maximumWealth(int[][] accounts){

        int ans = Integer.MIN_VALUE;
        for(int[] i : accounts){
            int rowSum = 0;

            for(int element : i){
                rowSum = rowSum + element;
            }

            if(rowSum > ans){
                ans = rowSum;
            }
        }
        return ans;
    }
}
