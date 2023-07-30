//half pyramid
package java_loops;
import java.util.Scanner;
public class java_starpaterns3 {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        int a;
        System.out.println("Enter number of rows:");
        a= obj.nextInt();
        //outer loop
        System.out.println("The star pattern is as follow: ");
        for (int i=1;i<=a;i++){
            //inner loop
            for (int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
