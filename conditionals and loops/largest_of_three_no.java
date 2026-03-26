import java.util.Scanner;

public class largest_of_three_no {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        int c = s.nextInt();
        if (a >= b && a >= c) {
            System.out.println(a + " is the largest no");

        } else {
            if (b >= a && b >= c) {
                System.out.println(b + " is the largest no");
            } else {
                System.out.println(c + " is the largest number");
            }
        } 
    }
    
}
