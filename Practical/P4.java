class Operator 
{
    public static void main(String[] args) 
	{
       
        boolean a = true; boolean b = false;
        System.out.println("Logical AND: " + (a && b));
        System.out.println("Logical OR: " + (a || b));
        System.out.println("Logical NOT: " + (!a));

        
        int x = 5; int y = 3; 
        System.out.println("Bitwise AND: " + (x & y)); 
        System.out.println("Bitwise OR: " + (x | y)); 
        System.out.println("Bitwise XOR: " + (x ^ y)); 
        System.out.println("Bitwise NOT: " + (~x)); 

        
        int number1 = 10; int number2 = 30;
        String result = (number1 > number2) ? "number1" : "number2";
        System.out.println("Conditional Operator: " + result);

        
        int num1 = 10; int num2 = 20;
        System.out.println("Equal to: " + (num1 == num2));
        System.out.println("Not equal to: " + (num1 != num2));
        System.out.println("Greater than: " + (num1 > num2));
        System.out.println("Less than: " + (num1 < num2));
        System.out.println("Greater than or equal to: " + (num1 >= num2));
        System.out.println("Less than or equal to: " + (num1 <= num2));

        
        int count = 5;
        System.out.println("Original value: " + count);
        count++; 
        System.out.println("After increment: " + count);
        count--;
        System.out.println("After decrement: " + count);

      
        int resultPriority = 5 + 3 * 2; 
        System.out.println("Result with priority: " + resultPriority);
    }
}
