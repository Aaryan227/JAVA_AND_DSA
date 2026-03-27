import java.util.Scanner;

public class odd_even_check {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        
        if (n % 2 == 0) {
            System.out.println("no is a even number");
        } else {
            System.out.println("no is an odd number");
        }
    }
    
}
