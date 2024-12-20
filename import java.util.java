import java.util.Scanner;

public class NumberCounter {
    public static void main(final String[] args) {
        final Scanner scanner = new Scanner(System.in);
        
        int count = 0;
        int sum = 0;
        
        while (true) {
            System.out.println("Give a number:");
            final int number = scanner.nextInt();
            
            if (number == 0) {
                break;
            }
            
            count++;
            sum += number;
        }
        
        System.out.println("Number of numbers: " + count);
        System.out.println("Sum of the numbers: " + sum);
    }
}
