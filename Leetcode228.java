public class Leetcode228 {
    public static void main(String[] args) {
        int nums[] = { 0, 1, 2, 4, 5, 7 };
        String temp[] = new String[nums.length];
        int i = 0;
        int k = 0;
        int mohra = 0;
        for (int j = 0; j < nums.length; ++j) {
            if ((nums[i] + (mohra)) != nums[j]) {
                temp[k++] = nums[i++] + "->" + nums[j - 1];
                i = j;
                mohra = 0;
            } else if (j == nums.length - 1) {
                temp[k] = nums[i] + "->" + nums[j];
            } else {
                mohra++;
            }
        }

        for (int t = 0; t < k; t++) {
            System.out.println(temp[t]);
        }
    }
}