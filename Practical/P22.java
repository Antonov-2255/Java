
interface Language 
{
  void Name();
}


class Programming implements Language 
{


  public void Name() 
  {
    System.out.println("Programming Language is Java ");
  }
}

class Main 
{
  public static void main(String[] args) 
  {
    Programming language = new Programming();
    language.Name();
  }
}
