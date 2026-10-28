import java.util.Scanner;
public class KafeDoWhile12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int coffee; int tea; int breads;
        String customerName; String coffeePrice; String teaPrice; String breadPrice;
        coffeePrice = "12000";
        teaPrice = "7000";
        breadPrice = "20000";

    do {
        System.out.print("Enter customer name (type 'cancel' to exit): ");
        customerName = sc.nextLine();
        if (customerName.equalsIgnoreCase("cancel")) {
            System.out.println("Transaction canceled.");
            break;
        }
        System.out.print("Number of coffees: ");
        coffee = sc.nextInt();
        System.out.print("Number of teas: ");
        tea = sc.nextInt();
        System.out.print("Number of breads: ");
        breads = sc.nextInt();

        int totalPrice = (coffee * Integer.parseInt(coffeePrice)) + (tea * Integer.parseInt(teaPrice)) + (breads * Integer.parseInt(breadPrice));
        System.out.println("Total to be paid: Rp " + totalPrice);
        sc.nextLine();
     } while ( true );
     System.out.println("All transactions completed.");
    }
    }
    
