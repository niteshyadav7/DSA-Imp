import java.util.Scanner;
public class BaseModal_IMP_pattern06 {
    public static void main(String[] args) {
        Scanner sc =new Scanner (System.in);
        int n =sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=2*i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
