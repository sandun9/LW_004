package Q_01;
import java.util.Scanner;

public class SmallestNumber {
      public static void main(String[] args) {
        Scanner input =new Scanner(System.in);

        System.out.println("Enter the First Number:");
        int a=input.nextInt();

        System.out.println("Enter your Secound Number:");
        int b = input.nextInt();;

        System.out.println("Enter your Therd Number:");
        int c= input.nextInt();

        int smallest;


        //find the smallest number

        if(a<=b && a <=c){
            smallest=a;
        } else if (b <= c && b <= a) {
            smallest =b;

        }
        else {
            smallest=c;
        }
        System.out.println("smallest number is :"+smallest);

        input.close();
    }

}
