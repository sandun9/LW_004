package Q_03;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.print("Enter the power of 10 (ex:6,9,12..):");
        int power= input.nextInt();

        switch(power){
            case 6:
                System.out.println("Milion");
                break;
            case 9:
                System.out.println("Bilion");
                break;
            case 12:
                System.out.println("Trilion");
                break;
            case 15:
                System.out.println("Quadrilion");
                break;
            case 18:
                System.out.println("Quintillion");
                break;
            case 21:
                System.out.println("Sextillion");
                break;
            case 30:
                System.out.println("Nonillion");
                break;
            case 100:
                System.out.println("Googol");
                break;
            default:
                System.out.println("NO known name");


        }
        input.close();

    }
}
