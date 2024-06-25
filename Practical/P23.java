class Faculty
{
    void information() 
    {
        System.out.println("Faculty Name is Rushi Sir");
    }
}

class Student extends Faculty
{
    void information() 
    {
        super.information();
        System.out.println("Student name is Ketan Mehta");
    }
}

class SuperKeyword 
{
    public static void main(String[] args) 
    {
        Student myStudent = new Student();

        myStudent.information();
    }
}
