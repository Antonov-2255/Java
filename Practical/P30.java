abstract class detail
{
	abstract void Info();
}


class student extends detail
{
	void Info()
	{
		String name = "Ketan";
		int age = 18;
		float CGPA = 9.63f;

		System.out.println("student name is " + name);
		System.out.println("Student age is " +age);
		System.out.println("Student CGPA is " +CGPA);
	}
}


class main
{
	public static void main(String args[])
	{
		detail s = new student();
		s.Info();
	}
}
