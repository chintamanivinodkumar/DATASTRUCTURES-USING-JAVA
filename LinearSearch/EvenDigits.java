public class EvenDigits {
    public static void main(String[] args) {
        int[] nums = {12,345,2,6,7896};
        System.out.println(findEvenDigitNumbers(nums));
    }

    static int findEvenDigitNumbers(int[]arr){

        int count =0;
        for(int num : arr){
            if(even(num)){
                count++;
            }
        }
        return count;
    }

    //Method to find whether a no. contains even digits or not
    static boolean even(int num){
        int numberOfDigits = digits(num);
        return numberOfDigits % 2 == 0;
    }

    static int digits(int num){

        if(num==0){
            return 1;
        }

        if(num < 0){
            return num * -1;
        }

        int count = 0;
        while(num > 0){
            count++;
            num = num / 10;
        }
        return count;
    }
}
