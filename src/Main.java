import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //1)
        //int[] arr = {10, 1, 32, 3, 45};
        //int min = findMin(arr, arr.length);
        //System.out.println("Minimum is "+ min);

        //2)
        //int[] arr = {3, 2, 4, 1};
        //double avg = findAvg(arr, arr.length);
        //System.out.println("Average is "+ avg/arr.length);

        //3)
        //int n = 10;
        //int check = n;
        //int count = 0;
        //System.out.println(checkComp(n,check,count));

        int n = 5;
        System.out.println(recur(n));
    }

    public static int recur(int n)
    {
        if(n == 1)
        {
            return 1;
        }
        else
        {
            return(n * recur(n-1));
        }
    }
    public static String checkComp(int n,int check, int count)
    {
        if(check != 0)
        {
            if(n % check == 0)
            {
                count += 1;
            }
        }
        else if(check == 0)
        {
            if(count == 2)
            {
                return "Prime";
            }
            else
            {
                return "Composite";
            }
        }
        return checkComp(n, check - 1, count);
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