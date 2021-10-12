import java.util.Scanner;
import java.util.LinkedList;
import java.util.ArrayList;
import static java.lang.System.exit;

class Loan {
    LinkedList<Double> t1 = new LinkedList<>();
    ArrayList<Float> t2 = new ArrayList<>();
    ArrayList<Float> t3 = new ArrayList<>();

    public float income() {
        float xi;
        System.out.print("Enter Your Mothly Income=");
        Scanner sc = new Scanner(System.in);
        float x = sc.nextFloat();
        xi = x;
        float x8 = expense(x);
        xi = xi - x8;
        System.out.println("Remaning Income After Expense=" + xi);
        if (xi <= 0) {
            System.out.print("Sorry ! Insufficient Balance");
            exit(1);
        }

        System.out.println("-----------------------------------");
        sc.close();
        return xi;

    }

    public float expense(float x) {
        float x7 = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 7 to fill your monthly expense details:=");
        int x1 = sc.nextInt();
        if (x1 == 7) {
            System.out.print("Enter the Fooding Expense=");
            int x2 = sc.nextInt();
            if (x2 > x) {
                System.out.println("Sorry! You Dont Have Enough Balance ");
                exit(1);
            }
            t3.add((float) x2);
            System.out.print("Enter the Travelling Expense=");
            int x3 = sc.nextInt();
            if (x3 > x) {
                System.out.println("Sorry! You Dont Have Enough Balance ");
                exit(1);
            }
            t3.add((float) x3);

            System.out.print("Enter the Accomodation Expense=");
            int x4 = sc.nextInt();
            if (x4 > x) {
                System.out.println("Sorry! You Dont Have Enough Balance ");
                exit(1);
            }
            t3.add((float) x4);

            Float[] a2 = new Float[t3.size()];

            t3.toArray(a2);
            for (Float i : a2) {
                x7 = x7 + i;

            }
            System.out.println("-----------------------------------");
            System.out.print("Your Total Monthly Expense =" + x7 + "\n");
            System.out.println("-----------------------------------");
        } else {
            System.out.println("WRONG INPUT");
            System.exit(0);
        }
        sc.close();
        return x7;
    }

    public int Loan1() {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1 to see the types of loan available");

        int c = sc.nextInt();
        if (c == 1) {
            LinkedList<String> l = new LinkedList<>();
            l.add("PERSONAL LOAN");
            l.add("BUSINESS LOAN");
            l.add("HOME LOAN");
            l.add("GOLD LOAN");
            l.add("CAR LOAN");
            l.add("PERSONAL LOAN FOR SELF-EMPLOYED");
            System.out.println(l);
            System.out.println("-----------------------------------");
        }

        System.out.println("Choose the type of loan from the following");
        System.out.println("Press 1 for Personal Loan");
        System.out.println("Press 2 for Business Loan");
        System.out.println("Press 3 for Home Loan");
        System.out.println("Press 4 for Gold Loan");
        System.out.println("Press 5 for Car Loan");
        System.out.println("Press 6 for Personal Loan for Self-Employed.");

        System.out.print("Enter :");
        int temp = sc.nextInt();
        sc.close();
        return temp;

    }

    public int choose() {

        int t = Loan1();
        int x = 0;

        if (t == 1) {
            System.out.print("The intrest rate is ");
            x = 6;
            System.out.println(x);

        } else if (t == 2) {
            System.out.print("The intrest rate is ");
            x = 7;
            System.out.println(x);

        } else if (t == 3) {

            System.out.print("The intrest rate is ");
            x = 8;
            System.out.println(x);

        } else if (t == 4) {
            System.out.print("The intrest rate is ");
            x = 9;
            System.out.println(x);

        } else if (t == 5) {
            System.out.print("The intrest rate is ");
            x = 5;
            System.out.println(x);

        } else if (t == 6) {
            System.out.print("The intrest rate is ");
            x = 4;
            System.out.println(x);

        } else {
            System.out.println("Sorry you have not enter any number");
            exit(1);

        }
        return x;
    }

    public float amount() {
        System.out.print("Enter your amount for loan =");
        Scanner sc = new Scanner(System.in);
        float temp = sc.nextFloat();
        sc.close();
        return temp;

    }

    public int year() {

        System.out.print("Enter the years of loan =");
        Scanner sc = new Scanner(System.in);
        int temp = sc.nextInt();
        sc.close();
        return temp;
    }
}
