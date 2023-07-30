//Hollow rectrangle
package java_loops;
import java.util.Scanner;
public class java_starpatern2 {
    public static void main(String[] args) {
        Scanner obj= new Scanner(System.in);
        int a;
        int b;
        System.out.println("Enter number of rows:");
        a= obj.nextInt();
        System.out.println("Enter number of colloms:");
        b= obj.nextInt();
        for (int i=1;i<=a;i++){
            for (int j=1;j<=b;j++){
                if (i==1||i==a||j==1||j==b){
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }
}
