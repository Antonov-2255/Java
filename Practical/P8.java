import java.util.Scanner;

class Percentage
{
public static void main(String args[])
{
    float os, se, co, java, wt, maths;  
    double total, percentage;
    
    Scanner op=new Scanner(System.in);
	
    System.out.println("Enter marks of six subjects:");
    
    System.out.print("Enter marks of OS subjects:");
    os=op.nextFloat();
    
    System.out.print("Enter marks of SE subjects:");
    se=op.nextFloat();
    
    System.out.print("Enter marks of CO subjects:");
    co=op.nextFloat();
    
    System.out.print("Enter marks of Java subjects:");
    java=op.nextFloat();
    
    System.out.print("Enter marks of WT subjects:");
    wt=op.nextFloat();
    
    System.out.print("Enter marks of Maths subjects:");
    maths=op.nextFloat();

    total = os + se + co + wt + maths + java;
    percentage = (total / 600) * 100;

    System.out.println("Total marks ="+total);
    System.out.println("Percentage = "+percentage);

   }
}
