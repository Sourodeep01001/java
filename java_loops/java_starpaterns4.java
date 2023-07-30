//reverse half pyramid
package java_loops;
import java.util.Scanner;
public class java_starpaterns4 {
    public static void main(String[] args) {
        System.out.println("Hallow java");
        Scanner obj=new Scanner(System.in);
        int a;
        System.out.println("Enter rows of star pattern:");
        a= obj.nextInt();
        for (int i=a;i>=1;i--){
            for (int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
