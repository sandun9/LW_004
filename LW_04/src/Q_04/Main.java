package Q_04;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner name=new Scanner(System.in);

        System.out.print("Please Enter the Year:");
        int year= name.nextInt();

        if ((year % 4==0 && year %400 !=0) || (year %400 ==0)){
            System.out.println("Leap year");
        }
        else {
            System.out.println("Not a Leap Year");
        }
        name.close();
    }
}
