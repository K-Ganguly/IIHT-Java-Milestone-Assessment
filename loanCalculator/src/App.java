import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        System.out.println("MENU:");
        System.out.println("-----------------------------------");
        Scanner sc = new Scanner(System.in);

        System.out.println("Choose 1 To Find Loan");
        System.out.println("Choose 3 To Exit");
        System.out.println("-----------------------------------");
        System.out.print("Enter:=");
        int x = sc.nextInt();

        if (x == 1) {
            Execute t1 = new Execute();
            t1.emi_calculator();
        } else if (x == 3) {
            char ch1 = 'Y';
            char ch2 = 'N';
            System.out.println("Are You Sure You Want TO EXIT");
            System.out.println("Press Y For Yes");
            System.out.println("Press N For No");
            System.out.print("Enter:=");
            char y = sc.next().charAt(0);
            char ch = Character.toUpperCase(y);
            if (ch == ch1) {
                System.exit(0);
            } else if (ch == ch2) {
                Execute t1 = new Execute();
                t1.emi_calculator();
            }

        }
        sc.close();
    }
}
