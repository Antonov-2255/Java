import java.util.Scanner;
class LeapYear 
{
    public static void main(String[] args) 
    {
       Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a year: ");
        int year = scanner.nextInt();

        if (isLeap(year))
        {
            System.out.println(year + " is a leap year.");
        } else
        {
            System.out.println(year + " is not a leap year.");
        }
    }

    public static boolean isLeap(int year) 
    {
        return (year % 4 == 0 ) ;
    }
}
