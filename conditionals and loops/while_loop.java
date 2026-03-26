import java.util.Scanner;

public class while_loop {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int i = 1;
        while(i <= a)
        {
            System.out.println(i);
            i = i + 1;
        }
    }
    
}
