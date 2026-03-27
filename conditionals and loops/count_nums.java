public class count_nums {
    public static void main(String[] args) {
        int i = 45535;
        int count = 0;
        while (i > 0) {
            int rem = i % 10;
            if (rem == 5) {
                count += 1;
            }
            i = i / 10;
        }
        System.out.println(count);
    }
    
}
