class Student
{
    void Information() 
    {
        System.out.println("My Name is Ketan Mehta");
    }
}

class Result extends Student 
{
    void Performance() 
    {
        System.out.println("My Overall CGPA is 9.63");
    }
}

class Inheritance 
{
    public static void main(String[] args) 
    {
        Result myResult = new Result();
        myResult.Information();
        myResult.Performance();
        
    }
}


// 19.1 // 

class Student_Information1 
{
    void detail1() 
    {
        System.out.println("My Name is Ketan Mehta");
    }
}

class Student_Information2 extends Student_Information1 
{
    void detail2() 
    {
        System.out.println("I am From Varanasi, UP");
    }
}

class Student_Information3 extends Student_Information2 
{
    void detail3() 
    {
        System.out.println("I am Interested in New Technologies");
    }
}

class TestInheritance 
{
    public static void main(String[] args) 
    {
        Student_Information3 myStudent_Information3 = new Student_Information3();
        
        myStudent_Information3.detail1();
        myStudent_Information3.detail2();
        myStudent_Information3.detail3();
    }
}
