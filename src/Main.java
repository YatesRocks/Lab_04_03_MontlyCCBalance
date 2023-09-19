public class Main {
    public static void main(String[] args) {
        double startingDebt = 5000;
        double monthlyInterest = 1.17;
        System.out.println("Your starting debt is $" + startingDebt
                 + " with a monthly interest of " + monthlyInterest + "%");
        double monthOne = startingDebt * monthlyInterest;
        System.out.println("After one month the debt due is now: $" + monthOne);
        System.out.println("That is $" + (monthOne - startingDebt) + " more than last month.");
        double monthTwo = monthOne * monthlyInterest;
        System.out.println("After two months the debt due is now: $" + monthTwo);
        System.out.println("That is $" + (monthTwo - monthOne) + " more than last month.");
        System.out.println("Hello world!");
    }
}