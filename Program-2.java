import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.print("Enter a number: ");
        int a = sc.nextInt();

        int number = 1; 

        System.out.print("Output: ");
        for (int i = 1; i <= a; i++) {
            System.out.print(number);
            if (i < a) {
                System.out.print(", ");
            }
            number += 2; 
        }
    }
}
