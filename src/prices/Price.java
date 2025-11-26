import java.util.Scanner;

public class price {
    public static void main(String[] args) {
        Scanner mk = new Scanner(System.in);
        // display a string
        System.out.println("ENTER YOUR NAME:");
        String name = mk.nextLine();

        // Display prompts BEFORE reading input
        System.out.println("Enter the first price:");
        int price1 = mk.nextInt();

        System.out.println("Enter the second price:");
        int price2 = mk.nextInt();

        System.out.println("Enter the third price:");
        int price3 = mk.nextInt();

        System.out.println("Enter the fourth price:");
        int price4 = mk.nextInt();

        System.out.println("Enter the fifth price:");
        int price5 = mk.nextInt();

        int total = price1 + price2 + price3 + price4 + price5;
        int average = total / 5;

        System.out.println("The average price is: " + average);
        System.out.println("Total price is: " + total);

        mk.close();
    }
}
