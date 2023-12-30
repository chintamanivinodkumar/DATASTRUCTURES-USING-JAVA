
public class MaxIn2DArray {
    public static void main(String[] args) {
        int[][] nums = {
            {34,56,873456,756,3},
            {54,67,98,23,9},
            {45,89,5},
            {4677,79,-8,453,457,80,23430005,57689,345}
        };
        System.out.println(max(nums));
    }

    static int max(int[][] arr){

        int max_no = Integer.MIN_VALUE;
        for(int[] i : arr){
            for(int element : i){
                if(element > max_no){
                    max_no = element;
                }
            }
        }
        return max_no;
    }
}
