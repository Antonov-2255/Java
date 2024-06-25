import java.io.FileInputStream;
import java.io.FileOutputStream;

class Student 
{

    public static void main(String[] args) 
	{
        System.out.println("Writing Data in File");

        try 
		{
            FileOutputStream fileout = new FileOutputStream("C:/Users/ketan/OneDrive/Desktop/MU/Semester-4/Java/Practical/t3.txt");
            String str = "Name: Ketan, Stream: Computer Engineering, Sem: 4th Sem,  Roll: 92200938121 ";
            byte a[] = str.getBytes();
            fileout.write(a);
            fileout.close();
            System.out.println("successful write.");
        } 
		
		catch (Exception e) 
		{
            System.out.println(e);
        }

        System.out.println("Retrive Data From File");

        try
		{
            FileInputStream filein = new FileInputStream("C:/Users/ketan/OneDrive/Desktop/MU/Semester-4/Java/Practical/t3.txt");
            int i = 0;
            while ((i = filein.read()) != -1) 
			{
                System.out.print((char) i);
            }
            filein.close();
        } 
		
		catch (Exception e) 
		{
            System.out.println(e);
        }
    }
}
