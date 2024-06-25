import java.util.Scanner;

class Student 
{
    String name;
    String enrollment;
    double SPGI;
    String city;
    String branch;

    public Student()
    {
        name = "";
        enrollment = ""; 
        SPGI = 0.0;
        city = "";
        branch = "";
    }

    public void get() 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name of the student: ");
        name = sc.nextLine();
        System.out.println("Enter the enrollment number of the student: ");
        enrollment = Integer.toString(sc.nextInt());
        System.out.println("Enter the SPI of the student: ");
        SPGI = sc.nextDouble();
        sc.nextLine();
        System.out.println("Enter the city of the student: ");
        city = sc.nextLine();
        System.out.println("Enter the branch of the student: ");
        branch = sc.nextLine();
        sc.close();
    }


    public void disp() 
    {
        System.out.println("Name of the student is: " + name);
        System.out.println("Enrollment number of the student is: " + enrollment);
        System.out.println("SPI of the student is: " + SPGI);
        System.out.println("City of the student is: " + city);
        System.out.println("Branch of the student is: " + branch);
    }

    public static void main(String[] args)
    {
        Student student = new Student();
        student.get();
        student.disp();
    }    
}