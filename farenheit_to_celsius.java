import java.util.Scanner;

public class farenheit_to_celsius {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int f = scan.nextInt();
        int cel = (5 * (f - 32)) / 9;
        System.out.println(cel);
    }
}  