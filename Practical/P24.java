class Student 
{
    private float cgpa;
   
    public float getcgpa() 
    {
        return cgpa;
    }

    public void setcgpa(float cgpa) 
    {
        this.cgpa = cgpa;
    }
}

class Main 
{
    public static void main(String[] args) 
    {
        Student s1 = new Student();

        s1.setcgpa(9.63f);

        System.out.println("My CGPA is " + s1.getcgpa());
    }
}
