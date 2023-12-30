
public class LinearSearch1 {
    public static void main(String[] args) {
        int[] nums = {24,6574,89,1234,9,465,356,36,0,286,86};
        int target = 36;

        int ans = linearSearch(nums,target);
        System.out.println(ans);
    }

    static int linearSearch(int[] arr,int target){

        if(arr.length==0){
            return -1;
        }

        for(int num : arr){
            if(num == target){
                return num;
            }
        }
        return -1;
    }
}


