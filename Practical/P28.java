class Sum 
{
    static int sum1 = 10;
    static int sum2 = 10;
    
    public static void add(int number1, int number2 ) 
    {
        sum1 += number1;
        sum2 += number2;
    }

    public static int getSum() 
    {
        return sum1;
    }

    public static void main(String[] args) 
    {
        add(5, 7); 
        System.out.println("Current Sum: " + getSum());
    }
}
