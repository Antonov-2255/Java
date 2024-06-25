import java.util.Scanner;

class CharStr 
{
    public static void main(String[] args) 
	{
        int n = 0;
        Scanner obj = new Scanner(System.in);
        System.out.println("How many characters to enter?");
        n = obj.nextInt();
        char ch[] = new char[n];
        
        for (int i = 0; i < n; i++) {
            System.out.println("Enter char no." + (i + 1));
            ch[i] = obj.next().charAt(0);
        }

        String st = String.valueOf(ch);
        System.out.println("Combined characters are: " + st);
    }
}
