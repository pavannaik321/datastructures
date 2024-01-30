// Search in Rotated Sorted Array
public class Leetcode33 {
    public static void main(String[] args) {
        //https://leetcode.com/problems/search-in-rotated-sorted-array/description/
        int nums[] = {4,5,6,7,0,1,2};
        int target = 5;
        int value = peak(nums,target);
        System.out.println(value);

        int index1 = firstIndex(nums, 0,value,target);
        if (index1==-1) {
            int index2 = firstIndex(nums, value+1,nums.length-1,target);
            System.out.println(index2);
        }
        System.out.println(index1);

        
    }

    //find pivote
    public static int peak(int[] nums, int target) {
        int low = 0;
        int high = nums.length-1;
        
        int mid=0;

        while (low <= high ){
            
            mid = (low + high)/2;

            //4 cases over here

            //case 1
            if ((mid < high) && (nums[mid]>nums[mid+1])){
                return mid;
            }
            //case 2
            if ((mid>low) &&(nums[mid]<nums[mid-1] )){
                return mid-1;
            }
            //case 3
            if(nums[mid]<=nums[low]){
                high = mid - 1;
            }
            else{
                low = mid + 1;
            }
        }
        
        // return index1;
        return -1;


    }


    // find element from first part

    public static int firstIndex(int nums[],int start , int end, int target){
        int first =start;
        int last = end;
        int mid1 = 0;
        int firstFound = -1;
        while(first <= last){
            mid1 = (first+last)/2;
            if (target < nums[mid1]) {
                last = mid1-1;
            }
            else if (target>nums[mid1]) {
                first = mid1 + 1;
            }
            else if(target==nums[mid1]){
                return mid1;
            }
        }
        return -1;
    }


    
}

