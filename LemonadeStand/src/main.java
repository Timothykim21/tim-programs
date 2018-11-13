import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        int numLemonade;
        int numSnacks;
        double cost;
        double pay;
        double change;

        //Scanner scan = new Scanner(System.in);

        numLemonade = UserInput.getInteger("How many cups?");
        numSnacks = UserInput.getInteger("How many snacks?");

        cost = numLemonade * 1.25+ numSnacks*1.50;
        System.out.println("total cost is "+ cost);

        pay = UserInput.getDouble("Enter pay:");
        change = pay - cost;
        if(change > 0) {
            System.out.println("your change is: " + change);
        }
        if(change < 0){
            System.out.println("you are short " + change * -1  );
        }


    }
}
