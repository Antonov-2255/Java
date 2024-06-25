import java.util.Random;
class RandomLetter 
{
    public static void main(String[] args)
    {
        Random randomG = new Random();
        String a = "BCDFGHJKLMNPQRSTVWXYZ";
        int length = 6; 

        String randomLetters = "";

        for (int i = 0; i < length; i++) {
            char randomChar = a.charAt(randomG.nextInt(a.length()));
            randomLetters += randomChar;
        }

        System.out.println("Random letters: " + randomLetters);
    }
}
