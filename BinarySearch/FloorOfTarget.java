public class FloorOfTarget {
    public static void main(String[] args) {
        int[] arr = {2,3,5,9,14,16,18};
        int target = 10;
        int ans = floor(arr,target);
        System.out.println(ans);
    }

    static int floor(int[] arr,int target){
        int start = 0;
        int end = arr.length - 1;

        while(start <= end){

            //find the middle element
            int mid = start + (end - start) / 2;

            if(target == arr[mid]){
                return mid;
            }

            if(target > arr[mid]){
                start = mid + 1;
            }
            else if(target < arr[mid]){
                end = mid - 1;
            }
        }
        return end;
    }
}
