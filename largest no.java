import java.util.Scanner;
class LargestArray 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();

        int[] arr = new int[size];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) 
		{
            System.out.print("Element " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
        }

        int max = arr[0];

        for (int i = 0; i < arr.length; i++) 
		{
      
            if (arr[i] > max)
                max = arr[i];
        }

        System.out.println("Largest element in the array: " + max);

    }
}
