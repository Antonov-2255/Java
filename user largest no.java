class LargestArray 
{
    public static void main(String[] args) 
    {
        int arr[] = new int[]{121, 88, 99, 106, 120};

        int max = arr[0];

        for (int i = 1; i < arr.length; i++) 
        {
            if (arr[i] > max) 
            {
                int temp = arr[i];
                arr[i] = max;
                max = temp;
            }
        }
        System.out.println("Largest Number in array: " + max);
    }
}
