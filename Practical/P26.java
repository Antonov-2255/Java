class game
{
   public void displayInfo() 
   {
      System.out.println("I have GTA V");
   }
}

class GTAV extends game
{
   public void displayInfo() 
   {
      System.out.println("I got 10 Million in GTA-V");
   }
}

class Main 
{
   public static void main(String[] args) 
   {
      game sc = new GTAV();
      sc.displayInfo();
   }
}
