//Leetcode 852

public class MountainArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,5,6,4,3,2};
        //int[] arr = {0,1,0};
        //int[] arr = {0,2,1,0};
        System.out.println(PeakIndexInMountainArray(arr));
    }

    static int PeakIndexInMountainArray(int[] arr){
        int start = 0;
        int end = arr.length - 1;

        while(start < end){
            int mid = start + (end - start) / 2;

            if(arr[mid] > arr[mid+1]){
                end = mid;
            }else{
                start = mid + 1;
            }
        }
        return start;
    }
}
