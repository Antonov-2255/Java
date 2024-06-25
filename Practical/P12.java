import java.util.Scanner;

class Main 
{

  public static void main(String[] args) 
  {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter a text: ");
    String a = scanner.nextLine();

    int vowels = 0, consonants = 0;

    for (int i = 0; i < a.length(); ++i) 
    {
      char ch = a.charAt(i);

      if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') 
      {
        vowels++;
        
      } else if ((ch >= 'a' && ch <= 'z')) 
      {
        consonants++;
      }
    }

    System.out.println("Vowels: " + vowels);
    System.out.println("Consonants: " + consonants);

  }
}
