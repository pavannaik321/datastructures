import java.util.*;

public class RowColumnMatrix {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            boolean not_found = false;
            int arry[][] = {
                    { 10, 20, 30, 40 },
                    { 15, 25, 35, 45 },
                    { 28, 29, 37, 49 },
            };

            System.out.println("enter the target element");
            int target = sc.nextInt();
            int col = arry.length;
            int row = 0;
                while ((row <=arry.length+1) && (col >= 0)) {
                    if (arry[row][col] == target) {
                        System.out.println("element is found on index " + row + " " + col);
                        not_found = true;
                        break;
                    }
                    else if (arry[row][col]<target) {
                        row++;
                    }
                    else if(arry[row][col]>target){
                        col--;
                    }
                }

            if (!not_found) {
                System.out.println("element not found");
            }

        }

    }
}
