package Q_05;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        //entire menu
        System.out.println("Entire Menu:");
        System.out.println("01.Tofu Burger- $3.49");
        System.out.println("02.Cajun Chicken- $4.59");
        System.out.println("03.Buffalo Wings- $3.99");
        System.out.println("04.Rainbow Fillet- $2.99");
        System.out.println("Enter the number of your Entire Menu:");
        int Entirechoos = input.nextInt();

        //Desh menu
        System.out.println("01.Rice Cracker- $0.79");
        System.out.println("02.No Salt Fries- $0.69");
        System.out.println("03.Zucchini- $1.09");
        System.out.println("04.Brown Rice- $0.59");
        int Deshmenu= input.nextInt();

        //Drink
        System.out.println("01.Cafe Mocha- $1.99");
        System.out.println("02.Cafe Latte- $1.90");
        System.out.println("03.Espresso- $2.49");
        System.out.println("04.Oolong Tea $0.99");
        int Drink= input.nextInt();

        //Decliyer variable to store slect item and price
        String entire=" ",side=" ",drink=" ";
        double entireprice=0.0,sideprice=0.0,drinkprice=0.0;

        switch (Entirechoos){
            case 1:entire="Tofu Burger";entireprice=3.49;break;
            case 2:entire="Cajun Chicken";entireprice=4.59;break;
            case 3:entire="Buffalo Wings";entireprice=3.99;break;
            case 4:entire="Rainbow Fillet";entireprice=2.99;break;
            default:
                System.out.println("Invalid Enter choos");
                return;
        }

        switch (Deshmenu){
            case 1:side="Rice Cracker";sideprice=0.79;break;
            case 2:side="No-Salt Fries";sideprice=0.69;break;
            case 3:side="Zucchini";sideprice=1.09;break;
            case 4:side="Brown Rice";sideprice=0.59;break;
            default:
                System.out.println("Invalid Entire choos");
                return;


        }
        switch (Drink){
            case 1:side="Cafe Mocha";drinkprice=1.99;break;
            case 2:side="Cafe Latte";drinkprice=1.90;break;
            case 3:side="Espresso";drinkprice=2.49;break;
            case 4:side="Oolong Tea";drinkprice=0.99;break;
            default:
                System.out.println("Invalid Entire choos");
                return;
        }

        double total=entireprice+sideprice+drinkprice;

        System.out.println("-------Oder summery---------");
        System.out.printf("Entree: %s - $%.2f \n",entire,entireprice);
        System.out.printf("Entree: %s - $%.2f \n",side,sideprice);
        System.out.printf("Entree: %s - $%.2f \n",drink,drinkprice);
        System.out.printf("Total: $%.2f \n",total);









    }
}
