
import java.util.*;
public class Leetcode9 {

    public static void main(String[] args) {
        int x ;
        System.out.println("enter a number : ");
        Scanner sc  =  new Scanner (System.in);
        x = sc.nextInt();
        System.out.println("number : "+x);

           boolean flag =  isPalindrome(x);

        System.out.println("Flag : " + flag);

        

    }
    public static boolean isPalindrome(int x) {
        int temp , rem , newrem = 0;
        temp  = x;

            rem = temp % 10;
            newrem = (newrem*10) + rem;
            temp = temp/10;
        
        
        if (x == 0){
            return false;
        }
        
        isPalindrome(x/10);

        if(newrem==x){
            return true;
        }
        return false;
    }
}