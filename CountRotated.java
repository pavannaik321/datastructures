public class CountRotated {
    public static void main(String[] args) {
        int arr[] = {15,18,2,3,6,12};
        int val = peak(arr);
        //peak is on
        System.out.println("peak value : " + val);
        if (val!=arr.length-1) {
            System.out.println("No of rotation : " + (val +1));
        }
        
    }

    public static int peak(int arr[]){
        int low = 0;
        int high = arr.length-1;
        int mid =0;
        while (low <= high) {
            mid = (low+high)/2;

            //case 1
            if (mid>low && arr[mid]<arr[mid-1]) {
                return mid-1;
            }
            //case 2
            if (mid<high && arr[mid]>arr[mid+1]) {
                return mid;
            }           

            //case 3
            if (arr[mid]>arr[low]) {
                high = mid - 1;
            }
            else{
                low = mid +1;
            }
        }
        return -1;
    }
}
