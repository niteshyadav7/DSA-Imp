import java.util.Scanner;

public class digitCount {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int num = scn.nextInt();
        int nod = 0;
        int temp = num;
        while (temp > 0) {
            temp = temp / 10;
            nod++;
        }
        int div = (int) Math.pow(10, nod - 1);
        while(div>0){
            int ans =num/div;
            System.out.println(ans);
            num=num%div;
            div=div/10;
        }
    }
}
