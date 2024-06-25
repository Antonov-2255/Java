import java.util.Scanner;

class conversion 
{

	public static void main(String[] args) 
	{

		float rupees;

		Scanner in = new Scanner(System.in);

		System.out.println("Enter Amount In INR:");

		rupees = in.nextFloat();

		float dollars = rupees / 83.22f;
        System.out.println(String.format("Amount In Dollar%.2f", dollars)); 

	}
}
