package Q_02;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.println("0.Megenta");
        System.out.println("1.Cyan");
        System.out.println("2.Red");
        System.out.println("3.Blue");
        System.out.println("4.Green");
        System.out.println("Select the one color in the above:");

        int selection= input.nextInt();

        switch (selection){
            case 0:
                System.out.println("you Selected Megenta");
                break;
            case 1:
                System.out.println("you Selected Cyan");
                break;

            case 2:
                System.out.println("you selected Red");
                break;
            case 3:
                System.out.println("you selected Blue");
                break;
            case 4:
                System.out.println("you slected Green");
                break;
            default:
                System.out.println("you enter invalid number");

        }

    input.close();
    }

}
