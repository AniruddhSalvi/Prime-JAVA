import java.util.*;
public class prime {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();

        if(n == 2){
            System.out.println("Prime");
        }  else {
            boolean isPrime = true;
            for(int i =2; i < n-1; i++) {
                if(n % i == 0){
                    isPrime = false;
                }
            }
            if(isPrime == true) {
                System.out.println("number is Prime");
            } else {
                System.out.println("number is not Prime");
            }
        }
    }
    
}
