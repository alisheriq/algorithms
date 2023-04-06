import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        /*
        //Task 1.
        int[] arr = {10, 1, 32, 3, 45};
        int min = findMin(arr, arr.length);
        System.out.println("Minimum is "+ min);

        @findMin - function to find minimum from array
        @arr - array of elements where need to find minimum
        @min - minimum of an array

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
        */


        /*
        //Task 2.
        int[] arr = {3, 2, 4, 1};
        double avg = findAvg(arr, arr.length);
        System.out.println("Average is "+ avg/arr.length);

        @findAvg - function to find average from array
        @arr - array of elements where need to find average
        @avg - average value of an array

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
         */

        /*
        //Task 3.
        int n = 10;
        int check = n;
        int count = 0;
        System.out.println(checkComp(n,check,count));

        @checkComp - function to check if number is Composite or prime
        @count - counter of total division % == 0
        @n - number to check for Composite of Prime
        @check - number to check division n times inside the function checkComp, it will decrease every iteration

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
         */

        /*
        //Task 4.
        int n = 5;
        System.out.println(findFactorial(n));

        @findFactorial - function that finds factorial
        @n - number of which need to find factorial

        public static int findFactorial(int n)
    {
        if(n == 1)
        {
            return 1;
        }
        else
        {
            return(n * findFactorial(n-1));
        }
    }
         */

        /*
        //Task 5.
        int n = 17;
        System.out.println(findFibonacci(n));

        @findFibonacci - function that find n-th term of Fibonacci sequence
        @n - number of n-th member of Fibonacci sequence

        public static int findFibonacci(int n)
    {
        if(n == 0 || n == 1)
        {
            return n;
        }
        else
        {
            return(findFibonacci(n - 1) + findFibonacci(n - 2));
        }
    }
         */

        /*
        //Task 6.
        int a = 2;
        int n = 10;
        System.out.println(findPower(a, n));

        @findPower - function that find n-th power of number a
        @a - number that will get into n-th power
        @n - number of power

        public static int findPower(int a, int n)
    {
        if(n == 1)
        {
            return a;
        }
        else
        {
            return(a * findPower(a,n-1));
        }
    }
         */

        /*
        //Task 7.
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        makeReverse(n);
        input.close();

        @makeReverse - function that reverses an array
        @n - size of an array
        @input - scanner to get an array

        public static void makeReverse(int n)
    {
        Scanner input = new Scanner(System.in);
        int result;
        if(n == 0) return;
        result = input.nextInt();
        makeReverse(n-1);
        System.out.print(result+" ");
        input.close();
    }
         */

        /*
        //Task 8.
        String s = "123a12";
        char[] ch = new char[s.length()];
        for (int i = 0; i < s.length(); i++)
        {
            ch[i] = s.charAt(i);
        }
        System.out.println(checkForDigits(ch, s.length() - 1));

        @s - string to check
        @ch - array from the string
        @checkForDigits - function that will check is string consists of digits

        public static String checkForDigits(char[] a, int n)
    {
        if(n >= 0)
        {
            if(a[n] >= 48 && a[n] <= 57)
            {
                return (checkForDigits(a, n - 1 ));
            }
            else
            {
                return("No");
            }
        }
        return("Yes");
    }
         */

        /*
        //Task 9.
        int n = 7;
        int k = 3;
        System.out.println(findBinomialCoef(n,k));

        @n - first number of binomial coefficient
        @k - second number of binomial coefficient
        @findBinomialCoef - function that find binomial coefficient

        public static int findBinomialCoef(int n, int k)
    {
        if(k == 0 || k == n)
        {
            return(1);
        }
        else
        {
            return (findBinomialCoef(n-1,k-1) + findBinomialCoef(n-1,k));
        }
    }
         */

        /*
        //Task 10.
        int a = 48;
        int b = 32;
        System.out.println(findGreatCommonDivision(a,b));

        @a - first number
        @b - second number
        @findGreatCommonDivision - function that will find GCD of two numbers

        public static int findGreatCommonDivision(int a, int b)
        {
            if(a % b == 0)
            {
                return (b);
            }
            else
            {
                return (findGreatCommonDivision(b, a % b));
            }
        }
         */

    }



















}