public class SearchInRange {
    public static void main(String[] args) {
        int[] nums = {24,46,68,356,89,26,924,134,798,9,24365,455};
        int target = 924;
        System.out.println(range(nums,target,3,10));
    }

    static int range(int[] arr,int target,int start,int end){

        if(arr.length==0){
            return -1;
        }

        for(int i=start;i<=end;i++){
            if(target==arr[i]){
                return i;
            }
        }
        return -1;
    }
}
