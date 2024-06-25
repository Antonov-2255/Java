import java.util.Scanner;
class Main
 {
   public static void main (String[]args)
   {
    
    Scanner scanner = new Scanner(System.in);
    
     int reverse = 0, rem, temp;
    
    System.out.print("Enter a Number: ");
    int num = scanner.nextInt();
    
       temp = num;

     while (temp != 0)
       {
     	rem = temp % 10;
     	reverse = reverse * 10 + rem;
     	temp /= 10;
       };

 
     if (num == reverse)
       System.out.println (num + " is Palindrome");
     else
       System.out.println (num + " is not Palindrome");
   }
 }