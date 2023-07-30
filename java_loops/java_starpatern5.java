package java_loops;
import java.util.Scanner;
public class java_starpatern5 {
    public static void main(String[] args) {
        System.out.println("Hallow java");
        Scanner obj=new Scanner(System.in);
        int a;
        System.out.println("Enter rows of inverted half pyramid:");
        a= obj.nextInt();
        //outer loop ->rows print
        for(int i=1;i<=a;i++){
            //inner loop ->space print
            for (int j=a;j>i;j++){
                System.out.print("");
                //2nd inner loop ->star print
                for (j=1;j<=i;j++){
                    System.out.println("*");
                }
                System.out.println();
            }
        }
    }
}
