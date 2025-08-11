public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 2, 8, 9, 12, 46, 76, 82, 15, 20, 30};

        int[] counts = new int[9];  

        for (int i = 1; i <= 9; i++) {
            int count = 0;
            for (int num : arr) {
                if (num % i == 0) {
                    count++;
                }
            }
            counts[i - 1] = count; 
        }

        
        System.out.print("{");
        for (int i = 1; i <= 9; i++) {
            System.out.print(i + ": " + counts[i - 1]);
            if (i < 9) {
                System.out.print(", ");
            }
        }
        System.out.println("}");
    }
}
