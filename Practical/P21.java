class X 
{
    void display() 
	{
        System.out.println("This is class X");
    }
}

class Y extends X 
{
    void show() 
	{
        System.out.println("This is class Y");
    }
}


class Inherit 
{
    public static void main(String[] args) 
	{

        X objX = new X();
		objX.display();


        Y objY = new Y();
		objY.display();

        objY.show();
    }
}
