import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Double rent = 450.00;
        Double food = 0.50;
        Double clothing = 0.20;
        Double transport = 0.15;
        Double charity = 0.05;

        Double remainder;
        Double poketMoney;
        Double clothingRemainder;
        Double transportRemainder;
        Double charityRemaindr;
        Double remainderFood;
        Double totalSpent;

        Scanner input = new Scanner(System.in);
        System.out.print("enter salary R ");
        Double salary = input.nextDouble();

        remainder  = salary - rent;
        remainderFood = remainder  *food;
        clothingRemainder = remainder*clothing;
        transportRemainder = remainder*transport;
        charityRemaindr = remainder *charity;
        totalSpent = charityRemaindr + clothingRemainder+transportRemainder+remainderFood;
        poketMoney = remainder - totalSpent;

        System.out.println("the room money is R"+ rent);
        System.out.println("the after paying rent money is R"+ remainder);
        System.out.println("the food money is R"+ remainderFood);
        System.out.println("the clothing money is R"+ clothingRemainder);
        System.out.println("the transport money is R"+ transportRemainder);
        System.out.println("the charity money is R"+ charityRemaindr);
        System.out.println("the left money is R"+ totalSpent);
        System.out.println("the pocket money is R"+poketMoney);


        input.close();

    }
}