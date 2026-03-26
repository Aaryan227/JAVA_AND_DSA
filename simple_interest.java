/* import java.util.Scanner;

public class simple_interest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();
        int j = scan.nextInt();
        int k = i + j;
            System.out.println(k);
          
    }
} */

import java.util.Scanner;

public class simple_interest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int p = scan.nextInt();
        int r = scan.nextInt();
        int t = scan.nextInt();
        int SI = (p * r * t) / 100;
        System.out.println(SI);
    }
}










