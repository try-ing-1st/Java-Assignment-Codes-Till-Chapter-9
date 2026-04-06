import java.util.Scanner;

public class AnalyzeNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size;
        System.out.print("Enter the size of the array: ");
        size = sc.nextInt();
        int[] numbers = new int[size];
        System.out.println("Enter the numbers:");
        for (int i = 0, n = numbers.length; i < n; i++) {
            numbers[i] = sc.nextInt();
        }
        int sum = 0;
        for (int i = 0, n = numbers.length; i < n; i++) {
            sum += numbers[i];
        }
        int count = 0;
        double average = (double) sum / numbers.length;
        for (int i = 0, n = numbers.length; i < n; i++) {
            if (numbers[i] > average) {
                count++;
            }
        }
        System.out.println("Average: " + average);
        System.out.println("Count of numbers greater than average: " + count);
    }
}