import java.util.Scanner;

public class isPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {

            int num = sc.nextInt();
            int count = 0;
            for (int j = 1; j <= num; j++) {
                if (num % j == 0) {
                    count++;
                }
            }
            if (count > 2) {
                System.out.println("notPrime");
            } else {
                System.out.println("prime");
            }
        }

    }
}