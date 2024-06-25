import java.util.Scanner;

class WordCount 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a string:");
        String a = scanner.nextLine();

        a = a.trim();

        String[] words = a.split("\\s+");

        int wordCount = words.length;

        System.out.println("Number of words in the string: " + wordCount);
    }
}


