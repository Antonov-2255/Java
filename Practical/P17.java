import java.util.Scanner;
class Method_Overloading
{  
static int add(int a,int b){return a+b;}  
static int add(int a,int b,int c){return a+b+c;}  
}  

class TestOverloading
{  
	 public static void main(String[] args)
	{
	 Scanner sc = new Scanner(System.in);
	 
	 System.out.println("Enter Value of A");
	 int a = sc.nextInt();
	 
	 System.out.println("Enter Value of b");
	 int b = sc.nextInt();
	 
	 System.out.println("Enter Value of c");
	 int c = sc.nextInt();
	 
	 System.out.println(Method_Overloading.add(a,b));  
	 System.out.println(Method_Overloading.add(a,b,c));  
	}
}  
