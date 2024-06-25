interface gujarat
    {  
		void print();  
    }  
    
interface rajkot
    {
		void show();  
    }  
    
class surat implements gujarat,rajkot
    {  
		public void print()
		{
			System.out.println("Welcome to");
		}  
		public void show()
		{
			System.out.println("Gujarat");
		}  
      
public static void main(String args[])
		{  
			surat diamond = new surat();  
			diamond.print();  
			diamond.show();  
		}  
    }  