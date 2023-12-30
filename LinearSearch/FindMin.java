
public class FindMin {
    public static void main(String[] args) {
        int[] nums = {23,456,8,45678,23567,177,3,-57,5756,233};
        System.out.println(min(nums));
    }

    static int min(int[] arr){

        if(arr.length==0){
            return -1;
        }

        int minimum_no = arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i] < minimum_no){
                minimum_no = arr[i];
            }
        }
        return minimum_no;
    }
}
