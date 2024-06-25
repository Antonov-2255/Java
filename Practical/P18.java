class Student 
{
   public void displayInfo() 
   {
      System.out.println("My Name is Ketan");
   }
}

class Spi extends Student 
{
   public void displayInfo() 
   {
      System.out.println("I got 9.83 SPI");
   }
}

class Main 
{
   public static void main(String[] args) 
   {
      Student sc = new Spi();
      sc.displayInfo();
   }
}
