import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //1)
        //int[] arr = {10, 1, 32, 3, 45};
        //int min = findMin(arr, arr.length);
        //System.out.println("Minimum is "+ min);

        int[] arr = {3, 2, 4, 1};
        double avg = findAvg(arr, arr.length);
        System.out.println("Average is "+ avg/arr.length);
    }

    public static int findAvg(int arr[], int n)
    {
        if(n==1)
        {
            return arr[0];
        }
        else
        {
            int sum = findAvg(arr, n-1);
            return sum + arr[n-1];
        }
    }
    public static int findMin(int arr[], int n)
    {
        if(n==1)
        {
            return arr[0];
        }
        else
        {
            int min = findMin(arr, n-1);
            return Math.min(min, arr[n-1]);
        }
    }



}