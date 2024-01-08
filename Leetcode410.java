public class Leetcode410 {
    public static void main(String[] args) {
        int array[] = {1,2,3,4,5};
        int key = 2;
        int value = splitArray(array, key);
        System.out.println(value);
    }

    public static int splitArray(int[] nums , int k){
        int max = 0 , min = 0;
        for (int i : nums) {
            if (i>min) {
                min = i;
            }
            max = max + i;
        }
        while (min<max) {
            int mid = (min+max)/2;
            int peice = 1;
            int sum = 0;

            //make peices
            for (int ele : nums) {
                sum = sum + ele;
                if (sum > mid) {
                    peice++;
                    sum = ele;
                }
            }

            if (peice<=k) {
                max = mid;
            }
            else{
                min = mid+1;
            }
        }
        return min;
    }
}
