import java.util.Scanner;
class Swap
{
    public static void main(String args[])
    {
        int a, b, c;
        Scanner s = new Scanner(System.in);
       
		System.out.print("Enter the first number:");
        a = s.nextInt();
        
		System.out.print("Enter the second number:");
		b = s.nextInt();
        
		c = a;
        a = b;
        b = c;
        
		System.out.println("After Swapping");
        System.out.println("First number:"+a);
        System.out.println("Second number:"+b);
    }
}