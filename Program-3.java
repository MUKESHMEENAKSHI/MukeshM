import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();

        
        if (a % 2 == 0) {
            a = a - 1;
        }

    
        for (int i = 1, count = 0; count < a; i += 2, count++) {
            System.out.print(i);
            if (count < a - 1) {
                System.out.print(", ");
            }
        }
    }
}
