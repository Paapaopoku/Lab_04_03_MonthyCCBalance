public class Main
{
    public static void main(String[] args)
    {
        double creditBalance = 5000;
        double interestRate = 0.17;
        double interestDue = 0;
        double interestDue2 = 0;

        interestDue = interestRate * creditBalance + creditBalance;
        interestDue2 = interestRate * interestDue + interestDue;

        System.out.println("The interest due after one month is " + interestDue);
        System.out.println("The interest due after two months is " + interestDue2);
    }
}