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

        //4)
        //int n = 5;
        //System.out.println(recur(n));

        //5)
        //int n = 17;
        //System.out.println(fibonacci(n));

        //6)
        //int a = 2;
        //int n = 10;
        //System.out.println(power(a, n));

        //7)
        //Scanner input = new Scanner(System.in);
        //int n = input.nextInt();
        //reverse(n);
        //input.close();

        String s = "123a12";
        char[] ch = new char[s.length()];
        for (int i = 0; i < s.length(); i++)
        {
            ch[i] = s.charAt(i);
        }
        System.out.println(digits(ch, s.length() - 1));
    }

    public static String digits(char[] a, int n)
    {
        if(n >= 0)
        {
            if(a[n] >= 48 && a[n] <= 57)
            {
                return (digits(a, n - 1 ));
            }
            else
            {
                return("No");
            }
        }
        return("Yes");
    }

    public static void reverse(int n)
    {
        Scanner input = new Scanner(System.in);
        int result;
        if(n == 0) return;
        result = input.nextInt();
        reverse(n-1);
        System.out.print(result+" ");
        input.close();
    }

    public static int power(int a, int n)
    {
        if(n == 1)
        {
            return a;
        }
        else
        {
            return(a * power(a,n-1));
        }
    }

    public static int fibonacci(int n)
    {
        if(n == 0 || n == 1)
        {
            return n;
        }
        else
        {
            return(fibonacci(n - 1) + fibonacci(n - 2));
        }
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