//largest of three numbers
import java.util.Scanner;
public class NestedIf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number 1 :");
        int num1 = sc.nextInt();
        System.out.println("Enter numbere 2 :");
        int num2 = sc.nextInt();
        System.out.println("Enter number 3 :");
        int num3 = sc.nextInt();
        if(num1 > num2){
            if(num2 > num1){
                System.out.println("num1 is the largest ");

            }
        }else if(num3 > num2){
            if(num2 > num1){
                System.out.println("num3 is largest");
            }
        }else if(num2 > num1){
            if(num1 > num3){
                System.out.println("num2 is greatewr");
            }
        }
        sc.close();
    }
    
}
