import java.util.Random;

class breakfast {
    public static void main(String[] args) 
    {
        String[] breakfastChoices = {"scrambled eggs", "waffles", "fruit", "cereal", "toast", "yogurt"};

        Random random = new Random();
        
        int randomIndex = random.nextInt(breakfastChoices.length);

        System.out.println("Today's breakfast choice is: " + breakfastChoices[randomIndex]);
    }

    
}
