public class Sorted2D {
    public static void main(String[] args) {
        int array[][] = {
                { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 },
                { 13, 14, 15, 16 }
        };


        int target = 0 ;
        boolean notfound = true;

        int row_start = 0 , row_end = array.length-1 , column_start = 0 , column_end = array[0].length-1 , column_mid,row_mid;
        
        while ((row_end - row_start)!=1) {
            row_mid = (row_start + row_end)/2;
            column_mid = (column_start + column_end)/2;
            if (target==array[row_mid][column_mid]) {
                System.out.println("element found at index : " + row_mid + " " + column_mid);
                notfound = false;
                break;
            }
            else if (target>array[row_mid][column_mid]) {
                row_start = row_mid; 
            }
            else{
                row_end = row_mid;
            }
        }

        // do binary search for remaining
        // coping data in another variable just it should not get lost
        int column_start1 = column_start;
        int column_end1 = column_end;

        if (notfound) {
            while (column_start<=column_end) {
            column_mid = (column_start+column_end)/2;

            if (target==array[row_start][column_mid]) {
                System.out.println("element found at index : " + row_start + " " + column_mid);
                notfound = false;
                break;
            }
            else if (target>array[row_start][column_mid]) {
                column_start = column_mid+1; 
            }
            else{
                column_end = column_mid-1;
            }
            
        }
        }
        

        // second binary search 
        if (notfound) {
            
            while (column_start1<=column_end1) {
                column_mid = (column_start1+column_end1)/2;
                
                if (target==array[row_end][column_mid]) {
                    System.out.println("element found at index : " + row_end + " " + column_mid);
                    notfound = false;
                    break;
                }
                else if (target>array[row_end][column_mid]) {
                    column_start1 = column_mid+1; 
                }
                else{
                    column_end1 = column_mid-1;
                }
                
            }
        }

        if (notfound) {
            System.out.println("element not found");
        }
    }
}