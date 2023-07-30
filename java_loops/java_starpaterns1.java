//Rectrangle patern....!!!!
package java_loops;
import java.util.Scanner;
public class java_starpaterns1 {
    public static void main(String[] args) {
        System.out.println("Enter value of a:");
        int b;
        int a;
        Scanner obj=new Scanner(System.in);
        a=obj.nextInt();
        System.out.println("Enter value of b:");
        b=obj.nextInt();
        //outer loop
        for (int i=0;i<a;i++){
            //inner loop
            for (int j=0;j<b;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
