import java.util.Scanner;
class asciivalue
{
	public static void main(String[] args)
	{
		Scanner obj = new Scanner(System.in);
		System.out.print("Enter A character: ");
		char inputchar = obj.next().charAt(0);
		int Asciivalue = (int) inputchar;
		System.out.println("The Ascii value of" + inputchar + "is" + Asciivalue);
	}
}