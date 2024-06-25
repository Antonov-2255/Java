import java.util.Scanner;

class StringLength 
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String a = scanner.nextLine();

        int len = a.length();
        int halfLen = len / 2;

        System.out.printf("Second half of the string: %s\n", a.substring(halfLen));
        System.out.printf("Length of the string: %d\n", len);
    }
}