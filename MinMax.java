import java.util.Random;

public class MinMax {
    public static void main(String[] args) {
        Random random = new Random();

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < 5; i++) {
            int num = random.nextInt(900) + 100; // Generate 3-digit number
            System.out.println("Generated number: " + num);

            if (num < min) {
                min = num;
            }
            if (num > max) {
                max = num;
            }
        }

        System.out.println("Minimum value: " + min);
        System.out.println("Maximum value: " + max);
    }
}
