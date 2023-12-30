import java.util.Arrays;

public class SearchIn2DArray {
    public static void main(String[] args) {
        
        int[][] nums = {
            {34,56,873456,756,3},
            {54,67,98,23,9},
            {45,89,5},
            {4677,79,-8,453,457,80,23435,57689,345}
        };
        int target = -8;
        int ans[] = search(nums,target);
        System.out.println(Arrays.toString(ans));
    }

    static int[] search(int[][] arr,int target){


        for(int row =0;row<arr.length;row++){

            for(int col=0;col < arr[row].length;col++){

                if(target == arr[row][col]){
                    return new int[]{row,col};
                }
            }
        }
        return new int[]{-1,-1};
    }
}
