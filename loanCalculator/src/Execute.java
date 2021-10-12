import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

class Execute extends Loan {
    Loan obj1 = new Loan();
    float p = obj1.income();

    public void emi_calculator() {

        double x = 0.0;
        double x1 = 0.0;
        double emi;

        try {

            float r = choose();
            float p1 = amount();
            float y = year();

            r = r / (12 * 100);
            y = y * 12;

            emi = (p1 * r * Math.pow(1 + r, y)) / (Math.pow(1 + r, y) - 1);

            p *= 0.3;

            if (emi <= p) {

                System.out.println("-----------------------------------");

                t1.add(emi);
                Scanner sc = new Scanner(System.in);
                int q;

                t2.add(p1);

                System.out.println("Your Current Issued Loan is = " + t2 + "\n");
                System.out.println("-----------------------------------");

                System.out.print("Enter 2 to see your EMI based on Loan:");

                q = sc.nextInt();

                if (q == 2) {
                    System.out.println("You Current EMI Based On Loan is =" + " " + emi + "\n");

                    System.out.println("Your Total EMI is= " + t1 + "\n");
                } else {
                    System.exit(0);
                }

                System.out.println("-----------------------------------");

                List<Double> U = new ArrayList<>(t1);

                Double[] a = new Double[U.size()];
                U.toArray(a);

                List<Float> U1 = new ArrayList<>(t2);

                Float[] a1 = new Float[U1.size()];

                U1.toArray(a1);

                for (Double i : a) {
                    x = x + i;
                }
                for (Float i : a1) {
                    x1 = x1 + i;
                }
                System.out.print("TOTAL LOAN =" + x1 + "\n");

                System.out.println("Enter 9 to take more Loan ");
                System.out.print("Enter 10 to exit\n");
                System.out.print("Enter =");
                int v = sc.nextInt();
                if (v == 9) {

                    if (x <= p1) {
                        emi_calculator();
                    } else {
                        System.out.println(
                                "Sorry you are exceeding the 30 percent of your income hence no  loan is allowed");
                        System.out.print("The loan issued to you on the basis of your income ===>\n" + t2);

                    }
                } else {
                    System.out.print("EXIT \n");
                    System.out.print("LOAN ISSUED =" + t2 + "\n");
                    System.out.print("Thank You!");
                }
                sc.close();
            } else {
                System.out
                        .println("Sorry you are exceeding the 30 percent of your income hence no more loan is allowed");

            }

        } catch (ArithmeticException e) {
            e.printStackTrace();
        }

    }
}