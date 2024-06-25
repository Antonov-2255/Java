interface P 
{
    int a = 10;
    void pMethod();
}

interface P1 extends P 
{
    final int b = 20; 
    void p1Method();
}

interface P2 extends P 
{
    final int c = 30;  
    void p2Method();
}

interface P12 extends P1, P2 
{
    int d = 40;
    void p12Method();
}

class Q implements P12 
{

    public void pMethod() 
	{
        System.out.println("pMethod: " + a);
    }

    public void p1Method() 
	{
        System.out.println("p1Method: " +b);
    }

    public void p2Method() 
	{
        System.out.println("p2Method: " + c);
    }

    public void p12Method() 
	{
        System.out.println("p12Method: " + d);
    }
}

class Main
 {
    public static void main(String[] args) 
	{

        Q sc = new Q();

        sc.pMethod();
        sc.p1Method();
        sc.p2Method();
        sc.p12Method();
    }
}
