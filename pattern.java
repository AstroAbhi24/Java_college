import java.util.Scanner;
class cls{
    public int i,j;
    void pattern_print(int n) {
        for (i = 1;i <= n; i++) {
            for (j = 1; j <=i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
public class pattern {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        cls c = new cls();
        c.pattern_print(n);
    }


}
